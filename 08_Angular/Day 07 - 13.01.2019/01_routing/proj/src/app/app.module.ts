import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';

//בחלק זה נגדיר בצורה פשוטה את ההגדרות הבאות:
//לכל הגדרת ניתוב ניתן את הנתיב המתאים לה,
//ואת הקומפוננטה שתוצג במקרה והנתיב הזה נבחר
const appRoutes: Routes = [ 
  { path: 'home', component: HomeComponent }, 
  { path: 'contact', component: ContactComponent }, 
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
