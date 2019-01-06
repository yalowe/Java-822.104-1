import { Component, OnInit } from '@angular/core';
import { MovieService } from '../movie.service';

@Component({
  selector: 'app-selected-move',
  templateUrl: './selected-move.component.html',
  styleUrls: ['./selected-move.component.css']
})
export class SelectedMoveComponent implements OnInit {

  myMovieInfo:any;
  constructor(private myMovieService:MovieService){
    this.myMovieInfo=this.myMovieService.movieInfo;
  }


  ngOnInit() {
  }

}
