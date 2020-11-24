package RomaPractice;

public class Gamer {
    public String name;
    public int gameLvl, age, hdcrLvl;

    public void show() {
        hdcrLvl = (age * gameLvl) * 10;
    }
}

