package stage1_PaoloNaragdao;

import java.util.ArrayList;

public class User {
    private String name;
    private int id;
    private ArrayList<Book> booksCheckedOut;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
        this.booksCheckedOut = new ArrayList<Book>();
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Book> getBooksCheckedOut() {
        return booksCheckedOut;
    }

    public void setBooksCheckedOut(ArrayList<Book> booksCheckedOut) {
        this.booksCheckedOut = booksCheckedOut;
    }

    public void addBook(Book book) {
        if (booksCheckedOut.size() < 5) {
            booksCheckedOut.add(book);
            book.setAvailable(false);
        } else {
            System.out.println("You have reached the maximum number of books you can check out.");
        }
    }

    public void removeBook(Book book) {
        if (booksCheckedOut.contains(book)) {
            booksCheckedOut.remove(book);
            book.setAvailable(true);
        } else {
            System.out.println("This book is not checked out by you.");
        }
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Books checked out: " + booksCheckedOut.size();
    }
}
