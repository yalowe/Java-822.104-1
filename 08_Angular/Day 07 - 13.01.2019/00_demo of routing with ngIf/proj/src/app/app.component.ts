import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: []
})
export class AppComponent {
  public currentState:string="Home";

 public setState(newState:string):void{
   this.currentState=newState;
 }
}
