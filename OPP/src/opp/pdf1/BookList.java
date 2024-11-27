
package opp.pdf1;

import java.util.ArrayList;


public class BookList {
    ArrayList<Book> bookList ;
    public BookList(){
        this.bookList = new ArrayList<>();
    }
    public void addBook(Book book){
        bookList.add(book);
    }
    
     public void deleteBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                bookList.remove(book);
                System.out.println("Book with id " + id + " has been removed.");
                return;  // Kết thúc hàm sau khi xóa
            }
        }
        System.out.println("Book with id " + id + " not found.");
    }
        public void updateBook(String id){
            for(Book book : bookList){
                if(book.bookId.equals(id)){
                    book.updateBook(id);
                }
            }
}
    public void findBookById(String id){
        for(Book book : bookList){
            if(book.getBookId().equals(id)){
                book.displayBook();
            }
        }
        System.out.println("book not found");
    }
    public void displayAllBooks(){
        for(Book book : bookList){
            book.displayBook();
        }
    }
}


