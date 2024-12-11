package opp.pdf12;

import java.util.List;
import java.util.Scanner;

public class Proccesor {

    public static void main(String[] args) {
        VehicleList vehicleList = new VehicleList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add a new car");
            System.out.println("2. Add a new truck");
            System.out.println("3. Update vehicle by ID");
            System.out.println("4. Delete vehicle by ID");
            System.out.println("5. Find vehicle by ID");
            System.out.println("6. Display all vehicles");
            System.out.println("7. Find the top 3 cars with the highest number of seats");
            System.out.println("8. Find the truck with the longest distance");
            System.out.println("9. Find electric cars");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter car ID: ");
                    String carId = sc.nextLine();
                    System.out.print("Enter brand: ");
                    String carBrand = sc.nextLine();
                    System.out.print("Enter model: ");
                    String carModel = sc.nextLine();
                    System.out.print("Enter rental price per day: ");
                    double carRentalPrice = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter number of seats: ");
                    int seats = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter fuel type: ");
                    String fuelType = sc.nextLine();
                    Car car = new Car(carId, carBrand, carModel, carRentalPrice, seats, fuelType);
                    vehicleList.addVehicle(car);
                    break;
                case 2:
                    System.out.print("Enter truck ID: ");
                    String truckId = sc.nextLine();
                    System.out.print("Enter brand: ");
                    String truckBrand = sc.nextLine();
                    System.out.print("Enter model: ");
                    String truckModel = sc.nextLine();
                    System.out.print("Enter rental price per day: ");
                    double truckRentalPrice = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter rental days: "); 
                    int truckRentalDays = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter load capacity: ");
                    double loadCapacity = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter distance: ");
                    double distance = sc.nextDouble();
                    sc.nextLine();
                    Truck truck = new Truck(truckId, truckBrand, truckModel, truckRentalPrice, truckRentalDays, loadCapacity,distance);
                    vehicleList.addVehicle(truck);
                    break;
                case 3:
                    System.out.print("Enter vehicle ID: ");
                    String updateId = sc.nextLine();
                    if (vehicleList.updateVehicleById(updateId, sc)) {
                        System.out.println("Vehicle updated successfully.");
                    } else {
                        System.out.println("Vehicle not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter vehicle ID: ");
                    String deleteId = sc.nextLine();
                    if (vehicleList.deleteVehicleById(deleteId)) {
                        System.out.println("Vehicle deleted successfully.");
                    } else {
                        System.out.println("Vehicle not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter vehicle ID: ");
                    String findId = sc.nextLine();
                    vehicleList.findVehicleById(findId);
                    break;
                case 6:
                    vehicleList.displayAllVehicles();
                    break;
                case 7:
                    List<Car> topCars = vehicleList.findTop3CarsBySeats();
                    for (Car c : topCars) {
                        c.displayDetails();
                        System.out.println();
                    }
                    break;
                case 8:
                    Truck longestDistanceTruck = vehicleList.findTruckWithLongestDistance();
                    if (longestDistanceTruck != null) {
                        longestDistanceTruck.displayDetails();
                    } else {
                        System.out.println("No trucks found.");
                    }
                    break;
                case 9:
                    List<Car> electricCars = vehicleList.findElectricCars();
                    for (Car c : electricCars) {
                        c.displayDetails();
                        System.out.println();
                    }
                    break;
                case 10:
                    System.out.println("exiting");
                    sc.close();
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
