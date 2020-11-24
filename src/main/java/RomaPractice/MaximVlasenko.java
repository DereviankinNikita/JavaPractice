package RomaPractice;

public class MaximVlasenko {
    public static void main(String[] args) {
        Gamer max = new Gamer();
        max.gameLvl = 0;
        max.age = 22;
        max.show();
        int a = 1000, b = 1500, c = 2000;

        if (max.hdcrLvl < a && max.hdcrLvl!= 0) {
            System.out.println("Уровень вашего скилла = " + max.hdcrLvl + " единиц\nОчень низкий - git good!");
        }else if(max.hdcrLvl ==0)
            System.out.println("Уровень ТВОЕГО скилла = "+ max.hdcrLvl+ " единиц\nНу ты и рачина, удаляй кампутер");
        if (max.hdcrLvl > a && max.hdcrLvl < b)
            System.out.println("Ваш уровень скилла = " + max.hdcrLvl + " единиц\nСредний показатель, есть куда расти.");

        if (max.hdcrLvl > b && max.hdcrLvl <= c) {
            System.out.println("Уровень вашего скилла = " + max.hdcrLvl + " единиц\nОчень высокий уровень!!!");
        } else if (max.hdcrLvl > c)
            System.out.println("Уровень вашего скилла = " + max.hdcrLvl + " единиц\nПросто божественный уровень!!!");
    }

}

