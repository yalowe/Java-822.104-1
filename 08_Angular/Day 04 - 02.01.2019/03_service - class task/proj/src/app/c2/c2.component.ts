import { Component, OnInit } from '@angular/core';
import { NameService } from '../name.service';

@Component({
  selector: 'app-c2',
  templateUrl: './c2.component.html',
  styleUrls: []
})
export class C2Component implements OnInit {

  newName: string;
  constructor(private myNameService: NameService) { }


  setName(): void {
    this.myNameService.setName(this.newName);
  }
  ngOnInit() {
  }

}
