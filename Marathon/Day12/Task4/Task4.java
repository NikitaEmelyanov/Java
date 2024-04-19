package Marathon.Day12.Task4;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. *Выполнятьвподпапке task4 вd ay12*
 * Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было
 * добавлять и удалять участников. Под участником понимается строка (String)с именем и фамилией.
 * Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А
 * переходят в группу B. Название метода: transferMembers. Этот метод принимает в качестве аргументов
 * два экземпляра класса MusicBand. Реализовать метод printMembers (в классе MusicBand), выводящий
 * список участников в консоль. Проверить состав групп после слияния.
 */
public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Grace Slick");
        members1.add("Marty Balin");
        members1.add("Paul Kantnerk");
        members1.add("Jorma Kaukonen");
        members1.add("Jack Casady");
        members1.add("Spencer Dryden");

        MusicBand band1 = new MusicBand("Jefferson Airplane", 1965,members1);

        List<String> members2 = new ArrayList<>();
        members2.add("John Lennon");
        members2.add("Paul McCartney");
        members2.add("Ringo Starr");
        members2.add("George Harrison");

        MusicBand band2 = new MusicBand("The Beatles", 1960,members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}
