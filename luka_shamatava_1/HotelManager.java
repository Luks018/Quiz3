package quizes.q3.luka_shamatava_1;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class HotelManager {
    private List<Room> rooms;
    private Map<String, Room> guestsMap;

    public HotelManager(int numRooms) {
        rooms = new ArrayList<>();
        guestsMap = new HashMap<>();
        for (int i = 1; i <= numRooms; i++) {
            Room room = new Room(i);
            rooms.add(new Room(i));
            guestsMap.put(null, room);
        }
    }

    public void displayRooms() {
        for (Room room : rooms) {
            System.out.println("Room " + room.getRoomNumber() + " is " + (room.isOccupied() ? "occupied" : "vacant"));
        }
    }

    public void checkIn(int roomNumber, Person person) {
        if (roomNumber >= 1 && roomNumber <= rooms.size()) {
            Room room = rooms.get(roomNumber - 1);
            if (!room.isOccupied()) {
                room.checkIn(person);
                guestsMap.put(person.getId(), room);
            } else {
                System.out.println("Room " + roomNumber + " is already occupied.");
            }
        } else {
            System.out.println("Invalid room number.");
        }
    }

    public void checkOut(String personId) {
        Room room = guestsMap.get(personId);
        if (room != null) {
            room.checkOut();
            guestsMap.put(personId, null);
        } else {
            System.out.println("No guest found with ID: " + personId);
        }
    }
    public void displayInfo() {
        System.out.println("Guest Information:");
        for (String personId : guestsMap.keySet()) {
            Room room = guestsMap.get(personId);
            if (room != null && room.isOccupied() && room.getOccupant() != null) {
                Person person = room.getOccupant();
                System.out.println("Guest: " + person.getName() + " " + person.getSurname() + ", Room: " + room.getRoomNumber());
            }
        }
    }
}

