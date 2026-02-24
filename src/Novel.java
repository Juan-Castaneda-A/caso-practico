/**
 * Representa una novela, con un género específico.
 */
public class Novel extends Book {
    private String genre;

    public Novel(String title, String isbn, double price, int publicationYear, String genre) {
        super(title, isbn, price, publicationYear);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return super.toString() + " [Novela - Género: " + genre + "]";
    }
}
