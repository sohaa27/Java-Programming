package day1_7;

import java.util.Scanner;

class Book {
    private int isbnNo;
    private String bookName;
    private String author;

    public Book(int isbnNo, String bookName, String author) {
        this.isbnNo = isbnNo;
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void printDetails() {
        System.out.println("ISBN: " + isbnNo + ", Name: " + bookName + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new Book(1001, "Java Basics", "James Gosling");
        books[1] = new Book(1002, "Python Guide", "Guido van Rossum");
        books[2] = new Book(1003, "C++ STL", "Bjarne Stroustrup");
        books[3] = new Book(1004, "Data Structures", "Robert Lafore");
        books[4] = new Book(1005, "Algorithms", "Thomas Cormen");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the book to search: ");
        String searchName = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (books[i].getBookName().equalsIgnoreCase(searchName)) {
                System.out.println("Book found:");
                books[i].printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }

        System.out.println("\nAll Book Details:");
        for (int i = 0; i < 5; i++) {
            books[i].printDetails();
        }
    }
}
