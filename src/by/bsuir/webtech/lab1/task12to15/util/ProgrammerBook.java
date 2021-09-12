package by.bsuir.webtech.lab1.task12to15.util;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        ProgrammerBook that = (ProgrammerBook) o;
        return level == that.level && language.equals(that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, level);
    }
}
