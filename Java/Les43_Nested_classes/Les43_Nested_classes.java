package Java.Les43_Nested_classes;

public class Les43_Nested_classes {
    public static void main(String[] args) {
        //Урок 43: Вложенные классы.
        // В Java существует 3 типа вложенных классов (Нестатический, статический, вложенный
        //класс внутри метода)
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();
        //Классы можно создавать вне классов, внутри других классов и внутри методов

        Electrocar.Battery battery = new Electrocar.Battery();
    }
}
