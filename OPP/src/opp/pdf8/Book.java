
package opp.pdf8;

public abstract class Book implements IBook {
  private String id;
  private String title;
  private double basePrice;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }
    
    public Book(){}
   @Override
   public abstract double calculatePrice();
        
    
    @Override
   public  void displayDetails(){
     //   System.out.println("id:"+ id +",title:"+ title +",base price:"+ basePrice);
        System.out.println(toString());
   }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", basePrice=" + basePrice + '}';
        
    }
   
}
