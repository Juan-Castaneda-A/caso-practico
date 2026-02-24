import java.util.List;

/**
 * Clase de prueba para el Sistema de Gestión de Librería.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Inicializar Librería
        Bookstore store = new Bookstore();

        // 2. Crear Autores
        Author author1 = new Author("Gabriel García Márquez", "Colombiano");
        Author author2 = new Author("George Orwell", "Británico");
        Author author3 = new Author("James Stewart", "Canadiense");

        // 3. Crear Libros
        Novel novel1 = new Novel("Cien años de soledad", "978-0307474728", 25.99, 1967, "Realismo Mágico");
        novel1.addAuthor(author1);

        Novel novel2 = new Novel("1984", "978-0451524935", 15.50, 1949, "Distopía");
        novel2.addAuthor(author2);

        Textbook textBook1 = new Textbook("Cálculo de una variable", "978-0538497831", 120.00, 2012, "Universidad");
        textBook1.addAuthor(author3);

        // 4. Agregar al catálogo
        store.addBook(novel1);
        store.addBook(novel2);
        store.addBook(textBook1);

        // 5. Mostrar catálogo inicial
        System.out.println("\n--- Catálogo Inicial ---");
        store.getCatalog().forEach(System.out::println);

        // 6. Realizar Búsquedas
        System.out.println("\n--- Buscando '1984' ---");
        List<Book> foundByTitle = store.searchByTitle("1984");
        foundByTitle.forEach(System.out::println);

        System.out.println("\n--- Buscando libros de 'Márquez' ---");
        List<Book> foundByAuthor = store.searchByAuthor("Márquez");
        foundByAuthor.forEach(System.out::println);

        // 7. Simular Ventas
        Client client1 = new Client("Juan Pérez", "C001");
        System.out.println("\n--- Vendiendo libro a " + client1.getName() + " ---");
        store.sellBook(novel1, client1);

        // 8. Verificar estado final
        System.out.println("\n--- Estado del Cliente ---");
        System.out.println(client1);
        client1.getPurchasedBooks().forEach(b -> System.out.println("  - " + b.getTitle()));

        System.out.println("\n--- Catálogo Final ---");
        store.getCatalog().forEach(System.out::println);
    }
}
