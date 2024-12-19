package Final_lab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public abstract class Room implements IRoom {

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
    public abstract double calculateCost();

    @Override
    public void enterRoomInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id:");
        this.id = sc.nextLine();
        System.out.println("enter name:");
        this.name = sc.nextLine();
        System.out.println("enter base cost:");
        this.baseCost = sc.nextDouble();
        sc.nextLine();
        System.out.println("enter check in date(dd-mm-yyyy):");
        String checkIn = sc.nextLine();
        System.out.println("enter check out date(dd-mm-yyyy):");
        String checkOut = sc.nextLine();
        try {
            SimpleDateFormat fm = new SimpleDateFormat("dd-mm-yyyy)");
            this.checkinDate = fm.parse(checkIn);
            this.checkoutDate = fm.parse(checkOut);
        } catch (ParseException e) {
            System.out.println("please enter date");
        }
    }

    @Override
    public void updateRoomById(String id) {
        if (this.id.equals(id)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter new name:");
            this.name = sc.nextLine();
            System.out.println("enter new base cost:");
            this.baseCost = sc.nextDouble();
            sc.nextLine();
            System.out.println("enter new check in date(dd-mm-yyyy)");
            String checkIn = sc.nextLine();
            System.out.println("enter new check out date(dd-mm-yyyy)");
            String checkOut = sc.nextLine();
            try {
                SimpleDateFormat fm = new SimpleDateFormat("dd-mm-yyyy");
                this.checkinDate = fm.parse(checkIn);
                this.checkoutDate = fm.parse(checkOut);
            } catch (ParseException e) {
                System.out.println("please enter date again!");
            }
        }
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", name=" + name + ", baseCost=" + baseCost + ", checkinDate=" + checkinDate + ", checkoutDate=" + checkoutDate + '}';
    }

    @Override
    public void displayDetails() {
        System.out.println(toString());
    }

    public long calculateDayStays() {
        long diffInMillies = Math.abs(checkoutDate.getTime() - checkinDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff;
    }
}
