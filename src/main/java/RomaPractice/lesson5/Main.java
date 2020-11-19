package RomaPractice.lesson5;

import RomaPractice.lesson7.Bus;

public class Main {
    public static void main(String[] args) {    //psvm
        Bus ourBus = ourBus = new Bus();  //для создания объекта исп. ключевое слово new и конструктор класса (Bus)
        Bus firstBus = firstBus = new Bus(); // firstBus объект типа Bus
        Bus secondBus = secondBus = new Bus();

        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Grey";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }
}
