import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DoctorsComponent} from "./doctors/doctors.component";
import {JournalComponent} from "./journal/journal.component";
import {PatientsComponent} from "./patients/patients.component";

const routes: Routes = [
  {path: 'doctors', component: DoctorsComponent},
  {path: 'journal', component: JournalComponent},
  {path: 'patients', component: PatientsComponent},

  {path: '**', redirectTo:'/journal'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
