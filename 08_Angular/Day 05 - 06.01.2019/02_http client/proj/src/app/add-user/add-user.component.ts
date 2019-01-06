import { Component, OnInit } from '@angular/core';
import { UsersService } from '../shared/services/users.service';
import { UserInfo } from '../shared/models/user-info.model';
import { Wrapper } from '../shared/models/wrapper.model';

@Component({
    selector: 'app-add-user',
    templateUrl: './add-user.component.html',
    styleUrls: []
})
export class AddUserComponent implements OnInit {

    myWrapperObject: Wrapper;
    newUser: UserInfo = {
        "name": "morpheus",
        "job": "leader"
    };
    constructor(private myUsersService: UsersService) {
       this.myWrapperObject = this.myUsersService.myInfo;
    }


    addUser(){
       this.myUsersService.addUser(this.newUser);
    }
    ngOnInit() {
    }

}
