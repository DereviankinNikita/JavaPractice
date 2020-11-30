package MaximPractice;

import java.sql.Driver;

public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.start(1);
        car.stop(20);
        car.drive(car.time);
        }

}