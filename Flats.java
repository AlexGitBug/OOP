package OOP_HomeTask;

public class Flats {
    private int number;
    private Rooms[]rooms;

    public Flats(int number, Rooms[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("Номер квартиры " + number + ", " + "количество комнат " + rooms.length);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Rooms[] getRooms() {
        return rooms;
    }

    public void setRooms(Rooms[] rooms) {
        this.rooms = rooms;
    }
}
