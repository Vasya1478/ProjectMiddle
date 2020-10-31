import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { DoctorsComponent } from './doctors/doctors.component';
import { JournalComponent } from './journal/journal.component';
import { PatientsComponent } from './patients/patients.component';
import {HttpClientModule} from "@angular/common/http";
import { DoctorsEditDialogComponent } from './doctors/doctors-edit-dialog/doctors-edit-dialog/doctors-edit-dialog.component';

@NgModule({
  declarations: [
    AppComponent,
    DoctorsComponent,
    JournalComponent,
    PatientsComponent,
    DoctorsEditDialogComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
