package stage1_PaoloNaragdao;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;
    private Date dueDate;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true;
        this.dueDate = null;
    }

    public Book(String title, String author, String ISBN, boolean available, Date dueDate) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}