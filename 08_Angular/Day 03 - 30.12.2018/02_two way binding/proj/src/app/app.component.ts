import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public userName: string = "Bob";
  public userAge: number = 20;



  public incAge(): void {
    this.userAge++;
  }


  public updateName(newName:string): void {
    this.userName = newName;
  }
}
