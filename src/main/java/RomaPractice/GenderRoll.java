package RomaPractice;

import java.util.Random;
import java.util.Scanner;

class GenderRoll {
    public static void main(String[] args) {
        Random random = new Random();
        String gndArr[] = {"Transgender", "Two-Spirit",
                "Cisgender",
                "Non-Binary",
                "Genderqueer",
                "Gender expression",
                "Gender fluid",
                "Gender neutral"};
        String inp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose command: ");
        System.out.println("Roll \nCancel");
        do {
            inp = scanner.nextLine();
            switch (inp) {
                case "Roll":
                case "ROLL":
                case "roll":
                    System.out.println(gndArr[random.nextInt(gndArr.length)]);
                    System.out.println();
                    break;
                case "cancel":
                    System.out.println("Bye-bye!");
                    break;
                case "fuck you":
                    System.out.println("NO, FUCK YOU ASSHOLE!");
                    break;
                case "AVE MARIA":
                    System.out.println("DEUS VULT!");
                    break;
                case "death to all":
                    System.out.println("jews ;)");
                    break;
                case "AEZAKMI":
                    System.out.println("realy nigga?");
                default:
                    System.out.println("Enter prop command!");
                    break;
            }
        } while (!inp.equals("cancel"));


    }

}