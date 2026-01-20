
import java.util.Scanner;

public class LibrarySystem_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book_16 myLibrary = new Book_16();
        System.out.print("Enter the Book Name: ");
        String name = sc.nextLine();
        System.out.print("Enter the author Name: ");
        String author = sc.nextLine();
        myLibrary.showBookDetails(name, author);
        myLibrary.borrowBook("Human bones");
        myLibrary.borrowBook("Animal bones");
        myLibrary.returnBook("human bones");
        myLibrary.getTotalBook();
        sc.close();
    }
}
