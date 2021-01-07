package RomaPractice;

import java.util.Scanner;

public class CarOwner {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start time : ");
        int start = sc.nextInt();
        System.out.print("Enter stop time : ");
        int stop = sc.nextInt();
        int howlong = stop - start;
            if( howlong < 1){
                howlong = (24 - (start - stop));
                if(howlong <1)
                    howlong *= -1;
            }



        car.start(start);
        car.stop(stop);
        car.drive(howlong);

    }
}
