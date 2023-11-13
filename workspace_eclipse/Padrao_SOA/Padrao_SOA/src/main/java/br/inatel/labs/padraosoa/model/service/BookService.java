package br.inatel.labs.padraosoa.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import br.inatel.labs.padraosoa.model.entity.Book;
import jakarta.annotation.PostConstruct;

/**
 * The BookService class provides business logic for managing books.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
@Service
public class BookService {

    private List<Book> bookList = new ArrayList<Book>();

    /**
     * Initializes the list of books with some sample data.
     */
    @PostConstruct
    private void setup() {
        Book b1 = new Book(1L, "Delphin Blanck", "Contos");
        Book b3 = new Book(2L, "Python com matemática", "Programação");
        Book b2 = new Book(3L, "Cozinha Mineira", "Culinária");
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
    }

    /**
     * Retrieves the list of all books.
     *
     * @return the list of books
     */
    public List<Book> findAll() {
        return this.bookList;
    }

    /**
     * Finds a book by its unique identifier.
     *
     * @param id the unique identifier of the book
     * @return an optional containing the found book, or empty if not found
     */
    public Optional<Book> findById(Long id) {
        return this.bookList.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
    }

    /**
     * Creates a new book with a randomly generated ID.
     *
     * @param book the book to create
     * @return the created book
     */
    public Book create(Book book) {
        Long id = new Random().nextLong();
        book.setId(id);
        this.bookList.add(book);
        return book;
    }

    /**
     * Updates an existing book.
     *
     * @param book the book to update
     */
    public void update(Book book) {
        this.bookList.remove(book);
        this.bookList.add(book);
    }

    /**
     * Deletes a book.
     *
     * @param book the book to delete
     */
    public void delete(Book book) {
        this.bookList.remove(book);
    }
}
