package RomaPractice;

public class Gamer {
    public String name;
    public int gameLvl, age, hdcrLvl;
    //char d=9164, g=2593;

    public void show() {
        System.out.println("Имя игрока " + name + "\n");
        hdcrLvl = (age * gameLvl) * 10;
        int a = 1000, b = 1500, c = 2000;

        if (hdcrLvl < a && hdcrLvl != 0) {
            System.out.println("Уровень его скилла = " + hdcrLvl + " единиц\nОчень низкий - git good!");
        } else if (hdcrLvl == 0){
            System.out.println("Уровень скилла ЭТОГО РАКА  = " + hdcrLvl + " единиц\nНу ты и рачина, удаляй кампутер");}
        if (hdcrLvl > a && hdcrLvl < b){
            System.out.println("Его уровень скилла = " + hdcrLvl + " единиц\nСредний показатель, есть куда расти.");}

        if (hdcrLvl > b && hdcrLvl <= c) {
            System.out.println("Уровень его скилла = " + hdcrLvl + " единиц\nОчень высокий уровень!!!");
        } else if (hdcrLvl > c)
            System.out.println("Уровень его скилла = " + hdcrLvl + " единиц\nПросто божественный уровень!!!");
        System.out.println("___________________________________");

    }
}

