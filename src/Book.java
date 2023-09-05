public class Book {
    private String bookName;
    private int publishingYear;
    public Book(String bookName, int publishingYear) { //должно быть так, public Book(String bookName, int publishingYear, Author author) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        // не понятно, как здесь прописать класс Author
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getpublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
