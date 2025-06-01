package Constructor.ConstructorChainning;
//Using This KeyWord
class Book {
    String title;
    String author;
    double price;

    // Constructor 1
    Book() {
        this("Unknown", "Anonymous", 0.0); // Chaining to Constructor 3
        System.out.println("Default constructor called");
    }

    // Constructor 2
    Book(String title, String author) {
        this(title, author, 100.0); // Chaining to Constructor 3
        System.out.println("Two-arg constructor called");
    }

    // Constructor 3
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Three-arg constructor called");
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();

        Book b2 = new Book("Java Basics", "John Doe");
        b2.display();
    }

    void display() {
        System.out.println(title + " | " + author + " | $" + price);
    }
}


