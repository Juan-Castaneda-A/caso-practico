import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que gestiona el catálogo de libros y las ventas.
 */
public class Bookstore {
    private List<Book> catalog;

    public Bookstore() {
        this.catalog = new ArrayList<>();
    }

    /**
     * Agrega un nuevo libro al catálogo.
     */
    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Libro agregado al catálogo: " + book.getTitle());
    }

    /**
     * Busca libros por su título.
     */
    public List<Book> searchByTitle(String title) {
        return catalog.stream()
                .filter(b -> b.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }

    /**
     * Busca libros por el nombre de un autor.
     */
    public List<Book> searchByAuthor(String authorName) {
        return catalog.stream()
                .filter(b -> b.getAuthors().stream()
                        .anyMatch(a -> a.getName().toLowerCase().contains(authorName.toLowerCase())))
                .collect(Collectors.toList());
    }

    /**
     * Vende un libro a un cliente.
     */
    public void sellBook(Book book, Client client) {
        if (catalog.contains(book)) {
            catalog.remove(book);
            client.addPurchasedBook(book);
            System.out.println("Venta realizada: '" + book.getTitle() + "' vendido a " + client.getName());
        } else {
            System.out.println("Error: El libro '" + book.getTitle() + "' no está disponible en el catálogo.");
        }
    }

    public List<Book> getCatalog() {
        return catalog;
    }
}
