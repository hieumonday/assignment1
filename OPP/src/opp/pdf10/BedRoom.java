
package opp.pdf10;

import java.util.Date;

public class BedRoom extends Room{
    private int numberOfBeds;
    public BedRoom(String id, String name, double baseCost, Date checkinDate, Date checkoutDate, int numberOfBeds) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.numberOfBeds =  numberOfBeds;
    }

    @Override
    public double calculateCost() {
        if(numberOfBeds >= 3){
            return (getBaseCost() * 1.1) * dayStays();
        }else{
            return getBaseCost() * dayStays();
        }
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("number of beds:"+ numberOfBeds);
    }
}
