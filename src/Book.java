public class Book {
    String bookName;
    int yearPublishing;
    public Book(String bookName, int yearPublishing) {
        this.bookName = bookName;
        this.yearPublishing = yearPublishing;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getYearPublishing() {
        return this.yearPublishing;
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
