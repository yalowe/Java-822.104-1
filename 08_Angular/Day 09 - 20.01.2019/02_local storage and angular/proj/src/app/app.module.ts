import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { ShowComponent } from './show/show.component';
import { AddComponent } from './add/add.component';


const appRoutes: Routes = [
  { path: 'add', component: AddComponent },
  { path: 'show', component: ShowComponent },
  { path: '', redirectTo: '/show',pathMatch: 'full'}
  ];


@NgModule({
  declarations: [
    AppComponent,
    ShowComponent,
    AddComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
