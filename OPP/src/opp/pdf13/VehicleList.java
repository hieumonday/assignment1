
package opp.pdf13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleList {
    ArrayList<Vehicle> vehicleList;
    public VehicleList(){
        this.vehicleList = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
    public boolean updateVehicleById(String id, Scanner sc){
        for(Vehicle vehicle : vehicleList){
            if(vehicle.getId().equals(id)){
                System.out.println("enter new model:");
                String model = sc.nextLine();
                System.out.println("enter new rental days:");
                int rentalDays = sc.nextInt();
                System.out.println("enter new rental price per day:");
                double rentalPricePerDay = sc.nextDouble();
                if(vehicle instanceof Car){
                    System.out.println("enter new number of seats:");
                    int numberOfSeats = sc.nextInt();
                    System.out.println("enter new fuel type: ");
                    String fuleType = sc.nextLine();
                }else if(vehicle instanceof Truck){
                    System.out.println("enter new load capacity:");
                    double loadCapacity = sc.nextDouble();
                    System.out.println("enter new distance:");
                    double distance = sc.nextDouble();
                }
            }
            return true;
        }
        return false;
    }
    public boolean deleteVehicleById(String id){
        for(Vehicle vehicle : vehicleList){
            if(vehicle.getId().equals(id)){
                vehicleList.remove(vehicle);
            }
            return true;
        }
        return false;
    }
    public Vehicle findVehicleById(String id){
        for(Vehicle vehicle : vehicleList){
            if(vehicle.getId().equals(id)){
                vehicle.displayDetails();
                return vehicle;
            }
        }
        return null;
    }
    public void displayAllVehicles(){
        for(Vehicle vehicle : vehicleList){
            vehicle.displayDetails();
        }
    }
    public List<Car> findCarsBySeats(int seat){
        List<Car> findCar = new ArrayList<>();
        for(Vehicle vehicle : vehicleList){
            if(vehicle instanceof Car){
            Car car = (Car) vehicle;
            if(car.getNumberOfSeats() == seat ){
                findCar.add(car);
            }
        }
    }
        return findCar;
    }
    public Truck findLongestDistance(){
        Truck longestDistance = null;
        double maxDistance = 0;
        for(Vehicle vehicle : vehicleList){
            if(vehicle instanceof Truck){
                Truck truck = (Truck) vehicle;
                if(truck.getDistance() > maxDistance){
                    maxDistance = truck.getDistance();
                    longestDistance = truck;
                }
            }
        }
        return longestDistance;
      }
    public List<Car> findElectricCars(){
        List<Car> electricCars = new ArrayList<>();
        for(Vehicle vehicle : vehicleList){
            if(vehicle instanceof Car){
                Car car = (Car) vehicle;
                if(car.getFuelType().equalsIgnoreCase("electric")){
                   electricCars.add(car);
                }
            }
        }
        return electricCars;
    }
}
