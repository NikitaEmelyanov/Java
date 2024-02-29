package Java;

import java.util.ArrayList;
import java.util.List;

public class Les33_Generics {
    public static void main(String[] args) {
        //Урок 33: ВВедение в параметризацию (Generics)
        //////////////////Java5//////////////////////////////
        List animals = new ArrayList();
        animals.add("Cat");
        //.add - метод для добавления переменной в ArrayList
        animals.add("Dog");
        animals.add("Frog");
        String animal = (String) animals.get(1);
        System.out.println(animal);
        // Практическое применение Donwcasting  при ArrayList

        //////////С появлением Generics /////////////////////
        List<String> ourAnimals = new ArrayList<String>();
        // <В треугольных скобках указывается тот класс, который будет
        // помечаться в Arraylist, а в скобках справа тип данных>
        ourAnimals.add("cat");
        ourAnimals.add("dog");
        ourAnimals.add("frog");

        String animals2;
        animals2 = ourAnimals.get(1);

        //////////////////Java7//////////////////////////////
        List<String> ourAnimals1 = new ArrayList<>();
        // С появлением Java 7 в треугольных скобках справа можно ничего
        // не указывать

        //Стоит отметить, что в Generics нельзя будет поместить значение
        // с другим типом данных, так как будет ошибка компиляции
    }
}
class Animal1 {

    public void eat() {
    }
}