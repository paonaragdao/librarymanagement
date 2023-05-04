package stage1_PaoloNaragdao;

import java.util.Scanner;

public class LibraryTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library!");
        System.out.print("Please enter the library name: ");
        String libraryName = scanner.nextLine();
        Library library = new Library(libraryName);

        System.out.println("Please choose an option:");
        System.out.println("1. Add a book to the library");
        System.out.println("2. Add a user to the library");
        System.out.println("3. Remove a book from the library");
        System.out.println("4. Remove a user from the library");
        System.out.println("5. Search for a book by ISBN");
        System.out.println("6. Search for a user by ID");
        System.out.println("7. Exit the program");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        while (choice != 7) {
            switch (choice) {
                case 1:
                    System.out.println("Please enter the book title:");
                    String bookTitle = scanner.nextLine();

                    System.out.println("Please enter the author name:");
                    String authorName = scanner.nextLine();

                    System.out.println("Please enter the book ISBN:");
                    String bookISBN = scanner.nextLine();

                    Book book = new Book(bookTitle, authorName, bookISBN);
                    library.getBooks().add(book);

                    System.out.println("Book added to the library.");
                    break;
                case 2:
                    System.out.println("Please enter the user name:");
                    String userName = scanner.nextLine();

                    System.out.println("Please enter the user ID:");
                    int userID = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    User user = new User(userName, userID);
                    library.getUsers().add(user);

                    System.out.println("User added to the library.");
                    break;
                case 3:
                    System.out.println("Please enter the book ISBN:");
                    String removeISBN = scanner.nextLine();

                    Book removeBook = library.searchBook(removeISBN);

                    if (removeBook != null) {
                        library.getBooks().remove(removeBook);
                        System.out.println("Book removed from the library.");
                    } else {
                        System.out.println("This book is not in the library's collection.");
                    }
                    break;
                case 4:
                    System.out.println("Please enter the user ID:");
                    int removeUserID = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    User removeUser = null;
                    for (User u : library.getUsers()) {
                        if (u.getId() == removeUserID) {
                            removeUser = u;
                            break;
                        }
                    }

                    if (removeUser != null) {
                        library.getUsers().remove(removeUser);
                        System.out.println("User removed from the library.");
                    } else {
                        System.out.println("This user is not registered in the library.");
                    }
                    break;
                case 5:
                    System.out.println("Please enter the book ISBN:");
                    String searchISBN = scanner.nextLine();

                    Book searchBook = library.searchBook(searchISBN);

                    if (searchBook != null) {
                        System.out.println("Book found: " + searchBook.getTitle() + " by " + searchBook.getAuthor());
                    } else {
                        System.out.println("This book is not in the library's collection.");
                    }
                    break;
                case 6:
                    System.out.println("Please enter the user ID:");
                    int searchUserID = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    User searchUser = null;
                    for (User u : library.getUsers()) {
                        if (u.getId() == searchUserID) {
                            searchUser = u;
                            break;
                        }
                    }

                    if (searchUser != null) {
                        System.out.println("User found: Name: " + searchUser.getName() + " User ID: " + searchUser.getId());
                    } else {
                        System.out.println("This user is not registered in the library.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }

            System.out.println("Please choose an option:");
            System.out.println("1. Add a book to the library");
            System.out.println("2. Add a user to the library");
            System.out.println("3. Remove a book from the library");
            System.out.println("4. Remove a user from the library");
            System.out.println("5. Search for a book by ISBN");
            System.out.println("6. Search for a user by ID");
            System.out.println("7. Exit the program");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
        }

        System.out.println("Thank you for using the Library program!");
        scanner.close();
    }
}
