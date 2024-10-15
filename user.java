import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;


public class user {
    private String name;
    private int age;
    private ArrayList<String> borrowedBooks; // List of book titles
    private LocalDate DueDate = LocalDate.now().plusDays(14);
    LocalDate nowD  = LocalDate.now();

    
    public user(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public LocalDate getDueDate(){
        return DueDate;
    }
    public void setDueDate(LocalDate DueDate){
        this.DueDate = DueDate;
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

    public void checkDueDate(){
        Period Overdue = Period.between(DueDate, nowD);
        if(nowD.isBefore(DueDate)){
            System.out.println("The Book is not overdue yet");

        }else{
            System.out.println("The book is overdue by:"+Overdue);
        }

        System.out.println(Overdue);



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
