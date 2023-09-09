public class Book {
    private String bookName;
    private int publishingYear;
    Author author;

    public Book(String bookName, int publishingYear, Author author) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.author = author;// прописал объект класса Author
    }

    public String getbookName() {
        return this.bookName;
    }

    public int getpublishingYear() {
        return this.publishingYear;
    }

    Author getAuthor() {
        return this.author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
