
package opp.pdf10;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RoomList {
    ArrayList<Room> roomList;
    public RoomList(){
        this.roomList = new ArrayList<>();
    }
    public void addRoom(Room room){
        roomList.add(room);
    }
    public boolean updateRoomById(String id,Scanner sc){
        for(Room room : roomList){
            if(room.getId().equals(id)){
                System.out.println("enter new name:");
                String name = sc.nextLine();
                System.out.println("enter new base cost:");
                double baseCost = sc.nextDouble();
                System.out.println("enter new check in date(yyyy-mm-dd):");
                Date checkinDate = java.sql.Date.valueOf(sc.nextLine());
                System.out.println("enter new check out date(yyyy-mm-dd):");
                Date checkoutDate = java.sql.Date.valueOf(sc.nextLine());
                if(room instanceof MeetingRoom){
                    System.out.println("enter new capacity:");
                    int capacity = sc.nextInt();
                }else if(room instanceof BedRoom){
                    System.out.println("enter new number of beds:");
                    int numberOfBeds = sc.nextInt();
                }
            }
            return true;
        }
        return false;
    }
    public boolean deleteRoomById(String id){
        for(Room room : roomList){
            if(room.getId().equals(id)){
                roomList.remove(room);
            }
            return true;
        }
        return false;
    }
    public Room findRoomById(String id){
        for(Room room : roomList){
            if(room.getId().equals(id)){
                room.displayDetails();
                return room;
            }
            
    }
        return null;
  }
    public void displayAllRooms(){
        for(Room room : roomList){
            room.displayDetails();
        }
    }
    public Room findMostExpensive(){
        Room mostEx = null;
        double max = 0;
        for(Room room : roomList){
            if(room.calculateCost() > max){
                max = room.calculateCost();
                mostEx = room;
            }
        }
        return mostEx;
    }
    public void countRooms(){
        System.out.println("count rooms:"+ roomList.size());
    }
}
