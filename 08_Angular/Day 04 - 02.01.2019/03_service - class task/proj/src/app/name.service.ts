import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class NameService {
  info = {
    name: null
  };


  setName(newName: string): void {
    this.info.name = newName;
  }
  
  constructor() { }
}
