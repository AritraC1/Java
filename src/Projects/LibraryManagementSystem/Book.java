package Projects.LibraryManagementSystem;

public class Book {
    private final int bookID;
    private String title;
    private String author;

    // Constructor
    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    // Getter
    public int getBookID() {
        return bookID;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Overriding the built-in toString method
    @Override
    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author;
    }
}
