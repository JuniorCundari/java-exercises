public class Bookstore {
    public static void main(String[] args) {
        Book book = new Book();

        book.title = "Domain-driven design: atacando as complexidades no coração do software";
        book.writer = "Eric Evans";
        book.numberPages = 528;

        book.price = 100.37;

        System.out.println(book.title);
        System.out.println(book.writer);
        System.out.println(book.numberPages);
        System.out.println(book.price);
    }
}
