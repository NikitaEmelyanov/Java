package Marathon.Day6;
/**
 * 3. Создать класс Teacher(Преподаватель), имеющий поля “Имя”, “Предмет”. Создать класс
 * Student(Студент) с полем “Имя”.
 * Каждый класс имеет конструктор (с параметрами), set и get методы по необходимости, а также
 * у преподавателя есть метод evaluate(оценить студента), принимающий в качестве аргумента
 *  студента, и работающий следующим образом: внутри метода случайным образом генерируется
 * число от 2 до 5, выводится строка: "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил
 * студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
 * Все слова, написанные большими буквами, должны быть заменены соответствующими значениями.
 * ОЦЕНКА должна принимать значения "отлично”, "хорошо”, "удовлетворительно" или
 * "неудовлетворительно", в зависимости от значения случайного числа.
 * Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки студента,
 * передав студента в качестве аргумента метода.
 */

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Георгий Иванович", "Теоретическая механика ");
        Student student = new Student("Олежка");

        teacher.eveluate(student);

    }
}
class Teacher {
    String name;
    String item;

    public void eveluate(Student student){
        Integer grade = (int) (Math.random()*6);
        if (grade==1)
            grade++;
        else if (grade==0)
            grade = grade+2;

        String gradeString = null;
        if (grade ==2)
            gradeString = "Неудовлетворительно";
        else if (grade ==3)
            gradeString = "Удовлетворительно";
        else if (grade ==4)
            gradeString = "Хорошо";
        else if (grade ==5)
            gradeString = "Отлично";



        System.out.println(grade);
        System.out.println("Преподаватель "+ name + " оценил студента с именем "+ student.name+ " " +
                "по предмету "+ item + " на оценку "+ gradeString);
    }
    public Teacher(String name, String item) {
        this.name = " Олег Николаевич ";
        this.item = " Теоретическая механика ";

    }
}
class Student{
    String name;

    public Student(String name) {
        this.name = "Олежка Смирнов";
    }
}