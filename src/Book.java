import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que representa la base de un libro.
 */
public abstract class Book {
    private String title;
    private String isbn;
    private double price;
    private int publicationYear;
    private List<Author> authors;

    public Book(String title, String isbn, double price, int publicationYear) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.publicationYear = publicationYear;
        this.authors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        if (!authors.contains(author)) {
            authors.add(author);
            author.addBook(this); // Mantener relación bidireccional
        }
    }

    @Override
    public String toString() {
        return "Libro: " + title + " (ISBN: " + isbn + ")";
    }
}
