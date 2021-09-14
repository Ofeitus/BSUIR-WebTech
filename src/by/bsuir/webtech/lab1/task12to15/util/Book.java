package by.bsuir.webtech.lab1.task12to15.util;

import java.util.Comparator;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book book = new Book();
        book.title = this.title;
        book.author = this.author;
        book.price = this.price;
        book.isbn = this.isbn;
        return book;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Book book = (Book) obj;
        return this.title.equals(book.title) &&
                this.author.equals(book.author) &&
                this.price == book.price &&
                this.isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (this.title == null ? 0 : this.title.hashCode());
        result = 31 * result + (this.author == null ? 0 : this.author.hashCode());
        result = 31 * result + this.price;
        result = 31 * result + edition;
        result = 31 * result + this.isbn;
        return result;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.author + ". Price: " + this.price + ", ISBN: " + this.isbn;
    }

    @Override
    public int compareTo(Book book) {
        return this.isbn - book.isbn;
    }

    public static Comparator<Book> byAuthor = (book1, book2) -> book1.author.compareToIgnoreCase(book2.author);

    public static Comparator<Book> byTitle = (book1, book2) -> book1.title.compareToIgnoreCase(book2.title);

    public static Comparator<Book> byPrice = Comparator.comparingInt(book -> book.price);

    public static Comparator<Book> byTitleThanAuthor = byTitle.thenComparing(byAuthor);
    public static Comparator<Book> byAuthorThanTitle = byAuthor.thenComparing(byTitle);
    public static Comparator<Book> byAuthorThanTitleThanPrice = byAuthor
            .thenComparing(byTitle).thenComparing(byPrice);
}
