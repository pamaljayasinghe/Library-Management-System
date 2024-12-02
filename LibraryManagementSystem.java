import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Sample books to add to the library
        library.addBook(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(2, "1984", "George Orwell"));
        library.addBook(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(4, "Moby Dick", "Herman Melville"));

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. View all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.viewBooks();
                    break;

                case 2:
                    System.out.print("Enter the Book ID to borrow: ");
                    int borrowId = scanner.nextInt();
                    library.borrowBook(borrowId);
                    break;

                case 3:
                    System.out.print("Enter the Book ID to return: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;

                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
