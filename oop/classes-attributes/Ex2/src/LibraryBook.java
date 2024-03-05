import java.util.Date;

public class LibraryBook {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.title = "Código Limpo: Habilidades Práticas do Agile Software";
        book1.writer = "Robert C. Martin";

        book1.rentedBook = true;
        book1.rentedTo = "Junior";
        book1.caughtOn = new Date();

        System.out.println(book1.title);
        System.out.println(book1.writer);
        System.out.println(book1.rentedBook);
        System.out.println(book1.rentedTo);
        System.out.println(book1.caughtOn);
    }
}
