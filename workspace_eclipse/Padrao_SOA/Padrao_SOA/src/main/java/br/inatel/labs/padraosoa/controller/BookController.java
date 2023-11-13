package br.inatel.labs.padraosoa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.inatel.labs.padraosoa.model.service.BookService;
import br.inatel.labs.padraosoa.model.entity.Book;

/**
 * The BookController class handles HTTP requests related to books.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    /**
     * Retrieves the list of all books.
     *
     * @return the list of books
     */
    @GetMapping
    public List<Book> getAllBooks() {
        return this.service.findAll();
    }

    /**
     * Retrieves a book by its unique identifier.
     *
     * @param bookId the unique identifier of the book
     * @return the book with the specified id
     * @throws ResponseStatusException if the book is not found
     */
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long bookId) {
        Optional<Book> opBook = this.service.findById(bookId);

        if (opBook.isPresent()) {
            return opBook.get();
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found with id: " + bookId);
    }

    /**
     * Creates a new book.
     *
     * @param book the book to create
     * @return the created book
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book postBook(@RequestBody Book book) {
        Book createdBook = this.service.create(book);
        return createdBook;
    }

    /**
     * Updates an existing book.
     *
     * @param book the book to update
     */
    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putBook(@RequestBody Book book) {
        this.service.update(book);
    }

    /**
     * Deletes a book by its unique identifier.
     *
     * @param bookId the unique identifier of the book to delete
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBookBy(@PathVariable("id") Long bookId) {
        Book foundBook = this.getBookById(bookId);
        this.service.delete(foundBook);
    }
}
