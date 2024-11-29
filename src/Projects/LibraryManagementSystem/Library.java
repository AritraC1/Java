package Projects.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private int nextId = 1;

    /// CRUD Operations

    // Add a book (Create)
    public void addBook(String title, String author){
        books.add(new Book(nextId++, title, author));
        System.out.println("Book added successfully!");
    }

    // View all books (Read)
    public void viewBooks(){
        if(books.isEmpty()){
            System.out.println("Library is empty");
        }
        else {
            System.out.println("Your Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Update book details (Update)
    public void updateBook(int id, String newTitle, String newAuthor){
        for (Book book : books){
            if(book.getBookID() == id){
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                System.out.println("Book updated successfully!");
                return;
            }
        }
        throw new NoSuchElementException("Book with ID " + id + " not found.");
    }

    // Delete a book (Delete)
    public void deleteBook(int id){
        Iterator<Book> iterator = books.iterator();

        while(iterator.hasNext()){
            if (iterator.next().getBookID() == id){
                iterator.remove();
                System.out.println("Book Deleted Successfully!");
                return;
            }
        }
        throw new NoSuchElementException("Book with ID " + id + " not found.");
    }
}
