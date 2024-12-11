
package opp.pdf12;

public class Truck extends Vehicle {
   private double loadCapacity;
   private double distance;

    public Truck( String id, String brand, String model, double rentalPricePerDay, int rentalDays,double loadCapacity, double distance) {
        super(id, brand, model, rentalPricePerDay, rentalDays);
        this.loadCapacity = loadCapacity;
        this.distance = distance;
    }

    

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("load capacity:"+ loadCapacity);
        System.out.println("distance:"+ distance);
    }
    
    @Override
    public double calculateRentalCost() {
        double rentalCost;
        int loadfactor = 5;
        rentalCost = getRentalPricePerDay()* getRentalDays() * (distance * loadfactor);
        return rentalCost;
    }
}
