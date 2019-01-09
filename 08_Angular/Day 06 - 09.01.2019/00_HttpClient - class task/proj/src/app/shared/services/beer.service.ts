import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Beer } from '../models/beer.model';

@Injectable({
  providedIn: 'root'
})
export class BeerService {
  beerInfo: any = {
    "selected": null
  }
  constructor(private myHttpClient: HttpClient) { }


  getSpecificBeer(beerId: number): void {
    this.myHttpClient.get<Beer[]>("https://api.punkapi.com/v2/beers/" + beerId)
      .subscribe(
        (res) => { this.beerInfo.selected = res[0] },
        (err) => { console.log(err); }
      )
  }
}
