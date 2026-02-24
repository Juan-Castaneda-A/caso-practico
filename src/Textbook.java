/**
 * Representa un libro de texto, con un nivel educativo.
 */
public class Textbook extends Book {
    private String educationalLevel;

    public Textbook(String title, String isbn, double price, int publicationYear, String educationalLevel) {
        super(title, isbn, price, publicationYear);
        this.educationalLevel = educationalLevel;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " [Libro de Texto - Nivel: " + educationalLevel + "]";
    }
}
