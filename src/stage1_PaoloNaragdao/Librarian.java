package stage1_PaoloNaragdao;

public class Librarian {

    private final String librarian;
    private String Librarian;

    public Librarian(String librarian){
        this.librarian = librarian;
    }
    public void addBook(Book book, Library library) {
        if (library.getBooks().size() < 1000) {
            library.getBooks().add(book);
            System.out.println("Book added to the collection.");
        } else {
            System.out.println("The library has reached its maximum capacity.");
        }
    }

    public void removeBook(Book book, Library library) {
        if (library.getBooks().contains(book)) {
            library.getBooks().remove(book);
            System.out.println("Book removed from the collection.");
        } else {
            System.out.println("This book is not in the library's collection.");
        }
    }

    public void updateBook(Book book) {
        System.out.println("Book updated.");
    }
}
