
package opp.pdf8;

import java.util.Scanner;

public class Proccesor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();
        while (true){
            System.out.println("1.add new text book");
            System.out.println("2.add new reference book");
            System.out.println("3.update book by id");
            System.out.println("4.delete book by id");
            System.out.println("5.find book by id");
            System.out.println("6.display all books");
            System.out.println("7.find the most expensive book");
            System.out.println("8.count text book and reference book");
            System.out.println("9.exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("enter information for the new text book");
                    System.out.println("enter book id:");
                    String textBookId  = sc.nextLine();
                    System.out.println("enter title:");
                    String textBookTitle  = sc.nextLine();
                    System.out.println("enter base price:");
                    double textBookBasePrice  = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("enter subject:");
                    String subject = sc.nextLine();
                    TextBook textBook = new TextBook(textBookId,textBookTitle,textBookBasePrice,subject);
                    bookList.addBook(textBook);
                    break;
                case 2:
                    System.out.println("enter information for the new reference book");
                    System.out.println("enter book id:");
                    String refBookId = sc.nextLine();
                    System.out.println("enter title:");
                    String refBookTitle  = sc.nextLine();
                    System.out.println("enter base price:");
                    double refBookBasePrice  = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("enter publisher :");
                    String publisher = sc.nextLine();
                    ReferenceBook referenceBook = new ReferenceBook(refBookId,refBookTitle ,refBookBasePrice ,publisher);
                    bookList.addBook(referenceBook);
                    break;
                case 3:
                    System.out.println("enter id book to update:");
                    String idUpdate = sc.nextLine();
                    bookList.updateBookById(idUpdate, sc);
                    break;
                case 4:
                    System.out.println("enter id book to delete:");
                    String deleteId = sc.nextLine();
                    bookList.deleteById(deleteId);
                    break;
                case 5:
                    System.out.println("enter id to find:");
                    String findId = sc.nextLine();
                    bookList.findBookById(findId);
                    break;
                case 6:
                    System.out.println("display all books:");
                    bookList.displayAllBooks();
                    break;
                case 7:
                    Book mostExpensive = bookList.findMostExpensiveBook();
                    if (mostExpensive != null) {
                        System.out.println("The most expensive book is:");
                        mostExpensive.displayDetails();
                    } else {
                        System.out.println("There are no books in the list.");
                    }
                    break;
                
                case 8:
                    bookList.totalBook();
                    break;
                case 9:
                    System.out.println("exiting the program");
                    sc.close();
                    break;
                case 10: {
                    bookList.findSecondExpensiveBook();
                    break;
                }
                default:
                    System.out.println("invalid choice! try again");
                    break;
                    
            }   
        }
    }
}
