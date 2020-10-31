import { Component, OnInit } from '@angular/core';
import {Component, ViewChild, AfterViewInit} from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import {MatSort} from '@angular/material/sort';
import {merge, Observable, of as observableOf} from 'rxjs';
import {catchError, map, startWith, switchMap} from 'rxjs/operators';
import {DoctorsService} from "../_service/doctors.service";
import {DoctorsEditDialogComponent} from "./doctors-edit-dialog/doctors-edit-dialog.component";
import {MatDialog} from "@angular/material/dialog";
import {SelectionModel} from "@angular/cdk/collections";
import {Doctors} from "../_model/doctors";

@Component({
  selector: 'app-doctors',
  templateUrl: './doctors.component.html',
  styleUrls: ['./doctors.component.scss']
})
export class DoctorsComponent implements AfterViewInit {

  sizeOption: number[] = [2, 5, 10];
  displayedColumns: string[] = ['select', 'idd', 'employeeCode',
    'name', 'positionId', 'cabinetNumber',
    'timeOfReceiptId', 'typeOfServiceId', 'createDate'];
  data: Doctors[];
  selection = new SelectionModel<Doctors>(false, []);
  resultsLength = 0;
  isLoadingResults = true;
  isRateLimitReached = false;

  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  constructor(private _doctorsService: DoctorsService, public dialog: MatDialog) {}

  ngAfterViewInit() {

    this.sort.sortChange.subscribe(() => this.paginator.pageIndex = 0);
    this.refresh();

  }

  openEditDialog() {
    const dialogRef = this.dialog.open(DoctorsEditDialogComponent, {
      width: '750px',
      data: this.selection.selected[0]?.idd,
    });

    dialogRef.afterClosed().subscribe(result => {
      this.refresh();
    });
  }

  deleteEntity() {
    if (this.selection.selected[0] == null) {
      return;
    }
    this._doctorsService.deleteDoctor(this.selection.selected[0].idd);

    this.refresh();
    this.selection.clear();
    this.refresh();
  }

  refresh() {
    merge(this.sort.sortChange, this.paginator.page)
      .pipe(
        startWith({}),
        switchMap(() => {
          this.isLoadingResults = true;
          return this._doctorsService.getDoctorList(
            this.sort.active, this.sort.direction, this.paginator.pageIndex, this.paginator.pageSize);
        }),
        map(data => {
          // Flip flag to show that loading has finished.
          this.isLoadingResults = false;
          this.isRateLimitReached = false;
          this.resultsLength = data.totalCount;

          return data.list;
        }),
        catchError(() => {
          this.isLoadingResults = false;
          // Catch if the GitHub API has reached its rate limit. Return empty data.
          this.isRateLimitReached = true;
          return observableOf([]);
        })
      ).subscribe(data => this.data = data);
  }
}
