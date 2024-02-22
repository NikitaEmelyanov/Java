package Java.Les25_Inheritance;

public class Dog extends Animal{
    public void eat(){
        System.out.println("dog is eating");
        //Поскольку мы ввели тот же самый метод, но с другими параметрами, получается, что мы
        //переопределили метод для класса потомка, и только в данном классе метод будет
        //работать так


    }

    public void bark(){
        System.out.println("I am barking");
    }
    public void showName(){
        System.out.println(name);
    }
}
