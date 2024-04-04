package Marathon.Day8;


class Airplane {

    private static String producer = "Russia";
    private static int year;
    private static int length;
    private static int weight;
    private static int fuel;

    public static void info(){
        System.out.println("Это Самолет");
        System.out.println("Изготовитель самолета: "+ producer);
        System.out.println("Год выпуска самолета: "+ year);
        System.out.println("Длинна самолета: "+ length+" m ");
        System.out.println("Вес самолета: "+ weight+" kg ");
        System.out.println("Количество топлива в самолете: "+ fuel +" l ");
    }
    public Airplane(int year, int length, int weight, int fuel) {
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }
    public String toString (){
        return ("Изготовитель самолета" + producer) +"\n" +
                ("Год выпуска самолета: "+ year)  +"\n" +
                ("Длинна самолета: "+ length+" m ")+"\n" +
                ("Вес самолета: "+ weight+" kg ")+"\n" +
                ("Количество топлива в самолете: "+ fuel +" l ");

    }
}
