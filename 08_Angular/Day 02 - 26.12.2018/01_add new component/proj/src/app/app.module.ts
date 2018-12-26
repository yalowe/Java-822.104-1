import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CatComponent } from './cat/cat.component';
import { DogComponent } from './dog/dog.component';
import { AnimalsComponent } from './animals/animals.component';

@NgModule({
  //array that cotains all the classes of thw components in tha angular app
  declarations: [
    AppComponent,
    CatComponent,
    DogComponent,
    AnimalsComponent
  ],


  //in this array we add external "modules"
  imports: [
    BrowserModule
  ],


  //is to add services (we will not use this part)
  providers: [],


  //this array contains the componente that is the root (that is in the "index.html" page)
  bootstrap: [AppComponent]
})
export class AppModule { }
