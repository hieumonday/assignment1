
package opp.pdf10;

import java.util.Date;


public class MeetingRoom extends Room {
    private int capacity;
    public MeetingRoom(String id, String name, double baseCost, Date checkinDate, Date checkoutDate, int capacity) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.capacity = capacity;
    }

    @Override
    public double calculateCost() {
        if(capacity > 50){
            return (getBaseCost() * 1.2) * dayStays();
        }else{
           return getBaseCost() * dayStays(); 
        }
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("capacity:"+ capacity);
    }
}
