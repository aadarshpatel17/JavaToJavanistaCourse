package $6collectionSetsAndMaps.$12treemapcomparable;

import java.util.Objects;

public class Book {

    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("{%s, %s}", name, author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    @Override
    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!(other instanceof Book))
            return false;

        Book anotherBook = (Book) other;
        if(anotherBook.name.equals(this.name) && anotherBook.author.equals(this.author))
            return true;

        return false;
    }
}
