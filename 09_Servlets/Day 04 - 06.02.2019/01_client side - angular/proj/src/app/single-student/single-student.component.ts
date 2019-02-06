import { Component, OnInit } from '@angular/core';
import { StudentsService } from '../shared/services/students.service';

@Component({
  selector: 'app-single-student',
  templateUrl: './single-student.component.html',
  styleUrls: ['./single-student.component.css']
})
export class SingleStudentComponent implements OnInit {

  firstName: string;
  public myLocalData: any;

  constructor(private myStudentsService: StudentsService) {
    this.myLocalData = this.myStudentsService.data;
  }


  public getGrade(): void {
    this.myStudentsService.getStudent(this.firstName);
  }
  ngOnInit() {
  }

}
