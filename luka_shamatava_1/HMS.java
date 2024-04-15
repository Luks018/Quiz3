package quizes.q3.luka_shamatava_1;

public class HMS {
    public static void main(String[] args) {
        HotelManager hms = new HotelManager(2); // Assuming 2 rooms are available

        Room room101 = new Room(101);
        Room room102 = new Room(102);

        Person guest1 = new Person();
        guest1.setId("2468013579");
        guest1.setName("Noah");
        guest1.setSurname("Patel");

        Person person2 = new Person();
        person2.setId("0146802468");
        person2.setName("Luka");
        person2.setSurname("Shamatava"); // Corrected surname

        hms.checkIn(room101.getRoomNumber(), guest1);
        hms.checkIn(room102.getRoomNumber(), person2);

        hms.displayInfo();
    }
}
