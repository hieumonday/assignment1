
package Final_lab;

import java.util.Date;
import java.util.Scanner;

public class MeetingRoom extends Room {
    private int capacity;

    public MeetingRoom(String id, String name, double baseCost, Date checkinDate, Date checkoutDate,int capacity) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public double calculateCost() {
        double cost = getBaseCost() * calculateDayStays();
      if(getCapacity() > 50){
          return cost * 1.2;
      }
       return cost; 
    }
    @Override
    public void enterRoomInfo(){
        Scanner sc = new Scanner(System.in);
        super.enterRoomInfo();
        System.out.println("enter capacity:");
        this.capacity = sc.nextInt();
    }
    @Override
    public void updateRoomById(String id) {
        if(this.getId().equals(id)){
        Scanner sc = new Scanner(System.in);
        super.updateRoomById(id);
        System.out.println("enter capacity:");
        this.capacity = sc.nextInt();
    }
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("capacity:"+ capacity);
    }
}
