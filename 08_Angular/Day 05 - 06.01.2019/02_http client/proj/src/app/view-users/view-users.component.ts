import { Component, OnInit } from '@angular/core';
import { UsersService } from '../shared/services/users.service';
import { RootObject } from '../shared/models/root-object.model';
import { Wrapper } from '../shared/models/wrapper.model';


@Component({
    selector: 'app-view-users',
    templateUrl: './view-users.component.html',
    styleUrls: []
})
export class ViewUsersComponent implements OnInit {

    myWrapperObject: Wrapper;

    constructor(private myUsersService: UsersService) { 
        
       this.myWrapperObject=this.myUsersService.myInfo;
    }

    ngOnInit() {
    }

}
