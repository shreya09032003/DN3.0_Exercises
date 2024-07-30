package WEEK1_DSA.LibraryManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryManagementSystem {
    // Linear search
    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search
    public static Book binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = title.compareToIgnoreCase(books[mid].getTitle());

            if (result == 0) {
                return books[mid];
            } else if (result > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Method to sort books by title
    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of books:");
        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        Book[] books = new Book[numberOfBooks];

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Enter book ID:");
            String bookId = scanner.nextLine();
            System.out.println("Enter book title:");
            String title = scanner.nextLine();
            System.out.println("Enter book author:");
            String author = scanner.nextLine();
            books[i] = new Book(bookId, title, author);
        }

        while (true) {
            System.out.println("Choose search method: linear, binary, or exit:");
            String method = scanner.nextLine();

            if (method.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the book title to search:");
            String searchTitle = scanner.nextLine();
            Book result = null;

            switch (method.toLowerCase()) {
                case "linear":
                    result = linearSearch(books, searchTitle);
                    break;
                case "binary":
                    sortBooksByTitle(books); // Ensure the array is sorted for binary search
                    result = binarySearch(books, searchTitle);
                    break;
                default:
                    System.out.println("Invalid search method.");
                    continue;
            }

            if (result != null) {
                System.out.println("Book found: " + result);
            } else {
                System.out.println("Book not found.");
            }
        }

        scanner.close();
    }
}
