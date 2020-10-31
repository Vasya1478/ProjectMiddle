import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Page} from "../_model/page";
import {PageParams} from "../_model/page-params";
import {OneDoctor} from "../_model/one-doctor";

@Injectable({
  providedIn: 'root'
})
export class DoctorsService {

  constructor(private _httpClient: HttpClient) {
  }

  getDoctorList(sort: string, order: string, page: number, pageSize: number): Observable<Page> {
    const href = 'api/doctor/list';
    return this._httpClient.post<Page>(href, new PageParams(page * pageSize, pageSize, {
      orderBy:sort,
      orderDir:order
    }));
  }

  getDoctorByIdd(idd: number): Observable<OneDoctor> {
    const href = '/api/doctor/' + idd;

    return this._httpClient.get<OneDoctor>(href)
  }

  updateDoctor(idd: number, data: OneDoctor): Observable<Object> {
    const href = '/api/doctor/' + idd;
    return this._httpClient.patch(href, data);
  }

  createDoctor(data: OneDoctor): Observable<Object> {
    const href = '/api/doctor';
    return this._httpClient.post(href, data);
  }

  deleteDoctor(idd: number){
    const href = '/api/doctor/' + idd;
    return this._httpClient.delete(href).subscribe(data => {
      console.log(data);
    } );
  }
}
