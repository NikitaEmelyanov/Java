package Java.Les34_Wildcards_of_Generics;

public class Animal {

    public Animal(){

    }
    private int id;
    public Animal (int id){
        this.id = id;
        //Поскольку мы переопределили стандартный конструктор (который был скрыт), теперь в классе Dog будет ошибка
        //поскольку он наследует данные из конструктора по умолчанию, соответственно нужно или создать вручную
        //пустой конструктор или прописать в конструкторе у Dog то же значение id

    }
    public void eat(){
        System.out.println("Animal is eating...");
    }
    public String toString(){
        return String.valueOf(id);
        //.valueOf - метод конвертирующий число в строку
    }
}
