package AlgorithmsAndDataStructures;

/**
 * Урок 4. Большое О (Big O Notation). Сложность алгоритма. Часть 2
 */

public class Les4_Big_O_notation_Part_2 {
    public static void main(String[] args) {
        System.out.println(fibEffective(100));
    }
        //Правила использования Большого О
        //1) Константы игнорируются
        //   7n^3 = O(n^3)
        //   (n^2)/3 = O(n^2)
        //2) В выражении мы учитываем только самую быстрорастущую функцию
        // (потому что при очень большом n только она и будет играть существенную роль)
        //   n^2 + n = O(n^2)
        //   2^n + n^9 = O(2^n)
        //3) Основание логарифма не пишем (так как они отличаются друг от друга на константу)
        //   log2(n), log3(n), log10(n) все равняются O(log(n))

        //Преимущества использования Большого О
        //1) Легче сравнивать алгоритмы
        //   (3n^2+2n+550)/2.5 vs 75+500n^2+1
        //               или
        //   O(n^2) vs O(n^2)
        //При этом мы можем пожертвовать точностью, так как чаще всего нас интересует только то,
        // как себя ведет алгоритм при увеличении аргумента
        //2)Сама запись становиться проще
        //  3n^2+5n+2       n+log(n)+sin(n)
        //     или               или
        //    O(n^2)             O(n)
        //3) Не думаем о деталях
        // Хотя мощность, архитектура ОС, ЯП и т.д. могут сильно сказываться на времени выполнения,
        // они не не влияют на асимптотическую оценку Big O, так как являются константами и не
        // зависят от аргумента

        //Минусы использования Большого О
        //1) Теряем информацию о константах
        //   100х и х - это одно и то же
        //2) Большое О - это только асимптотическая оценка
        //Мы не узнаем время выполнения алгоритма на конкретных аргументах, мы узнаем то, как себя
        // ведет алгоритм при очень больших аргументах


        //Для корректной оценки в Big O нужно оценивать сложность каждой строки и после сокращения
        // констант получаем корректную асимптотическую оценку

        //O(n+n) = O(2n) = o(n)
        private static long fibEffective (int n){
            long[] arr = new long[n + 1]; //O(n)
            arr[0] = 0; //O(1)
            arr[1] = 1; //O(1)

            for (int i = 2; i <= n; i++)  //O(n)
                arr[i] = arr[i - 1] + arr[i - 2];

            return arr[n]; //O(1)
        }
    }
//O(n) + O(1) + O(1) + O(n) + O(1) = O(2n) + O(3) = O(2n+3) = O(n)
