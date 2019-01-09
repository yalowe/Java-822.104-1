import { Component, OnInit } from '@angular/core';
import { BeerService } from '../shared/services/beer.service';

@Component({
  selector: 'app-selected-beer',
  templateUrl: './selected-beer.component.html',
  styleUrls: ['./selected-beer.component.css']
})
export class SelectedBeerComponent implements OnInit {

  selectedId:number=1;

  constructor(private myBeerService:BeerService) { }


  setSelctedBeer(){
    this.myBeerService.getSpecificBeer(this.selectedId);
  }

  ngOnInit() {
  }

}
