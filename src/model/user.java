package model;

import java.util.ArrayList;
import java.util.List;

public class user {
    private String name;
    private String userId;
    private List<Book> borrowedBooks;

    //Constructor
    public user(String name, String userId) {
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
        borrrowedBooks.add(book);
    }

    //Return a book
    public void borrowBook(Book book) {
        borrrowedBooks.remove(book);
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
