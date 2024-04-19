package Marathon.Day12.Task5;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. *Выполнять в подпапке task5 в day12*
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы
 * есть не только имя, но и возраст. Соответственно, теперь под участником понимается не строка, а
 * объект класса MusicArtist. Необходимо реализовать класс MusicArtist и доработать класс MusicBand
 * (создать копию класса) таким образом, чтобы участники были - объекты класса MusicArtist. После
 * этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и проверить
 * состав групп после слияния. Методы для слияния и для вывода участников в консоль необходимо тоже
 * переработать, чтобы они работали с объектами класса MusicArtist.
 */
public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Grace Slick",50));
        members1.add(new MusicArtist("Marty Balin",35));
        members1.add(new MusicArtist("Paul Kantnerk",24));
        members1.add(new MusicArtist("Jorma Kaukonen",40));
        members1.add(new MusicArtist("Jack Casady",45));
        members1.add(new MusicArtist("Spencer Dryden",42));

        Marathon.Day12.Task5.MusicBand band1 = new Marathon.Day12.Task5.MusicBand("Jafferson Airplane",1965, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("John Lennon",32));
        members2.add(new MusicArtist("Paul McCartney",54));
        members2.add(new MusicArtist("Ringo Starr",61));
        members2.add(new MusicArtist("George Harrison",45));

        Marathon.Day12.Task5.MusicBand band2 = new Marathon.Day12.Task5.MusicBand("The Beatles",1960,members2);

        band1.printMembers();
        band2.printMembers();

        Marathon.Day12.Task5.MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}
