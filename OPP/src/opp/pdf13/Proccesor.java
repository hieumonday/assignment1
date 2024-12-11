package opp.pdf13;

import java.util.List;
import java.util.Scanner;

public class Proccesor {

    public static void main(String[] args) {
        VehicleList vehicleList = new VehicleList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("options:");
            System.out.println("1.add a new car");
            System.out.println("2.add a new truck");
            System.out.println("3.update vehicle by id");
            System.out.println("4.delete vehicle by id ");
            System.out.println("5.find vehicle by id");
            System.out.println("6.display all vehicles");
            System.out.println("7.find cars by number of seats");
            System.out.println("8.find the truck with longest distance");
            System.out.println("9.find electric car");
            System.out.println("10.extit");

            System.out.println("choose an option:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("enter vehicle details:");
                    System.out.println("enter id:");
                    String cId = sc.nextLine();
                    System.out.println("enter brand:");
                    String cBrand = sc.nextLine();
                    System.out.println("enter model:");
                    String cModel = sc.nextLine();
                    System.out.println("enter rentalDays:");
                    int cRentalDays = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter rental price per day:");
                    double cRentalPricePerDay = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("enter number of seats:");
                    int numberOfSeats = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter fule type");
                    String fuelType = sc.nextLine();
                    Car car = new Car(cId, cBrand, cModel, cRentalDays, cRentalPricePerDay, numberOfSeats, fuelType);
                    vehicleList.addVehicle(car);
                    break;
                case 2:
                    System.out.println("enter truck details:");
                    System.out.println("enter truck id:");
                    String tId = sc.nextLine();
                    System.out.println("enter model:");
                    String tModel = sc.nextLine();
                    System.out.println("enter rentalDays:");
                    int tRentalDays = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter retal price per day:");
                    double tRentalPricePerDay = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("enter load capacity:");
                    double loadCapacity = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("enter distance:");
                    double distance = sc.nextDouble();
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("enter id to update:");
                    String updateId = sc.nextLine();
                    if (vehicleList.updateVehicleById(updateId, sc)) {
                        System.out.println("vehicle update succesfully");
                    } else {
                        System.out.println("vehicle not found");
                    }
                    break;
                case 4:
                    System.out.println("enter id to delete:");
                    String deleteId = sc.nextLine();
                    if (vehicleList.deleteVehicleById(deleteId)) {
                        System.out.println("vehicle delete succesfully");
                    } else {
                        System.out.println("vehicle not found");
                    }
                    break;
                case 5:
                    System.out.println("enter id to find:");
                    String findId = sc.nextLine();
                    vehicleList.findVehicleById(findId);
                    break;
                case 6:
                    vehicleList.displayAllVehicles();
                    break;
                case 7:
                    System.out.println("enter seat to find:");
                    int findSeat = sc.nextInt();
                    sc.nextLine();
                    List<Car> findCars = vehicleList.findCarsBySeats(findSeat);
                    for (Car c : findCars) {
                        c.displayDetails();
                        System.out.println();
                    }
                    break;
                case 8:
                    Truck longestDistance = vehicleList.findLongestDistance();
                    if (longestDistance != null) {
                        longestDistance.displayDetails();
                    } else {
                        System.out.println("no truck found");
                    }
                    break;
                case 9:
                    List<Car> electricCars = vehicleList.findElectricCars();
                    for (Car c : electricCars) {
                        c.displayDetails();

                    }
                    break;
                case 10:
                    System.out.println("exiting");
                    sc.close();
                    return;
                default:
                    System.out.println("please enter choice again");
            }
        }
    }
}
