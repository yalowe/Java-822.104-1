import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from '../models/student.model';

@Injectable({
  providedIn: 'root'
})
export class StudentsService {
  public data: any = { 
    students: [],
    student:undefined
   };



  private url:string="http://localhost:8080/00_Full_student_project/StudentServlet";
  constructor(private myHttpClient: HttpClient) {
    this.getAllStudents()
  }

  public getAllStudents(): void {
    this.myHttpClient.get<Student[]>(this.url)
      .subscribe(
        (res) => { this.data.students = res; },
        (err) => { console.log(err); }
      );
  }



  public getStudent(studentName:string): void {
    this.myHttpClient.get<Student>(this.url+`?name=${studentName}`)
      .subscribe(
        (res) => { this.data.student = res; },
        (err) => { console.log(err); }
      );
  }
}
