import { Component, OnInit } from '@angular/core';
import { CountryService } from '../country.service';

@Component({
  selector: 'app-c1',
  templateUrl: './c1.component.html',
  styleUrls: ['./c1.component.css']
})
export class C1Component implements OnInit {

  myCountryInfo:any;

  
  // this is DI - now `myCountryService` points to the singleton that angular created in the root level
  constructor(private myCountryService:CountryService){
    this.myCountryInfo=this.myCountryService.countryInfo;
  }

  ngOnInit() {
  }

}
