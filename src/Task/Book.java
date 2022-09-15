package Task;

import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private Integer publicationYear;


    public Book(String title, Author author, Integer publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public  void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Название книги : " + title + ", " +
                 author + ", " +
                "Год публикации : " + publicationYear + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getTitle().equals(book.getTitle()) && getAuthor().equals(book.getAuthor()) && getPublicationYear().equals(book.getPublicationYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getPublicationYear());
    }
}
