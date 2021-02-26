package RomaPractice;

import java.util.Scanner;

class SecondsConverter {
    public static void main(String[] args) {
        int days;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите колличество дней : ");
            days = scanner.nextInt();
            if (days > 0) {
                int hours = days * 24;
                int minutes = hours * 60;
                int seconds = minutes * 60;
                System.out.println(days + " день(дней) это " + hours + " часов " + minutes + " минут " + seconds + " секунд.\n");
            }

        } while (days != 0);
        // test
    }
}