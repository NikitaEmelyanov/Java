package Java.Les46_Serialization_Part2_Serialization_Arrays;

import java.io.Serializable;

public class Person implements Serializable {
    //Для разрешения Java сериализовывать объекты, необходимо реализовать интерфейс Serializable
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person (int id, String name){
        this.id = id;
        this.name =name;
    }
    public String toString(){
        return id + " : " + name;
    }
}
