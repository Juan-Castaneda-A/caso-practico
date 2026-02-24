import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un cliente de la librería.
 */
public class Client {
    private String name;
    private String id;
    private List<Book> purchasedBooks;

    public Client(String name, String id) {
        this.name = name;
        this.id = id;
        this.purchasedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Book> getPurchasedBooks() {
        return purchasedBooks;
    }

    public void addPurchasedBook(Book book) {
        this.purchasedBooks.add(book);
    }

    @Override
    public String toString() {
        return "Cliente: " + name + " (ID: " + id + ") - Libros comprados: " + purchasedBooks.size();
    }
}
