package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String userId;
    private List<Book> borrowedBooks;

    //Constructor
    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    //Borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    //Return a book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    //Display user info
    public void displayInfo() {
        System.out.println("User: " + name + ", ID: " + userId);
        System.out.println("Borrowed Books: ");
        for(Book book : borrowedBooks) {
            book.displayInfo();
        }
    }
}
