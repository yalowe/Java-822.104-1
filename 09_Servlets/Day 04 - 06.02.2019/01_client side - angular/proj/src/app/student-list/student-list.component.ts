import { Component, OnInit } from '@angular/core';
import { StudentsService } from '../shared/services/students.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['']
})
export class StudentListComponent implements OnInit {

  public myLocalData:any;
  constructor(private myStudentsService:StudentsService) { 
      this.myLocalData=this.myStudentsService.data;
  }

  ngOnInit() {
  }

}
