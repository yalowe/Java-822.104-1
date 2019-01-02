import { Component, OnInit } from '@angular/core';
import { NameService } from '../name.service';

@Component({
  selector: 'app-c1',
  templateUrl: './c1.component.html',
  styleUrls: []
})
export class C1Component implements OnInit {

  myInfo: any;
  constructor(private myNameService: NameService) {
    this.myInfo = this.myNameService.info;
  }

  ngOnInit() {
  }

}
