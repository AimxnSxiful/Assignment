import java.util.ArrayList;

public class user {
    private String name;
    private int age;
    private ArrayList<String> borrowedBooks; // List of book titles

    public user(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Borrow a book by adding the book title to the list
    public void borrowBook(String bookTitle) {
        borrowedBooks.add(bookTitle);
    }

    // Return a book by removing the title from the list
    public void returnBook(String bookTitle) {
        if (borrowedBooks.remove(bookTitle)) {
            System.out.println("Successfully returned the book: " + bookTitle);
        } else {
            System.out.println("Failed to return the book: " + bookTitle + ". The user hasn't borrowed it.");
        }
    }


}
