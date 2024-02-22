package Java.Les19_this;

public class Les19_this {
    public static void main(String[] args) {
        //Урок 19: Ключевое слово this.
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Bobby");
        human1.getInfo();
    }

}

class Human{
    String name;
    int age;
    public void setName (String name){
        this.name = name;
    }
    // Чтобы не прописывать name = _name, можно обратиться через ключевое слово this.
    // обратиться к нужному значению, То есть через this. обращаемся к полям классов и
    // приравниваем их к значениям, которые мы получаем из параметров
    public void setAge(int age) {
        this.age = age;
    }
    // Можно использовать this. для поиска внутри данного класса, поскольку данный класс
    // наследует все от родительского класса, а у поля класса color модификатор доступа public,
    // так же в данном случае можно использовать super. для обращения к напрямую к классу
    // родителю, опять-таки, потому что у поля класса модификатор доступа public.

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.println(name+","+age);
    }
}
// Так же можно обращаться ко всем методам, которые использовались в классе родителе или просто или через this.
//или через super. Механика такая же, главное чтобы у методов был модификатор доступа public или protected
