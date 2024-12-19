
package Final_lab;

import java.util.Date;
import java.util.Scanner;

public class BedRoom extends Room {
    private int numberOfBeds;
    public BedRoom(String id, String name, double baseCost, Date checkinDate, Date checkoutDate,int numberOfBeds) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public double calculateCost() {
        double cost = getBaseCost() * calculateDayStays();
      if(getNumberOfBeds() > 3){
          return cost * 1.1;
      }
       return cost; 
    }
    @Override
    public void enterRoomInfo(){
        Scanner sc = new Scanner(System.in);
        super.enterRoomInfo();
        System.out.println("enter numberOfBeds:");
        this.numberOfBeds = sc.nextInt();
    }
    @Override
    public void updateRoomById(String id) {
        if(this.getId().equals(id)){
        Scanner sc = new Scanner(System.in);
        super.updateRoomById(id);
        System.out.println("enter number Of Beds:");
        this.numberOfBeds = sc.nextInt();
    }
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("numberOfBeds:"+ numberOfBeds);
    }
}
