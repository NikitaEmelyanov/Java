package Java.Les48_Enum;

public enum Season {
    SUMMER(35), WINTER(-30), AUTUMIN(10), SPRING(20);
    //Все перечисления это не строки, а отдельные объекты класса

    private int temperature;

    Season (int temperature){
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
