class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Novel extends Book {
    String genre;

    Novel(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

public class single_inheritance1 {
    public static void main(String[] args) {
        Novel obj1 = new Novel("To Kill a Mockingbird", "Harper Lee", "Fiction");
        obj1.displayDetails();
    }
}