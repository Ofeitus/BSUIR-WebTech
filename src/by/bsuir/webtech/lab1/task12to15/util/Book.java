package by.bsuir.webtech.lab1.task12to15.util;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Book book = (Book) obj;
        return title.equals(book.title) &&
                author.equals(book.author) &&
                price == book.price;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (title == null ? 0 : title.hashCode());
        result = 31 * result + (author == null ? 0 : author.hashCode());
        result = 31 * result + price;
        result = 31 * result + edition;
        return result;
    }

    @Override
    public String toString() {
        return title + " - " + author + ". Price: " + price;
    }
}
