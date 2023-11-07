package br.inatel.labs.padraosoa.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import br.inatel.labs.padraosoa.model.entity.Book;
import jakarta.annotation.PostConstruct;

@Service
public class BookService {
	private List<Book> bookList = new ArrayList<Book>();
	
	@PostConstruct
	private void setup() {
		Book b1 = new Book(1L, "Delphin Blanck", "Contos");
		Book b3 = new Book(2L, "Python com matemática", "Programação");
		Book b2 = new Book(3L, "Cozinha Mineira", "Culinária");
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
	}
	
	public List<Book> findAll() {
		return this.bookList;
	}
	
	public Optional<Book> findById(Long id) {
	    return this.bookList.stream()
	    		.filter(b -> b.getId().equals(id) )
	    		.findFirst();
	}
	
	public Book create(Book book) {
		Long id = new Random().nextLong();
		book.setId(id);
		this.bookList.add(book);
		return book;
	}
	
	public void update(Book book) {
		this.bookList.remove(book);
		this.bookList.add(book);
	}
	
	public void delete(Book book) {
		this.bookList.remove(book);
	}
}
