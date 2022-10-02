package OOP_HomeTask;

public class Floors {
    private int number;
    private Flats[]flats;

    public Floors(int number, Flats[] flats) {
        this.number = number;
        this.flats = flats;
    }

    public void print() {
        System.out.println("Номер этажа " + number + ", " + "количество квартир " + flats.length);
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Flats[] getFlats() {
        return flats;
    }

    public void setFlats(Flats[] flats) {
        this.flats = flats;
    }
}
