import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.getTitle());
    }

    // View all books in the library
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Borrow a book from the library
    public void borrowBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Return a book to the library
    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }
}
