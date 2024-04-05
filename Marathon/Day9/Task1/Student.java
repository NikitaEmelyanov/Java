package Marathon.Day9.Task1;

public class Student extends Human {
    String nameGroup = "АИ-111" ;
    public Student(String name) {
        super(name);
    }
    public void printInfo(){
        System.out.println("Этот человек с именем "+name);
        System.out.println("Этот студент с именем "+name);
    }
}
