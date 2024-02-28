package Les9_Contract_hashcode_equals;

import java.util.Objects;

public class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
        // Метод hashCode() конвертирует объект произвольной длинны в целое число фиксированной длинны,
        //это называется хешированием. Поскольку целые числа сравнивать проще чем объекты, метод
        // работает быстрее чем equals(). Стоит отметить что, если хеш-коды двух объектов одинаковые
        //сами объекты не всегда одинаковые, такие случаи, когда хеш-коды одинаковые, а сами объекты
        //разные называются коллизии, это связано с тем что примитивный тип данных (Целое число)
        //ограничено по диапазону, соответственно и ограничено количество этих целых чисел для
        // хеш-кодов. А уже при появлении коллизии мы обращаемся к методу equals().

        //Контракт hashCode() equals()
        //1)У двух проверяемых объектов вызываем метод hashCode()
        //  Если хэши разные -> два объекта точно разные
        //2)Если хэши одинаковые - вызываем equals()
        //3)equals() выдает точный ответ
    }
}
//Нужно переопределять 2 метода hashCode() и equals() для сравнения объектов по смыслам. Поскольку
//метод equals() очень долгий при сравнивании нескольких объектов это сильно замедлит программу, по
//этому сначала объекты сравниваются через hashCode(), он намного быстрее, но не всегда корректно
//работает, поэтому equals() его проверяет