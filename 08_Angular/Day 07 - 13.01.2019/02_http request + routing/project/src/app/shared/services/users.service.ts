import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { RootObject } from '../models/root-object.model';
import { UserInfo } from '../models/user-info.model';
import { Wrapper } from '../models/wrapper.model';



@Injectable({
    providedIn: 'root'
})
export class UsersService {

    public myInfo:Wrapper=new Wrapper();
   
    // DI - to get a pointer to the singleton service "HttpClient" (that comes with methods to perform HTTP requests)
    constructor(private myHttpClient: HttpClient) { 
        this.getUsers();
    }

    public getUsers() {
        this.myHttpClient
            .get<RootObject>("https://reqres.in/api/users?page=2")
            .subscribe(
                res => {
                  this.myInfo.getData=res;
                },
                err=>{console.log(err)}
            )
    }

    public addUser(newUser:UserInfo) {
        this.myHttpClient
            .post<UserInfo>("https://reqres.in/api/users",newUser)
            .subscribe(
                res => {
                    this.myInfo.postData=res;
                },
                err=>{console.log(err)}
            )
    }

    public editUser(editedUser:UserInfo,id:number) {
        this.myHttpClient
            .put<UserInfo>(`https://reqres.in/api/users/${id}`,editedUser)
            .subscribe(
                res => {
                    this.myInfo.putData=res;
                },
                err=>{console.log(err)}
            )
    }

    public deleteUser(id:number) {
        this.myHttpClient
            .delete(`https://reqres.in/api/users/${id}`)
            .subscribe(
                res => {console.log(res)},
                err=>{console.log(err)}
            )
    }
}
