package Task;

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
}
