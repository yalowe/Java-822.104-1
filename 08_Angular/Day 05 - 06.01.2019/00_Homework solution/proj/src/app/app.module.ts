import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MovieListComponent } from './movie-list/movie-list.component';
import { SelectedMoveComponent } from './selected-move/selected-move.component';

@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent,
    SelectedMoveComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
