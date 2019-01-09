import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { SelectedBeerComponent } from './selected-beer/selected-beer.component';
import { ShowBeerComponent } from './show-beer/show-beer.component';

@NgModule({
  declarations: [
    AppComponent,
    SelectedBeerComponent,
    ShowBeerComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
