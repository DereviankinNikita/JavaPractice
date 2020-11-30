package RomaPractice;

public class Gaymers {
    public static void main(String[] args) {
        Gamer max = new Gamer();
        max.name = "Максим aka TwistTheBones Власенко";
        max.gameLvl = 0;
        max.age = 22;
        max.show();

        Gamer maxLosev = new Gamer();
        maxLosev.name = "Максим aka Radios Лосев";
        maxLosev.gameLvl = 5;
        maxLosev.age = 22;
        maxLosev.show();

        Gamer niko = new Gamer();
        niko.name = "Никита aka HRцк Деревянкин";
        niko.age = 21;
        niko.gameLvl = 3;
        niko.show();

    }
}