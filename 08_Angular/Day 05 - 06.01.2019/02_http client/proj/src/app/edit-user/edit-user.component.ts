import { Component, OnInit } from '@angular/core';
import { UserInfo } from '../shared/models/user-info.model';
import { UsersService } from '../shared/services/users.service';
import { Wrapper } from '../shared/models/wrapper.model';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: []
})
export class EditUserComponent implements OnInit {

    myWrapperObject: Wrapper;

    editUser: UserInfo = {
        "name": "morpheus",
        "job": "leader",
        "id":"2"
    };
    constructor(private myUsersService: UsersService) {
        this.myWrapperObject = this.myUsersService.myInfo;
    }


    updateUser(){
        this.myUsersService.editUser(this.editUser, Number(this.editUser.id));
    }

  ngOnInit() {
  }

}
