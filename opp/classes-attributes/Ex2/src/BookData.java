public class BookData {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.title = "Código Limpo: Habilidades Práticas do Agile Software";
        book1.writer = "Robert C. Martin";
        book1.numberPages = 425;
        book1.releaseYear = 2009;
        book1.language = "Português";
        book1.genre = "Computação, Informática e Mídias digitais";
        book1.publishingCompany = "Alta Books";
        book1.hardCover = false;

        System.out.println(book1.title);
        System.out.println(book1.writer);
        System.out.println(book1.numberPages);
        System.out.println(book1.releaseYear);
        System.out.println(book1.language);
        System.out.println(book1.genre);
        System.out.println(book1.publishingCompany);
        System.out.println(book1.hardCover);
    }
}