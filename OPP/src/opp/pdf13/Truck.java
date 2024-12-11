
package opp.pdf13;

public class Truck extends  Vehicle{
    double loadCapacity;
    double distance;
    public Truck(String id, String brand, String model, int rentalDays, double rentalPricePerDay,double loadCapacity,double distance) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
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
    public double calculateRentalCost() {
        int loadFactor = 5;
        double rentalCost = getRentalPricePerDay() + (getDistance() * loadFactor);
        return rentalCost;
        
    }
    
}
