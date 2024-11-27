package opp.pdf1;

import java.util.Date;
import java.util.Scanner;

public class Proccesor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();
        while (true) {
            System.out.println("1.add new book");
            System.out.println("2.update book by id");
            System.out.println("3.delete book  by id");
            System.out.println("4.find book by id");
            System.out.println("5.display all books");
            System.out.println("6.exit");
            int choice = sc.nextInt();
            sc.nextLine();  // Tiêu thụ ký tự dòng mới sau khi gọi nextInt()
            switch (choice) {
                case 1:
                    System.out.println("Enter information for the book:");

                    System.out.println("You want to import text book (1) or reference book (2)?");
                    int bookType = sc.nextInt();
                    sc.nextLine(); // Tiêu thụ ký tự dòng
                    System.out.print("Enter book id: ");
                    String bookId = sc.nextLine();
                    System.out.print("Enter publisher: ");
                    String publisher = sc.nextLine();

                    System.out.print("Enter entry date (yyyy-MM-dd): ");
                    Date entryDate = java.sql.Date.valueOf(sc.nextLine());

                    System.out.print("Enter unit price: ");
                    double unitPrice = sc.nextDouble();

                    System.out.print("Enter quantity: ");
                    double quantity = sc.nextDouble();

                    
                    if (bookType == 1) {
                        sc.nextLine(); // Tiêu thụ ký tự dòng mới
                        System.out.print("Enter status for the text book: ");
                        String status = sc.nextLine();
                        TextBook textBook = new TextBook(bookId, publisher, entryDate, unitPrice, quantity, status);
                        bookList.addBook(textBook);
                    } else if (bookType == 2) {
                        System.out.print("Enter tax for the reference book: ");
                        double tax = sc.nextDouble();
                        ReferenceBook referenceBook = new ReferenceBook(bookId, publisher, entryDate, unitPrice, quantity, tax);
                        bookList.addBook(referenceBook);
                    }
                    break;

                case 2:
                    System.out.println("Enter book id to update: ");
                    String id = sc.nextLine();
                    bookList.updateBook(id);
                    break;

                case 3:
                    System.out.println("Enter book id to delete: ");
                    String deleteId = sc.nextLine();
                    bookList.deleteBookById(deleteId);
                    break;

                case 4:
                    System.out.println("Enter book id to find: ");
                    String findId = sc.nextLine();
                    bookList.findBookById(findId);
                    break;

                case 5:
                    System.out.println("Displaying all books:");
                    for (Book book : bookList.bookList) {
                        book.displayBook();
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program...");
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
