import { Component } from '@angular/core';
import { BookService } from 'src/app/services/book.service';
import { IBook } from 'src/app/models/i-book';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.scss']
})
export class BookTableComponent {

  books: IBook[] = [];

  constructor(private service: BookService) { }

  ngOnInit(): void {
    this.service.findAll().subscribe({
      next: (data) => this.books = data,
      error: (err) => console.error(err)
    });

    //apenas para debug:
    for (let b of this.books) {
      console.log(b.id);
      console.log(b.title);
      console.log(b.category);
    }
  }
}
