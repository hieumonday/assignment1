
package opp.pdf8;

public class ReferenceBook extends Book {
    private String publisher;
    public ReferenceBook(String publisher, String id, java.lang.Double basePrice, String title) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    @Override
    public double calculatePrice() {
     
        return getBasePrice() * 1.2;
     
    }

    @Override
    public void displayDetails() {
        System.out.println("id:"+ getId());
        System.out.println("title:"+ getTitle());
        System.out.println("base price:"+ getBasePrice());
        System.out.println("publisher:"+ publisher);
    }
    
}
