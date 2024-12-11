
package opp.pdf13;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String fuelType;

    public Car(String id, String brand, String model, int rentalDays, double rentalPricePerDay,int numberOfSeats,String fuelType) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
        if(fuelType.equals("petrol") || fuelType.equals("diesel") || fuelType.equals("electric")){
           this.fuelType = fuelType; 
        }else{
            throw new IllegalArgumentException("please choice fuelType again:");
        }
        
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
         if(fuelType.equals("petrol") || fuelType.equals("diesel") || fuelType.equals("electric")){
           this.fuelType = fuelType; 
        }else{
            throw new IllegalArgumentException("please choice fuelType again:");
        }
    }

    @Override
    public double calculateRentalCost() {
        double rentalCost;
       if(getFuelType() == "electric"){
           rentalCost = getRentalPricePerDay() * 0.9;
       }else{
           return rentalCost = getRentalPricePerDay() * getRentalPricePerDay();
       }
        return rentalCost;
    }
    
}
