package opp.pdf1;

import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book implements IBook {

    private String status;
    
    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }
    
    @Override
    public void addBook(){
        System.out.println("adding new text book");
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
        sc.nextLine();
        System.out.println("enter status:");
        this.status = sc.nextLine();
        }
  }
    @Override
    public void displayBook() {
        System.out.println("ID:"+ bookId);
        System.out.println("Publisher:"+ publisher);
        System.out.println("entry date:"+ entryDate);
        System.out.println("unit price:"+ unitPrice);
        System.out.println("quantity:"+ quantity);
        System.out.println("Status: " + status);
        
    }
    
}
