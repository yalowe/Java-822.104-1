import { Component, OnInit } from '@angular/core';
import { Todo } from '../shared/models/todo.model';

@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: []
})
export class ShowComponent implements OnInit {


  todoList: Todo[] = [];

  constructor() {
    let prevList: string = localStorage.getItem("todo");
    if (prevList != null) {
      this.todoList = <Todo[]>(JSON.parse(prevList));
    }
  }

  ngOnInit() {
  }

}
