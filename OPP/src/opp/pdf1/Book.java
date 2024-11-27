
package opp.pdf1;

import java.util.Date;
import java.util.Scanner;

public abstract class Book implements IBook {
   String bookId;
   String publisher;
   Date entryDate;
   double unitPrice;
   double quantity;
    public String getBookId(){
        return bookId;
    }
    public Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity){
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
   @Override
    public abstract void addBook();
   @Override
    public abstract void updateBook(String id);
   @Override
    public abstract void displayBook();
    
    public void enterInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter infomation book:");
        System.out.println("enter book id:");
        bookId = sc.nextLine();
        System.out.println("enter publisher:");
        publisher = sc.nextLine();
        System.out.println("enter entry date:");
        entryDate = java.sql.Date.valueOf(sc.nextLine());
        System.out.println("enter unit price:");
        unitPrice = sc.nextDouble();
        System.out.println("enter quantity:");
        quantity = sc.nextDouble();
    }
    
}
