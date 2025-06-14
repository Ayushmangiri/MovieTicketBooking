import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { MovieListComponent } from './components/movie-list/movie-list.component';

imports: [
  BrowserModule,
  HttpClientModule
]

@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent
  ],
  imports: [
    BrowserModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
