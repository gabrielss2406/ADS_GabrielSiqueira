package br.inatel.labs.padraosoa.model.entity;

import java.util.Objects;

/**
 * The Book class represents a book entity.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class Book {

    private Long id;
    private String title;
    private String category;

    /**
     * Constructs a new Book with the specified id, title, and category.
     *
     * @param id the unique identifier of the book
     * @param title the title of the book
     * @param category the category of the book
     */
    public Book(Long id, String title, String category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    /**
     * Generates a hash code value for the Book based on its id.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Indicates whether some other object is equal to this Book based on its id.
     *
     * @param obj the reference object with which to compare
     * @return true if this Book is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(id, other.id);
    }

    /**
     * Gets the id of the book.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id of the book.
     *
     * @param id the new id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the title of the book.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title the new title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the category of the book.
     *
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the book.
     *
     * @param category the new category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
}
