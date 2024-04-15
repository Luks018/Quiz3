package quizes.q3.luka_shamatava_1;

public class Room {
    private int roomNumber;
    private boolean isOccupied;
    private Person occupant;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isOccupied = false;
        this.occupant = null;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Person getOccupant() {
        return occupant;
    }

    public void checkIn(Person person) {
        if (!isOccupied) {
            occupant = person;
            isOccupied = true;
            System.out.println(person.getName() + " checked into room " + roomNumber);
        } else {
            System.out.println("Room " + roomNumber + " is already occupied.");
        }
    }

    public void checkOut() {
        if (isOccupied) {
            System.out.println(occupant.getName() + " checked out from room " + roomNumber);
            occupant = null;
            isOccupied = false;
        } else {
            System.out.println("Room " + roomNumber + " is already vacant.");
        }
    }
}
