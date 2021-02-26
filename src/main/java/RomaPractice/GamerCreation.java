package RomaPractice;

public class GamerCreation {
    public static void main(String[] args) {
        //Default constructor test
        GaymerExtended gamer1 = new GaymerExtended();
        // Param cons test
        GaymerExtended gamer2 = new GaymerExtended("Максим", 22, 50);
        GaymerExtended gamer3 = new GaymerExtended("Nikita", 21, 6);

        //Object cons test
        GaymerExtended gamer4 = new GaymerExtended(gamer2);

        gamer1.showHardcoreLvl();
        gamer2.showHardcoreLvl();
        gamer3.showHardcoreLvl();
        gamer4.showHardcoreLvl();

    }
}
