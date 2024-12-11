package opp.pdf8;

public class TextBook extends Book {
    private String subject;

    public TextBook(String id, String title, double basePrice, String subject) {
        super(id, title, basePrice);
        this.subject = subject;              
    }

    @Override
    public double calculatePrice() {
       
        return getBasePrice() * 1.1;
       
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("id:"+ getId());
        System.out.println("title:"+ getTitle());
        System.out.println("base price:"+ getBasePrice());
        System.out.println("subject:"+ subject);
    }
    
}
