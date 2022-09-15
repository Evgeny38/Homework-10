package Task;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var author = new Author("Иван", "Иванов");
        var author1 = new Author("Петр", "Петров");
        var author2 = new Author("Магомед", "Магомедов");
        var book = new Book("Ржание коней", author, 1915);
        var book1 = new Book("Синяя пантера", author1, 2000);
        var book2 = new Book("Арматур Батыр", author2, 2015);

        System.out.println(author);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);


        book.setPublicationYear(1925);
        book1.setPublicationYear(2222);
        book2.setPublicationYear(3065);
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book.equals(book1));
        System.out.println(book.hashCode()==book1.hashCode());

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode()==book2.hashCode());

        System.out.println(book.equals(book2));
        System.out.println(book.hashCode()==book2.hashCode());


        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());


    }
}