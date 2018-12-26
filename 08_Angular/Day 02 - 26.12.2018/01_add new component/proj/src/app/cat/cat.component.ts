import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cat',
  templateUrl: './cat.component.html',
  styleUrls: ['./cat.component.css']
})
export class CatComponent implements OnInit {

  public name: string = "Tom";
  public age:number = 10;
  public imgUrl="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/1200px-Cat03.jpg";
  public tableBorder=1;
  
  constructor() { }

  ngOnInit() {
  }

}
