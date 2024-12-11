
package opp.pdf8;

import java.util.ArrayList;
import java.util.Scanner;


public class BookList {
    ArrayList <Book> bookList = new ArrayList<>();
    public BookList(){
        this.bookList = new ArrayList<>();
    }
    public void addBook(Book book){
        bookList.add(book);
    }
    public boolean updateBookById(String id, Scanner sc){
        for(Book book : bookList){
            if(book.getId().equals(id)){
                System.out.println("enter new title:");
                String title = sc.nextLine();
                System.out.println("enter new base price:");
                double basePrice = sc.nextDouble();
                sc.nextLine();
                if(book instanceof TextBook){
                    System.out.println("enter new subject:");
                    String subject = sc.nextLine();
                }else if (book instanceof ReferenceBook){
                    System.out.println("enter new publisher:");
                    String publisher = sc.nextLine();
                }
            }
            return true;
        }
        return false;
    }
    public boolean deleteById(String id){
        for(Book book : bookList){
            if(book.getId().equals(id)){
                bookList.remove(book);
                System.out.println("book with id"+ id + "has been removed");
                return true;
            }
        }
        return false;        
    }
    public void findBookById(String id){
        for(Book book : bookList){
            if(book.getId().equals(id)){
                book.displayDetails();
                break;
            }
        }
       
    }
    public void displayAllBooks(){
        for(Book book : bookList){
            book.displayDetails();
            return ;
        }
    }
    public Book findMostExpensiveBook(){
        Book mostExpensive = null;
        double max = 0;
        for(Book book : bookList){
            if(book.calculatePrice() > max ){
                max = book.calculatePrice();
                mostExpensive = book;
            }
        }
        return mostExpensive;
        
    }
    public void findSecondExpensiveBook(){
        double scPrice = 0;
        String scId = "";
        for(Book book : bookList){
            if(scPrice > book.getBasePrice() && scPrice != findMostExpensiveBook().getBasePrice()){
                scPrice = book.getBasePrice();
                scId = book.getId();
            }
            findBookById(scId);
        }
    }
    public void totalBook(){
        int count1 = 0;
        int count2 = 0;
        for(Book book : bookList){
            if(book instanceof TextBook){
                count1++;
            }else if(book instanceof ReferenceBook){
                count2++;
            }
        }
        System.out.println("total number of Text Book:"+ count1);
        System.out.println("total number of Reference Book:"+ count2);
       
    }
}
