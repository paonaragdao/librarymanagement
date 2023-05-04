package stage1_PaoloNaragdao;

import java.util.ArrayList;

public class Library {
    private final String library;
    private ArrayList<Book> books;
    private ArrayList<User> users;
    private String Library;

    public Library(String library) {
        this.books = new ArrayList<Book>();
        this.users = new ArrayList<User>();
        this.library = library;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added to the library.");
    }

    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
            System.out.println("User removed from the library.");
        } else {
            System.out.println("This user is not registered in the library.");
        }
    }

    public Book searchBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}