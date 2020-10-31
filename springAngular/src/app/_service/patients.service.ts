import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Page} from "../_model/page";
import {PageParams} from "../_model/page-params";
import {OnePatient} from "../_model/one-patient";

@Injectable({
  providedIn: 'root'
})
export class PatientsService {

  constructor(private _httpClient: HttpClient) {
  }

  getPatientList(sort: string, order: string, page: number, pageSize: number): Observable<Page> {
    const href = 'api/patient/list';
    return this._httpClient.post<Page>(href, new PageParams(page * pageSize, pageSize, {
      orderBy:sort,
      orderDir:order
    }));
  }

  getPatientByIdd(idd: number): Observable<OnePatient> {
    const href = '/api/patient/' + idd;

    return this._httpClient.get<OnePatient>(href)
  }

  updatePatient(idd: number, data: OnePatient): Observable<Object> {
    const href = '/api/patient/' + idd;
    return this._httpClient.patch(href, data);
  }

  createPatient(data: OnePatient): Observable<Object> {
    const href = '/api/patient';
    return this._httpClient.post(href, data);
  }

  deletePatient(idd: number){
    const href = '/api/patient/' + idd;
    return this._httpClient.delete(href).subscribe(data => {
      console.log(data);
    } );
  }
}
