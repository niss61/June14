interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    String title, author;
    int year;
    boolean available;
    Book(String title, String author, int year, boolean available) {
        this.title = title; this.author = author; this.year = year; this.available = available;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isAvailable() { return available; }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem book = new Book("Java Programming", "John Doe", 2020, true);
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getYear());
        System.out.println(book.isAvailable());
    }
}