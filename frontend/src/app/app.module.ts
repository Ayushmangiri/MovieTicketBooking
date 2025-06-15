import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { MovieListComponent } from './components/movie-list/movie-list.component';

@NgModule({
  declarations: [], // ❌ remove standalone components from here
  imports: [
    BrowserModule,
    HttpClientModule,
    AppComponent,           // ✅ standalone component
    MovieListComponent      // ✅ standalone component
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
