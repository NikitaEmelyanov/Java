package Marathon.Day7;

public class Player {
    private int stamina;
    public int getStamina() {
        return stamina;
    }
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayer = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayer <6)
            countPlayer ++;
    }
    public void run(){
        if (stamina==0)
            return;

        stamina--;

        if (stamina ==0)
            countPlayer--;
    }
    public static void info(){
        if (countPlayer<6){
            System.out.println("Команды неполные. На поле еще есть "+(6-countPlayer)+" свободных мест ");
        }else {
            System.out.println("Мест в командах больше нет");
        }

    }
}

