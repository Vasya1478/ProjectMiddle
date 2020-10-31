import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Page} from "../_model/page";
import {PageParams} from "../_model/page-params";
import {OneJournal} from "../_model/one-journal";

@Injectable({
  providedIn: 'root'
})
export class JournalService {

  constructor(private _httpClient: HttpClient) {
  }

  getJournalList(sort: string, order: string, page: number, pageSize: number): Observable<Page> {
    const href = 'api/journal/list';
    return this._httpClient.post<Page>(href, new PageParams(page * pageSize, pageSize, {
      orderBy:sort,
      orderDir:order
    }));
  }

  getJournalByIdd(idd: number): Observable<OneJournal> {
    const href = '/api/journal/' + idd;

    return this._httpClient.get<OneJournal>(href)
  }

  updateJournal(idd: number, data: OneJournal): Observable<Object> {
    const href = '/api/journal/' + idd;
    return this._httpClient.patch(href, data);
  }

  createJournal(data: OneJournal): Observable<Object> {
    const href = '/api/journal';
    return this._httpClient.post(href, data);
  }

  deleteJournal(idd: number){
    const href = '/api/journal/' + idd;
    return this._httpClient.delete(href).subscribe(data => {
      console.log(data);
    } );
  }
}
