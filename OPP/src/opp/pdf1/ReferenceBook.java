
package opp.pdf1;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book{
    private double tax;
    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax){
       super(bookId, publisher, entryDate, unitPrice, quantity);
       this.tax = tax;
    }
    @Override
    public void addBook(){
        System.out.println("adding new reference book");
    }
    @Override
    public void updateBook(String id){
        if(this.bookId.equals(id)){
           Scanner sc = new Scanner(System.in);
        System.out.println("enter infomation book:");
        System.out.println("enter book id:");
        this.bookId = sc.nextLine();
        System.out.println("enter publisher:");
        this.publisher = sc.nextLine();
        System.out.println("enter entry date:");
        this.entryDate = java.sql.Date.valueOf(sc.nextLine());
        System.out.println("enter unit price:");
        this.unitPrice = sc.nextDouble();
        System.out.println("enter quantity:");
        this.quantity = sc.nextDouble();
        System.out.println("enter tax:");
        this.tax = sc.nextDouble();
        }
    }
    @Override
    public void displayBook(){
        System.out.println("ID:"+ bookId);
        System.out.println("Publisher:"+ publisher);
        System.out.println("entry date:"+ entryDate);
        System.out.println("unit price:"+ unitPrice);
        System.out.println("quantity:"+ quantity);
        System.out.println("Tax:"+ tax);
    }
}
