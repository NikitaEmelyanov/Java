package JavaPRO.Les33_Lambda_Part_1;

interface Executable{
    int execute(int x);
}
class Runner{
    public void run (Executable e){
        int a = e.execute(10);
        System.out.println(a);
    }
}
//Способ №1 Создание класс с реализацией интерфейса Executable
class ExecutableImplementation implements Executable{
    @Override
    public int execute(int x) {
        System.out.println("Hello");
        return x+1;
    }
}
//Способ №2 Создание анонимного класса сразу внутри аргумента
public class Test {
    public static void main (String[] args){
        Runner runner = new Runner();
        runner.run(new ExecutableImplementation()); //Способ №1
        runner.run(new Executable() { //Способ №2
            @Override
            public int execute(int x) {
                System.out.println("Hello");

                return x+1;
            }
        });
        //Способ №3 Лямбда выражения
        int a = 1;
        runner.run((int x) -> {
            System.out.println("Hello");
            System.out.println("Goodbye");
            //При использовании лямбды выражений, если есть несколько строчек кода тело лямбды
            // выражения заключается в фигурные скобки, а каждая строчка кода заканчивается точкой
            // с запятой
            return x+5 + a;
            //Если в сигнатуре метода возвращает какой-то тип данных, то и в лямбде должен
            // возвращаться этот тип данных

            //Если лямбда только возвращает значение синтаксис будет выглядеть так
            // runner.run(() ->5);

            //Так же если в методе в качестве аргумента передано какое-то значение
            // (в данном случае целое число) его так же нужно указать в лямбде и можно использовать
            // в теле лямбды выражения, и если лямбда только возвращает какое-то значение синтаксис
            // будет выглядеть так: runner.run(x -> x+5); Тип данных int можно не указывать, так
            // как Java понимает, что ожидается целое число, круглы скобки тоже можно не писать,
            // так как всего один аргумент передается. Круглые скобки прописываются, если нужно
            // передать несколько аргументов

            //Если нужно получить доступ к переменной, которая находится вне лямбды выражения, это
            // возможно сделать, если эта переменная имеет модификатор доступа final или
            // effectively final (то есть переменная не будет изменяться после декларации), то есть
            // переменная или является константой явно или является константой не явно,
            // то есть не изменяется в дальнейшем

            //Поскольку у лямбды выражения нет своей собственной области видимости, если у методов
            // область видимости ограничивается телом метода, то у лямбды выражения область
            // видимости находится там где было создано лямбда выражение
        });
    }
}
