package RomaPractice;

public class OperatorSwitch {

    final int VALUE=2, firstValue=1, secondValue=2, thirdValue=3; //КОНСТАНТЫЙ принято писать заглавными

    public void foo(){
        //Оператор множественного выбора
        // byte, short, int, char, enum, String

        /*switch (52){  // без оператора break будет выполнять все последующие кейсы после совпадения. Если совпадений нет, то можно выполнить команду по умолчанию (оператор default)
            case 48:
                System.out.println(48);
                break;
            case 73:
                System.out.println(73);
                break;
            case 25:
                System.out.println(25);
                break;
            default:
                System.out.println("Not found");
        }*/
        switch (VALUE){   // оператор switch работает с константами (?) РАЗОБРАТЬСЯ ПОДРОБНЕЕ!!!!
            case firstValue:
                System.out.println(firstValue);
            case secondValue:
                System.out.println(secondValue);
                break;
            case thirdValue:
                System.out.println(thirdValue);
                break;
            default:
                System.out.println("Default");
        }
    }
}
