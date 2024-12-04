
package opp.pdf10;

import java.util.Date;

public abstract class Room implements IRoom{
    private String id;
    private String name;
    private double baseCost;
    private Date checkinDate;
    private Date checkoutDate;

    public Room(String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", name=" + name + ", baseCost=" + baseCost + ", checkinDate=" + checkinDate + ", checkoutDate=" + checkoutDate + '}';
    }
    @Override
    public abstract double calculateCost();
    @Override
    public void displayDetails(){
        System.out.println(toString());
    }
    public long dayStays(){
   
        return 0;
    
}
}
