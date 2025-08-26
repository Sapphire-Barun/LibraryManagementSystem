package service;

import model.Book;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    //Constructor
    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<User>();
    }

    //Add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    //Register a new user
    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered:" + user.getName());
    }

    //Borrow book by ISBN
    public void borrowBook(String userId, String isbn) {
        User user = findUserById(userId);
        Book book = findBookByIsbn(isbn);

        if(user != null && book != null && book.isAvailable())
        {
            user.borrowBook(book);
            book.setAvailable(false);
            System.out.println(user.getName() + "borrowed " + book.getTitle());
        }
        else
            System.out.println("Borrowing failed. Either user/book not found or book not available");
    }

    //Return a book by ISBN
    public void returnBook(String userId, String isbn) {
        User user = findUserById(userId);
        Book book = findBookByIsbn(isbn);

        if(user != null && book != null && !book.isAvailable())
        {
            user.returnBook(book);
            book.setAvailable(true);
            System.out.println(user.getName() + "returned " + book.getTitle());
        }
        else
            System.out.println("Return failed. Either user/book not found or book was not borrowed.");

    }

    //Show all available books
    public void showAvailableBooks() {
        System.out.println("Available Books: ");
        for(Book book : books) {
            if(book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    //Helper method to find a user by ID
    private User findUserById(String userId) {
        for(User user : users) {
            if(user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    //Helper method to find a book by ISBN
    private Book findBookByIsbn(String isbn) {
        for(Book book : books) {
            if(book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}