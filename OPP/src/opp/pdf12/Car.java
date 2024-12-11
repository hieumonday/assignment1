package opp.pdf12;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String fuelType;

    public Car(String id, String brand, String model, double rentalPricePerDay, int rentalDays, String fuelType) {
        super(id, brand, model, rentalPricePerDay, rentalDays);
        this.numberOfSeats = numberOfSeats;
        if (fuelType.equals("petrol") || fuelType.equals("diesel") || fuelType.equals("electric")) {
            this.fuelType = fuelType;
        } else {
            throw new IllegalArgumentException("Invalid fuel type. Valid options are: petrol, diesel, electric.");
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
        if (fuelType.equals("petrol") || fuelType.equals("diesel") || fuelType.equals("electric")) {
            this.fuelType = fuelType;
        } else {
            throw new IllegalArgumentException("Invalid fuel type. Valid options are: petrol, diesel, electric.");
        }
    }

    @Override
    public double calculateRentalCost() {
        double rentalCost;
        if (fuelType.equals("electric")) {
            rentalCost = getRentalPricePerDay() * getRentalDays() * 0.9; // 10% discount for electric cars
        } else {
            rentalCost = getRentalPricePerDay() * getRentalDays();
        }
        return rentalCost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("number Of Seats: " + numberOfSeats);
        System.out.println("fuel Type: " + fuelType);
    }
}
