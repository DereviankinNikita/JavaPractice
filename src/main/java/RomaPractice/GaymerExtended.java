package RomaPractice;

public class GaymerExtended {
    private String name;
    private int age;
    private int steam_lvl;
    private int hardcore_lvl;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSteamlvl() {
        return steam_lvl;
    }

    GaymerExtended() {
        name = "horny";
        age = 13;
        steam_lvl = hardcore_lvl = 0;
    }

    GaymerExtended(GaymerExtended ob) {
        this.name = ob.name;
        this.age = ob.age;
        this.steam_lvl = ob.steam_lvl;
        setHardcore();
    }

    private void setHardcore() {
        hardcore_lvl = (age * steam_lvl) * 10;
    }

    GaymerExtended(String n, int a, int s) {
        name = n;
        age = a;
        steam_lvl = s;
        setHardcore();
    }

    public void showHardcoreLvl() {
        System.out.println("GAYmer: "+getName());
        int a = 1000, b = 1500, c = 2000;

        if (hardcore_lvl < a & hardcore_lvl != 0) {
            System.out.println("Уровень его скилла = " + hardcore_lvl + " единиц\nОчень низкий - git good!");
        } else if (hardcore_lvl == 0){
            System.out.println("Уровень скилла ЭТОГО РАКА  = " + hardcore_lvl + " единиц\nНу ты и рачина, удаляй кампутер");}
        if (hardcore_lvl > a & hardcore_lvl < b){
            System.out.println("Его уровень скилла = " + hardcore_lvl + " единиц\nСредний показатель, есть куда расти.");}

        if (hardcore_lvl > b & hardcore_lvl <= c) {
            System.out.println("Уровень его скилла = " + hardcore_lvl + " единиц\nОчень высокий уровень!!!");
        } else if (hardcore_lvl > c)
            System.out.println("Уровень его скилла = " + hardcore_lvl + " единиц\nПросто божественный уровень!!!");
        System.out.println("___________________________________");
    }


}
