// 6. Let's examine the Java program given. It involves multiple classes that depict different book types, including Book, FictionBook, NonFictionBook, and TechnicalBook. The Book class features a constructor and a method called displayDetails(). This method is responsible for outputting the title and author of a book. The remaining classes inherit both the constructor and methods of the Book class as they extend it.

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }

    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald");
        fiction.displayDetails();

        System.out.println();

        NonFictionBook nonfiction = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        nonfiction.displayDetails();

        System.out.println();

        TechnicalBook technical = new TechnicalBook("Effective Java", "Joshua Bloch");
        technical.displayDetails();
    }
}
