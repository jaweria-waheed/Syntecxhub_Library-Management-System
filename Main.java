import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> books = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void addBook() {
        System.out.print("Enter book name: ");
        String name = input.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Book name cannot be empty!");
        } else if (books.contains(name)) {
            System.out.println("Book already exists!");
        } else {
            books.add(name);
            System.out.println("Book added successfully!");
        }
    }

    public static void removeBook() {
        System.out.print("Enter book name to remove: ");
        String name = input.nextLine().trim();

        if (books.remove(name)) {
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    public static void searchBook() {
        System.out.print("Enter book name to search: ");
        String name = input.nextLine().trim();

        if (books.contains(name)) {
            System.out.println("Book is available!");
        } else {
            System.out.println("Book not found!");
        }
    }

    public static void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("\nLibrary Books:");

            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    addBook();
                    break;

                case "2":
                    removeBook();
                    break;

                case "3":
                    searchBook();
                    break;

                case "4":
                    displayBooks();
                    break;

                case "5":
                    System.out.println("Thank you for using the system!");
                    return;

                default:
                    System.out.println("Invalid choice! Enter 1 to 5.");
            }
        }
    }
}

