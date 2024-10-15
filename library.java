
import java.util.ArrayList;

public class library {
    private ArrayList<book> books;
    private ArrayList<user> users;

    public library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(book book) {
        books.add(book);
    }

    public void borrowBook(user user, String title) {
        for (book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                user.borrowBook(title);
                System.out.println("User : " +user.getName() + " Tittle: " + title  + " Due Date:"+ user.getDueDate());
                return;
            }
        }
        System.out.println("Book not available or not found.");
    }
    

    public void listAvailableBooks() {
        for (book book : books) {
            if (book.isAvailable()) {
                book.printBookInfo();
            }
        }
    }

    public void addUser(user user) {
        users.add(user);
    }


}
