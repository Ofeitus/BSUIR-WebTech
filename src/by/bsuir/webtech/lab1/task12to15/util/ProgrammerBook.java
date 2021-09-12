package by.bsuir.webtech.lab1.task12to15.util;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book))
            return false;

        if (!(o instanceof ProgrammerBook))
            return super.equals(o);

        ProgrammerBook programmerBook = (ProgrammerBook)o;
        return super.equals(programmerBook) &&
                this.level == programmerBook.level &&
                this.language.equals(programmerBook.language);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + this.language.hashCode();
        result = 31 * result + this.level;
        return result;
    }

    @Override
    public String toString() {
        return super.toString()+ "(Language  " + this.language + ", level: " + this.level + ")";
    }
}
