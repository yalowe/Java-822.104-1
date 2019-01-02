import { Injectable } from '@angular/core';
import { Country } from './country.model';


// Singleton - in root level (one instance that is shared by all components)
@Injectable({
  providedIn: 'root'
})
export class CountryService {
  
  public countryInfo:any={
    selected:null
  };

  public setSelctedCountry(newCountry:Country):void{
    this.countryInfo.selected=newCountry;
  }

}
