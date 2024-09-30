import java.util.Scanner;

public class LibaryManagementSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        library library = new library();

        // Adding books to the library
        book book1 = new book("abuya di persinggahan", "Ashari", "12345");
        book book2 = new book("99 kata kata fattah amin", "Papat", "67890");
        library.addBook(book1);
        library.addBook(book2);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  

        user user = new user(name, age);
        library.addUser(user);

        System.out.println("\n--- Available Books ---");
        library.listAvailableBooks();

        System.out.print("\nEnter the title of the book you want to borrow: ");
        String bookTitle = scanner.nextLine();
        System.out.println("\n--- Borrowing a Book---");
        library.borrowBook(user, bookTitle);


        System.out.println("\n--- Overdue Books ---");


        scanner.close();
    }
}
