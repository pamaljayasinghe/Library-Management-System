public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, the book is available
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book is already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have successfully returned: " + title);
        } else {
            System.out.println("The book wasn't borrowed.");
        }
    }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}

