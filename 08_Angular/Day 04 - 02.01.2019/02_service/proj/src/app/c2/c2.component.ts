import { Component, OnInit } from '@angular/core';
import { Country } from '../country.model';
import { CountryService } from '../country.service';

@Component({
  selector: 'app-c2',
  templateUrl: './c2.component.html',
  styleUrls: ['./c2.component.css']
})
export class C2Component implements OnInit {

  // this is DI - now `myCountryService` points to the singleton that angular created in the root level
  constructor(private myCountryService:CountryService){}

  setSelcted(): void {
    let myCountry:Country;
    for(let x of this.countryList){
      if(this.selected==x.name){
        myCountry=x;
        break;
      }     
    }

    this.myCountryService.setSelctedCountry(myCountry);
  }


  selected: string;
  countryList: Country[] = [
    {
      "flag": "https://restcountries.eu/data/afg.svg",
      "name": "Afghanistan"
    },
    {
      "flag": "https://restcountries.eu/data/isr.svg",
      "name": "Israel"
    },
    {
      "flag": "https://restcountries.eu/data/alb.svg",
      "name": "Albania"
    }
  ];

 

  ngOnInit() {
  }

}
