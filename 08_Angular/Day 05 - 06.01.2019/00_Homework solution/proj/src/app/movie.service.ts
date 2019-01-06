import { Injectable } from '@angular/core';
import { Movie } from './movie.model';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  movieInfo={
    selected:null
  };

  public saveSelectedMovie(newMovie: Movie): void {
    this.movieInfo.selected=newMovie;
  }
}
