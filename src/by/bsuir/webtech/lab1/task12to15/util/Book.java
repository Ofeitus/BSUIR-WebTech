package by.bsuir.webtech.lab1.task12to15.util;

public class Book implements Cloneable {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book book = new Book();
        book.title = this.title;
        book.author = this.author;
        book.price = this.price;
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
                this.price == book.price;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (this.title == null ? 0 : this.title.hashCode());
        result = 31 * result + (this.author == null ? 0 : this.author.hashCode());
        result = 31 * result + this.price;
        result = 31 * result + edition;
        return result;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.author + ". Price: " + this.price;
    }
}
