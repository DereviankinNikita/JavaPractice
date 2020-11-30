package RomaPractice;

public class Car {
    //private int st1, st2;


    public  void start(int start) {
        System.out.println("Car started at : " + start);
        //st1 = start;

    }

    public void stop(int stop) {
        System.out.println("Car  stopped at : " + stop);
        //st2 = stop;
    }

    public int drive(int howlong) {
        //int howlong = st2 - st1;
        int distance = howlong * 60;

        System.out.println("The car passed  " + distance + " km by " + howlong + " hour(s)");
        return howlong;

    }
}

