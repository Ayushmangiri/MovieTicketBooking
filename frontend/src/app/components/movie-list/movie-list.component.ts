import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-movie-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent {
  movies = [
    { title: 'Animal', language: 'Hindi', genre: 'Action' },
    { title: 'Interstellar', language: 'English', genre: 'Sci-Fi' },
    { title: '3 Idiots', language: 'Hindi', genre: 'Comedy' }
  ];
}
