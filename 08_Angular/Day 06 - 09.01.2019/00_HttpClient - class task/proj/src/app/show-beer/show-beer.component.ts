import { Component, OnInit } from '@angular/core';
import { BeerService } from '../shared/services/beer.service';

@Component({
  selector: 'app-show-beer',
  templateUrl: './show-beer.component.html',
  styleUrls: []
})
export class ShowBeerComponent implements OnInit {

  myBeerInfo:any;
  constructor(private myBeerService:BeerService) { 
    this.myBeerInfo=this.myBeerService.beerInfo;
  }

  ngOnInit() {
  }

}
