package Final_lab;

import java.util.ArrayList;

public class RoomList {

    ArrayList<Room> roomList;

    public RoomList() {
        this.roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void updateRoomById(String id) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                if (room instanceof MeetingRoom) {
                    room.updateRoomById(id);
                } else if (room instanceof BedRoom) {
                    room.updateRoomById(id);
                }
            }
        }
    }

    public void deleteRoomById(String id) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                roomList.remove(room);
            }
        }
    }

    public void findRoomById(String id) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                room.displayDetails();

            }
        }
    }

    public void displayAllRooms() {
        for (Room room : roomList) {
            room.displayDetails();
        }
    }

    public Room findMostExpensive() {
        Room mostEx = null;
        double max = 0;
        for (Room room : roomList) {
            if (room.calculateCost() > max) {
                max = room.calculateCost();
                mostEx = room;
            }
        }
        return mostEx;
    }

    public void countRooms() {
        System.out.println("count rooms:" + roomList.size());
    }
}
