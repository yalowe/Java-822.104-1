import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { ViewUsersComponent } from './view-users/view-users.component';
import { AddUserComponent } from './add-user/add-user.component';
import { EditUserComponent } from './edit-user/edit-user.component';
import { DeleteUserComponent } from './delete-user/delete-user.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


// בחלק זה נגדיר בצורה פשוטה את ההגדרות הבאות:
//לכל הגדרת ניתוב ניתן את הנתיב המתאים לה, ואת הקומפוננטה שתוצג במקרה והנתיב הזה נבחר
const appRoutes: Routes = [
  { path: 'get', component: ViewUsersComponent },
  { path: 'add', component: AddUserComponent },
  { path: 'edit', component: EditUserComponent },
  { path: 'delete' , component:DeleteUserComponent },
  { path: '', redirectTo: '/get', pathMatch: 'full' },
  { path: '**', component:PageNotFoundComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    PageNotFoundComponent,
    ViewUsersComponent,
    AddUserComponent,
    EditUserComponent,
    DeleteUserComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
