package Marathon.Day8;
/**
 2. Скопируйте класс Самолет из задания дня 6.
 Внесите изменения в класс таким образом, чтобы следующий код выводил информацию о самолете,
 аналогично вызову метода info().
 Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000); System.out.println(airplane);
 */
public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(2000,180,8500,1000);
        System.out.println(airplane);
    }
}
