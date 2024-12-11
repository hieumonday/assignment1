
package opp.pdf12;

public abstract class Vehicle implements IVehicle{
   private String id;
   private String brand;
   private String model;
   private double rentalPricePerDay;
   private int rentalDays;

    public Vehicle(String id, String brand, String model, double rentalPricePerDay, int rentalDays) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.rentalDays = rentalDays;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", rentalPricePerDay=" + rentalPricePerDay + ", rentalDays=" + rentalDays + '}';
    }

    public abstract double calculateRentalCost();
    @Override
    public void displayDetails(){
        System.out.println(toString());
    }
}
