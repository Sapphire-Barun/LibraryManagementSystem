import model.Book;
import model.User;
import service.Library;

public class Main {
    public static void main(String[] args) {
        //Creating an instance of Library class
        Library library = new Library();

        //Creating some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN0001");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN0002");
        Book book3 = new Book("The Adventures of Huckleberry Finn", "Mark Twain", "ISBN0003");
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", "ISBN0004");
        Book book5 = new Book("The Catcher in the Rye", "J.D. Salinger", "ISBN0005");

        //Creating some users
        User user1 = new User("Nilam Verma", "U10001");
        User user2 = new User("Krishna Singh", "U10002");
        User user3 = new User("Vikash Sahni", "U10003");
        User user4 = new User("Vatsal Tiwary", "U10004");
        User user5 = new User("Shruti Singh", "U10005");

        //Adding books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        //Registering the users
        library.registerUser(user1);
        library.registerUser(user2);
        library.registerUser(user3);
        library.registerUser(user4);
        library.registerUser(user5);

        //Displaying books available in the library
        library.showAvailableBooks();

        //Borrowing a book
        library.borrowBook("U0001", "ISBN0004");

        //Displaying books available in the library after borrowing
        library.showAvailableBooks();

        //Returning the book
        library.returnBook("U0001", "ISBN0004");

        //Displaying books available in the library after returning
        library.showAvailableBooks();
    }
}