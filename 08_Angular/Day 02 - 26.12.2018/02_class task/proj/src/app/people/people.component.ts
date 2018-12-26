import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-people',
  templateUrl: './people.component.html',
  styleUrls: ['./people.component.css']
})
export class PeopleComponent implements OnInit {

  person: string = "none";

  public arr: any[] = [
    {
      "first_name": "Eve",
      "last_name": "Holt",
      "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg"
    },
    {
      "first_name": "Charles",
      "last_name": "Morris",
      "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/stephenmoon/128.jpg"
    },
    {
      "first_name": "Tracey",
      "last_name": "Ramos",
      "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg"
    }
  ];


  public setPerson(newName: string): void {
    this.person = newName;
  }
  
  constructor() { }

  ngOnInit() {
  }

}
