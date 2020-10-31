import {AfterViewInit, Component, OnInit, ViewChild} from '@angular/core';
import {Doctors} from "../_model/doctors";
import {SelectionModel} from "@angular/cdk/collections";
import {MatPaginator} from "@angular/material/paginator";
import {MatSort} from "@angular/material/sort";
import {MatDialog} from "@angular/material/dialog";
import {merge, of as observableOf} from "rxjs";
import {catchError, map, startWith, switchMap} from "rxjs/operators";
import {Journal} from "../_model/journal";

@Component({
  selector: 'app-journal',
  templateUrl: './journal.component.html',
  styleUrls: ['./journal.component.scss']
})
export class JournalComponent implements AfterViewInit {

  sizeOption: number[] = [2, 5, 10];
  displayedColumns: string[] = ['select', 'idd', 'dateOfReceipt',
    'cardNumberId', 'patientName', 'doctorNameId',
    'doctorPost', 'serviceId', 'createDate'];
  data: Journal[];
  selection = new SelectionModel<Journal>(false, []);
  resultsLength = 0;
  isLoadingResults = true;
  isRateLimitReached = false;

  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  constructor(private _journalService: JournalService, public dialog: MatDialog) {}

  ngAfterViewInit() {

    this.sort.sortChange.subscribe(() => this.paginator.pageIndex = 0);
    this.refresh();

  }

  // openEditDialog() {
  //   const dialogRef = this.dialog.open(RoomEditDialogComponent, {
  //     width: '750px',
  //     data: this.selection.selected[0]?.idd,
  //   });

  //   dialogRef.afterClosed().subscribe(result => {
  //     this.refresh();
  //   });
  // }

  deleteEntity() {
    if (this.selection.selected[0] == null) {
      return;
    }
    this._journalService.deleteJournal(this.selection.selected[0].idd);

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
          return this._journalService.getJournalList(
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
