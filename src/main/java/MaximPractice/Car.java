package MaximPractice;

public class Car {
    int a, b, time;

    public void start(int st) {
        a = st;
        System.out.println("Машина выехала в " + a);
    }

    public void stop(int sb) {
        b = sb;
        System.out.println("Машина приехала в " + b);
    }

    public int drive(int howlong) {
        howlong = b - a;
        time = b - a;
        if (time < 10) {
            System.out.println("За " + time + " часа машина проехала");
        } else {
            System.out.println("За " + time + " часов машина проехала");
        }
        System.out.println(howlong * 60 + "км");

        return howlong;
    }
}
