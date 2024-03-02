package JavaPRO;

import java.util.*;

public class Les12_Comparable {
    public static void main(String[] args) {
        // Урок 12 : Интерфейс Comparable (англ. Подходящий для сравнения)

        List<Person0> peopleList = new ArrayList<>();
        Set<Person0> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);
        //Поскольку не задан естественный порядок Java метод sort выдает ошибку, для корректной работы
        //нужно реализовать в классе интерфейс Comparable

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }
    private static void addElements (Collection collection){
        collection.add(new Person0(4, "George"));
        collection.add(new Person0(3, "Katy"));
        collection.add(new Person0(1, "Mo"));
        collection.add(new Person0(2, "Tom"));
    }
}
class Person0 implements Comparable <Person0> {
    private int Id;
    private String name;
    private int id;

    public Person0(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person0{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person0 person0 = (Person0) o;

        if (Id != person0.Id) return false;
        return Objects.equals(name, person0.name);
    }

    @Override
    public int hashCode() {
        int result = Id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    //Реализация интерфейса Comparable прописывается в методе compareTo
    @Override
    public int compareTo(Person0 o) { //Установка естественного порядка сортировки
        if (this.name.length() > o.getName().length()){
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        }else {
            return 0;
        }

    }
}