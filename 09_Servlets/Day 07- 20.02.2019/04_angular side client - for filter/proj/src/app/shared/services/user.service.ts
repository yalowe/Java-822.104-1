import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private myHttpClient:HttpClient) { }

  public sendLoginReq(name:string,password:string):void{
    let url=`http://localhost:8080/03_filters/AuthenticationServlet?command=login&username=${name}&password=${password}`
    this.myHttpClient.get<any>(url).subscribe(
        (res)=>{console.log(res)},
        (err)=>{console.log(err)}
    );
  }
}
