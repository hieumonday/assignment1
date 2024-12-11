package opp.pdf12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleList {

    ArrayList<Vehicle> vehicleList;

    public VehicleList() {
        this.vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public boolean updateVehicleById(String id, Scanner sc) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equals(id)) {
                System.out.println("enter new infomation for vehicle");
                System.out.println("enter new brand:");
                String brand = sc.nextLine();
                System.out.println("enter new model:");
                String model = sc.nextLine();
                System.out.println("enter new rental price per day:");
                double rentalPricePerDay = sc.nextDouble();
                sc.nextLine();
                vehicle.setBrand(brand);
                vehicle.setId(id);
                vehicle.setModel(model);
                vehicle.setRentalPricePerDay(rentalPricePerDay);
                if (vehicle instanceof Car) {
                    System.out.println("enter new number of seats:");
                    int numberOfSeats = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter new fuel type:");
                    String fuelType = sc.nextLine();
                    ((Car)vehicle).setFuelType(fuelType);
                    ((Car)vehicle).setNumberOfSeats(numberOfSeats);
                } else if (vehicle instanceof Truck) {
                    System.out.println("enter new load capacity:");
                    double loadCapacity = sc.nextDouble();
                    System.out.println("enter new distance:");
                    double distance = sc.nextDouble();
                    ((Truck)vehicle).setDistance(distance);
                    ((Truck)vehicle).setLoadCapacity(loadCapacity);
                }
            }
            return true;
        }
        return false;
    }

    public boolean deleteVehicleById(String id) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equals(id)) {
                vehicleList.remove(vehicle);
            }
            return true;
        }
        return false;
    }

    public void findVehicleById(String id) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equals(id)) {
                vehicle.displayDetails();
                return;
            }
        }
        System.out.println("vehicle not found");
    }
    public void displayAllVehicles(){
        for (Vehicle vehicle : vehicleList) {
                vehicle.displayDetails();
                return;
            }
        }
    
    public List<Car> findTop3CarsBySeats(){
        List<Car> cars = new ArrayList<>();
        for(Vehicle vehicle : vehicleList){
            if(vehicle instanceof Car){
                cars.add((Car)vehicle);
            }
        }
        cars.sort((s1,s2)-> Double.compare(s1.getNumberOfSeats(), s2.getNumberOfSeats()));
        return cars.size()>3 ? cars.subList(0, 3) : cars;
    }
    public Truck findTruckWithLongestDistance(){
        Truck longestDistance = null;
        for(Vehicle vehicle : vehicleList){
            if(vehicle instanceof Truck){
            Truck truck = (Truck) vehicle;
            if(longestDistance == null || truck.getDistance() > longestDistance.getDistance()){
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

