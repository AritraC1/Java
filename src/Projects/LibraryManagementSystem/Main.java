package Projects.LibraryManagementSystem;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true){
            try{
                System.out.println("\n====== Library Management System ======");
                System.out.println("1. Add Book");
                System.out.println("2. View Books");
                System.out.println("3. Update Book");
                System.out.println("4. Delete Book");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter book title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter book author: ");
                        String author = sc.nextLine();
                        library.addBook(title, author);
                    }

                    case 2 -> library.viewBooks();

                    case 3 -> {
                        System.out.print("Enter book ID to update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine(); // Consume newline

                        System.out.print("Enter new title: ");
                        String newTitle = sc.nextLine();

                        System.out.print("Enter new author: ");
                        String newAuthor = sc.nextLine();

                        library.updateBook(updateId, newTitle, newAuthor);
                    }

                    case 4 -> {
                        System.out.print("Enter book ID to delete: ");
                        int deleteId = sc.nextInt();
                        library.deleteBook(deleteId);
                    }

                    case 5 -> {
                        System.out.println("Exiting system. Goodbye!");

                        return;
                    }

                    default -> System.out.println("Invalid choice! Please try again.");
                }

            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine(); // Consume invalid input
            }
            catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}
