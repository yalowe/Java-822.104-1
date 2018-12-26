import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  public isMale:boolean=true;
  
  public firstName: string = "Bob";

  public hobbies:string[]=["Math","Java"];

  private myDate: Date = new Date();

  public getYear(): number {
    return this.myDate.getFullYear();
  }




}
