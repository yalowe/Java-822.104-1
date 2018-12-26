import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dog',
  templateUrl: './dog.component.html',
  styleUrls: ['./dog.component.css']
})
export class DogComponent implements OnInit {

  public name: string = "Clarc";
  public age:number = 4;

  constructor() { }

  ngOnInit() {
  }

}
