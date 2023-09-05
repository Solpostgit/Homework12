public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Author author2 = new Author("Mihail", "Lermontov");
        Book book = new Book("War and Peace", 1950);
        Book book2 = new Book("Mciry", 1953);
        System.out.println("author = " + author.getName());
        System.out.println("author = " + author.getSurname());
        System.out.println("book = " + book.getBookName());
        System.out.println("book = " + book.getpublishingYear());
    }
}