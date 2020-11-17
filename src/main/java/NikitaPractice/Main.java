package NikitaPractice;

public class Main {
    public static void main(String[] args){
        Bus ourBus = new Bus();         /** Создание объекта класса Bus */
        Bus firstBus = new Bus();       /** Создание объекта класса Bus */
        Bus secondBus = new Bus();      /** Создание объекта класса Bus */

        ourBus.color = "Red";
        firstBus.color = "Green";
        secondBus.color = "Grey";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }
}
