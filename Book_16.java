public class Book_16 {
    String title;
    String author;
    String isbn;
    static int count;
    static int totalBook;

    void showBookDetails(String name, String author) {
        System.out.println("Your Book: " + name);
        System.out.println("Author of this Book is: " + author);
        count++;
    }

    public void borrowBook(String book) {
        count++;
        System.out.println(book + " added in library");
    }

    public void returnBook(String book) {
        System.out.println(book + " Book is Returned! ");
        count--;
    }

    public void getTotalBook() {
        System.out.println("Library Total book is " + count);
    }
}