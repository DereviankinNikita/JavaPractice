package MaximPractice;

public class Car {
    int distance,a,b;

    public void start(){
        a = 2;
        System.out.println("Машина выехала в "+a);
    }
    public void stop(){
        b = 10;
        System.out.println("Машина приехала в "+b);
    }
    public int drive() {
        int howlong,time;
        howlong=b-a;
        time=b-a;
        System.out.println("За "+time+" часа машина проехала");
        System.out.println(howlong * 60+"км");

        return howlong *60;
    }


}
