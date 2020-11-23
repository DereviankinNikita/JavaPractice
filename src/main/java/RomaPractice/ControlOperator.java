package RomaPractice;

public class ControlOperator {
    int a=5, b=7;
    boolean value= false;

    public void foo(){

        if(value){
            System.out.println("True");

            if (a<b){
                System.out.println("Yes");
            }
        }else if(b>a){
            System.out.println("False");
        } else {
            System.out.println("AAA");
        }
    }
}
