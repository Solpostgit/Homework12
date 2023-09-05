public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Author lermontov = new Author("Mihail", "Lermontov");
        Book warAndPeace = new Book("War and Peace", 1950);
        Book mciry = new Book("Mciry", 1955);
        System.out.println("author = " + tolstoy.getName());
        System.out.println("author = " + tolstoy.getSurname());
        System.out.println("book = " + warAndPeace.getBookName());
        System.out.println("book = " + warAndPeace.getpublishingYear());
        warAndPeace.setPublishingYear(1951);
        System.out.println("book = " + warAndPeace.getpublishingYear());
        System.out.println("author2 = " + lermontov.getName());
        System.out.println("author2 = " + lermontov.getSurname());
        System.out.println("book2 = " + mciry.getBookName());
        System.out.println("book2 = " + mciry.getpublishingYear());
    }
}