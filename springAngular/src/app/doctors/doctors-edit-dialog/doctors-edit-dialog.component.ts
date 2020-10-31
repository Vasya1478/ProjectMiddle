import {Component, Inject, OnInit} from '@angular/core';
import {OneDoctor} from "../../_model/one-doctor";
import {SelectionModel} from "@angular/cdk/collections";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {DoctorsService} from "../../_service/doctors.service";

@Component({
  selector: 'app-doctors-edit-dialog',
  templateUrl: './doctors-edit-dialog.component.html',
  styleUrls: ['./doctors-edit-dialog.component.scss']
})
export class DoctorsEditDialogComponent implements OnInit {
  data: OneDoctor = new OneDoctor();

  selection = new SelectionModel(false, []);
  historyDisplayedColumns: string [] = ['id','employeeCode',
    'name', 'positionId', 'cabinetNumber', 'deleteDate'];
  showHistoryTable: boolean = false;

  constructor(
    private _doctorsService: DoctorsService,
    public dialogRef: MatDialogRef<DoctorsEditDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public idd: number,
    public dialog: MatDialog) {}

  ngOnInit(): void {
    if (this.idd) {
      this._doctorsService.getDoctorByIdd(this.idd)
        .pipe()
        .subscribe(doctors => {this.data = doctors});
    }

  }

  setShowHistoryTable() {
    this.showHistoryTable = !this.showHistoryTable;
  }

  onCancelClick() {
    this.dialogRef.close();
  }

  onSaveClick() {
    if (this.idd) {
      this._doctorsService.updateDoctor(this.idd, this.data)
        .toPromise()
        .then(res => this.dialogRef.close())
        .catch(error => console.log(error));
    } else {
      this._doctorsService.createDoctor(this.data)
        .toPromise()
        .then(res => this.dialogRef.close())
        .catch(error => console.log(error));
    }

  }
}
