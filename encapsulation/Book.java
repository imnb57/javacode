// 3. You are developing a library management system and need to implement a Book class. The Book class should have private instance variables for the book title, author name, and publication year. Implement appropriate getter and setter methods to ensure encapsulation. Additionally, include a private variable to track the availability of the book (e.g., true if available, false if borrowed), and provide a public method to borrow the book, updating its availability status.

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable = true;

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setYear(int year) { this.year = year; }

    public void borrowBook() {
        if (isAvailable) isAvailable = false;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

