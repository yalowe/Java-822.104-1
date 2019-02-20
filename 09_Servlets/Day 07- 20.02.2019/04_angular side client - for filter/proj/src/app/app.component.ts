import { Component } from '@angular/core';
import { UserService } from './shared/services/user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  

  constructor(private myUserService:UserService){}
  firstName:string;
  password:string;
  
   login(){
       this.myUserService.sendLoginReq(this.firstName,this.password);
   }

}
