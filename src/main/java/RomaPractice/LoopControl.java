package RomaPractice;

public class LoopControl {
    /*boolean value=true;
    int a=5, b=7;

    public void foo(){

        while (a!=0){
            System.out.println(a);
            a--;
        }
    }*/
    public static void main(String[] args) {
        int number = 3;
        //возводимое в степень число
        double result = 1;
         //результат возведения в степень
        double power = -1;
        int test = 2;


         //начальный показатель степени

        while (power >= -10) {
            test = test * number;
            System.out.println(result);
            power--;


        }
/*        int a=5, b=7;
        do{
            a++;
            System.out.println(a);

        } while (a<b);*/
    }
}
