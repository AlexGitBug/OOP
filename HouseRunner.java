package OOP_HomeTask;
/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */
public class HouseRunner {

    public static void main(String[] args) {

        Rooms[] rooms = {new Rooms(true), new Rooms(false), new Rooms(false)};
        rooms[0].print();
        Flats[] flats = {new Flats(1, rooms), new Flats(2,rooms), new Flats(3,rooms)};
        flats[0].print();
        Floors[] floors = {new Floors(1,flats), new Floors(2,flats), new Floors(3,flats)};
        floors[0].print();
        House house = new House(2, floors);
        house.print();
        System.out.println();
        printAllInformation(house);
    }

    public static void printAllInformation(House house) {
        house.print();
        for (Floors floors : house.getFloors()) {
            floors.print();
            for (Flats flats : floors.getFlats()) {
                flats.print();
                for (Rooms rooms : flats.getRooms()) {
                    rooms.print();
                }
            }
        }
    }
}
