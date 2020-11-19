package NikitaPractice;

public class Main {
    public static void main(String[] args){
        Bus ourBusLesson7 = new Bus();         /** Создание объекта класса Bus */
        Bus firstBus = new Bus();       /** Создание объекта класса Bus */
        Bus secondBus = new Bus();      /** Создание объекта класса Bus */

        ourBusLesson7.color = "Red";
        firstBus.color = "Green";
        secondBus.color = "Grey";

        ourBusLesson7.showColor();
        firstBus.showColor();
        secondBus.showColor();
        // //
    }
}
