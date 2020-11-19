package RomaPractice;

public class Main {
    public static void main(String[] args) {    //psvm
        BusLesson7 ourBusLesson7 = ourBusLesson7 = new BusLesson7();  //для создания объекта исп. ключевое слово new и конструктор класса (Bus)
        BusLesson7 firstBusLesson7 = firstBusLesson7 = new BusLesson7(); // firstBus объект типа Bus
        BusLesson7 secondBusLesson7 = secondBusLesson7 = new BusLesson7();

        ourBusLesson7.color = "Green";
        firstBusLesson7.color = "Red";
        secondBusLesson7.color = "Grey";

        ourBusLesson7.showColor();
        firstBusLesson7.showColor();
        secondBusLesson7.showColor();
    }
}
