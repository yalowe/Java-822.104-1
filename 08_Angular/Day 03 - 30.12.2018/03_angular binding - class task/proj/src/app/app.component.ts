import { Component } from '@angular/core';
import { Todo } from './todo.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: []
})
export class AppComponent {


  public setNewLength(): void {
    if (this.selectedLength < 0 || this.selectedLength > this.todoList.length) {
      alert(`${this.selectedLength} is not valid, please select 0-${this.todoList.length}`);
    }
    else {
      this.fillFilteredList();
    }
  }


  public fillFilteredList() {

    //clear the prev array
    this.filterList = [];

    //insert to the new array all the elemnts (that are in the wanted range) from the source array
    for (let i = 0; i < this.selectedLength; i++) {
      this.filterList.push(this.todoList[i]);
    }
  }

  constructor() {
    this.selectedLength = this.todoList.length;
    this.fillFilteredList();
  }

  public selectedLength: number;
  public filterList: Todo[];
  public todoList: Todo[] = [
    {
      "userId": 1,
      "id": 1,
      "title": "delectus aut autem",
      "completed": false
    },
    {
      "userId": 1,
      "id": 2,
      "title": "quis ut nam facilis et officia qui",
      "completed": false
    },
    {
      "userId": 1,
      "id": 3,
      "title": "fugiat veniam minus",
      "completed": false
    },
    {
      "userId": 1,
      "id": 4,
      "title": "et porro tempora",
      "completed": true
    },
    {
      "userId": 1,
      "id": 5,
      "title": "laboriosam mollitia et enim quasi adipisci quia provident illum",
      "completed": false
    },
    {
      "userId": 1,
      "id": 6,
      "title": "qui ullam ratione quibusdam voluptatem quia omnis",
      "completed": false
    },
    {
      "userId": 1,
      "id": 7,
      "title": "illo expedita consequatur quia in",
      "completed": false
    },
    {
      "userId": 1,
      "id": 8,
      "title": "quo adipisci enim quam ut ab",
      "completed": true
    },
    {
      "userId": 1,
      "id": 9,
      "title": "molestiae perspiciatis ipsa",
      "completed": false
    },
    {
      "userId": 1,
      "id": 10,
      "title": "illo est ratione doloremque quia maiores aut",
      "completed": true
    }
  ];
}
