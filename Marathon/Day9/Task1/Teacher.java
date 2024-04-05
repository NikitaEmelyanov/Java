package Marathon.Day9.Task1;

public class Teacher extends Human {
    String item = "It Technology";

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Teacher(String name) {
        super(name);
    }

    public Teacher(String name, String item) {
        super(name);
        this.item = item;
    }
    public void printInfo(){
        System.out.println("Этот человек с именем "+name);
        System.out.println("Этот преподаватель с именем "+name);
    }
}
