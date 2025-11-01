package Constructors.Questions;
class Book {
    private String title;
    private String author;
    private double price;

    // Constructor with only title
    // Calls the two-parameter constructor
    public Book(String title) {
        this(title, "Unknown");  // Chaining
    }

    // Constructor with title and author
    // Calls the three-parameter constructor
    public Book(String title, String author) {
        this(title, author, 0.0);  // Chaining
    }

    // Main constructor - does actual initialization
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Basics");
        book1.display();

        Book book2 = new Book("Python Guide", "John Doe");
        book2.display();

        Book book3 = new Book("C++ Programming", "Jane Smith", 29.99);
        book3.display();
    }
}
//First constructor: Takes only title, chains to second constructor with "Unknown" author
//Second constructor: Takes title and author, chains to third constructor with 0.0 price
//Third constructor: Takes all parameters and does the actual initialization