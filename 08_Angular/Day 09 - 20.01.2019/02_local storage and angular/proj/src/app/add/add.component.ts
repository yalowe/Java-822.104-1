import { Component, OnInit } from '@angular/core';
import { Todo } from '../shared/models/todo.model';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: []
})
export class AddComponent implements OnInit {

  todoItem: Todo = new Todo();

  addTaskToLocal() {
    let todoList: Todo[] = [];
    let prevList: string = localStorage.getItem("todo");
    if (prevList != null) {
      todoList = <Todo[]>(JSON.parse(prevList));
    }

    todoList.push(this.todoItem);
    localStorage.setItem("todo",JSON.stringify(todoList));
    
    
    this.todoItem.taskContent=undefined;
    this.todoItem.taskDuration=undefined;
  }


  ngOnInit() {
  }

}
