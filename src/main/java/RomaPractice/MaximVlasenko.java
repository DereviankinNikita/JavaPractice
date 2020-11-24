package RomaPractice;

public class MaximVlasenko {
    public static void main(String[] args) {
        Gamer max = new Gamer();
        max.gameLvl = 5;
        max.age = 22;
        max.show();
        int a = 1000, b = 1500, c = 2000;

        if (max.hdcrLvl < a) {
            System.out.println("Уровень вашего скилла -" + max.hdcrLvl + " единиц\nОчень низкий - git good!");
        }
        if (max.hdcrLvl > a && max.hdcrLvl < b) {
            System.out.println("Ваш уровень скилла - " + max.hdcrLvl + " единиц\nСредний показатель, есть куда расти.");
        }
        if (max.hdcrLvl > c) {
            System.out.println("Уровень вашего скилла - " + max.hdcrLvl + " единиц\nОчень высокий уровень!!!");
        }
    }
}
