import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un autor de libros.
 */
public class Author {
    private String name;
    private String nationality;
    private List<Book> books;

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    @Override
    public String toString() {
        return name + " (" + nationality + ")";
    }
}
