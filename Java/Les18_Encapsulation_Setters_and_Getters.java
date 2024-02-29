package Java;

public class Les18_Encapsulation_Setters_and_Getters {
    public static void main(String[] args) {
        //Урок 18: Инкапсуляция. Сеттеры и геттеры.
        Person4 person1 = new Person4();
        person1.setName("");
        person1.setAge(12);
        System.out.println("Выводим значение в main методе:" + person1.getName());
        System.out.println("Выводим значение в main методе:" + person1.getAge());

    }
}

class Person4{
    private String name;
    //Модификатор доступа private не дает использовать Классы, переменные, методы в других классах
    //Это нужно для обеспечения инкапсуляции и для того чтобы пользователь или другой сторонний
    //человек не мог обращаться напрямую к классам, полям и прочему без проверки, проверку можно
    //осуществить через Сеттеры и Геттеры.
    private int age;

    public void setName (String userName){
        if (userName.isEmpty()){
            //Метод .isEmpty класса String возвращает true, если строка пустая, если строка
        //заполнена возвращает false
            System.out.println("Ты ввел пустое имя");
        } else {
        name = userName;}
    }
    public String getName(){
        return name;
    }
    public void setAge (int userAge){
        if (userAge<0){
            System.out.println("Возраст должен быть положительным");
        } else {
        age = userAge;}
    }
    public int getAge(){
        return age;
    }


    void speak(){
        for (int i = 0 ; i<3 ; i++){
            System.out.println("Меня зовут " + name + ",мне "+ age + "лет");
        }

        }
    }
// После изменения login на name и соответствующей внутренней логики, для пользователя ничего не
//изменилось, так как в основном классе используются методы Сеттеров и Геттеров