package Java.Les47_Serialization_Part3_Transient_serialVersionUID;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -372203743604454371L;
    //serialVersionUID нужен, для того чтобы помечать состояние класса, например мы записали
    //файл, прошло 5 лет, над фалом работали люди, класс Person изменился, соответственно и
    //serialVersionUID изменится и при чтении файла и записи его в переменную будет ошибка, так
    //как класс персон изменился настолько сильно, что изменился и serialVersionUID

    //Для разрешения Java сериализовывать объекты, необходимо реализовать интерфейс Serializable
    private  int id;
    // для того чтобы не сериализовывать поле используем слово transient. Это нужно чтобы не
    //сериализовывать не нужные для нас поля, неважные или технические, для целых чисел
    //значение, которое не было записано с помощью transient будет равно 0
    private  String personName;
    //Для ссылочных типов данных при использовании transient значение будет равно null
    private int age;
    private byte type;

    public Person (int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return personName;
    }
    public String toString(){
        return id + " : " + personName;
    }
}
