package day1_6;

import java.util.Scanner;

class Book {
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    public Book() {}

    public Book(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public void accept(Scanner sc) {
        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();
        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
        System.out.print("Enter Book Price: ");
        price = sc.nextDouble();
    }

    public void update(Scanner sc) {
        System.out.println("Updating book ID: " + bookId);
        sc.nextLine(); // consume newline
        System.out.print("Enter new Book Name: ");
        bookName = sc.nextLine();
        System.out.print("Enter new Author Name: ");
        author = sc.nextLine();
        System.out.print("Enter new Price: ");
        price = sc.nextDouble();
    }

    public void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }

    public void display(String searchAuthor) {
        if (this.author.equalsIgnoreCase(searchAuthor)) {
            display();
        }
    }

    public void display(int searchId) {
        if (this.bookId == searchId) {
            display();
        }
    }

    public int getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }
}

public class BookMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n----- Book Menu -----");
            System.out.println("1. Add New Book");
            System.out.println("2. Update Book by ID");
            System.out.println("3. Display All Books");
            System.out.println("4. Search Books by Author");
            System.out.println("5. Search Book by ID");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < books.length) {
                        books[count] = new Book();
                        books[count].accept(sc);
                        count++;
                    } else {
                        System.out.println("Book storage full.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Book ID to update: ");
                    int updateId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].getBookId() == updateId) {
                            books[i].update(sc);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Book not found.");
                    break;
                case 3:
                    for (int i = 0; i < count; i++) {
                        books[i].display();
                    }
                    break;
                case 4:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter author name to search: ");
                    String searchAuthor = sc.nextLine();
                    boolean foundAuthor = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].getAuthor().equalsIgnoreCase(searchAuthor)) {
                            books[i].display();
                            foundAuthor = true;
                        }
                    }
                    if (!foundAuthor) System.out.println("No books found for this author.");
                    break;
                case 5:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    boolean foundId = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].getBookId() == searchId) {
                            books[i].display();
                            foundId = true;
                        }
                    }
                    if (!foundId) System.out.println("Book not found.");
                    break;
                case 6:
                    System.out.println("Exiting Book Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);
    }
}
