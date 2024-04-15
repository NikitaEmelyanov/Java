package AlgorithmsAndDataStructures;

/**
 * Урок 10. Двоичный (Бинарный) поиск
 */
public class Les10_Binar_search {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-1, 3, 5, 8, 10, 15, 16, 20}, 16));


        int[] a = {-5, -2, 1, 5, 6, 8, 10, 20};
        System.out.println(binarySearch2(a, 1, 0, a.length - 1));
        // начальные low и high надо передавать в аргументы


        /**
         * Линейный поиск
         */
        //Ввод: массив А, состоящий из n элементов и значение k, которые мы ищем в массиве
        //Вывод: индекс i, такой что A[i] = k. Если такого i нет, то -1. Если элементов A[i] = k
        // несколько, то вернуть любой из них, например первый)
        // 5  2  1  -3  7  10  25  232  1  Ищем 10
        // |
        // 10?
        //Да, возвращаем индекс
        //Нет - идем дальше
        //Сложность алгоритма в худшем случе O(n)
    }

    public static int linearSeach(int[] A, int k) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == k)
                return i;
        }
        return -1;
    }

    /**
     * Двоичный поиск
     */
    //Идея: отсортировать исходный массив А
    // -3  1  1  2  5  7  10  25  232
    //Алгоритм поиска числа k в отсортированном массиве:
    //1) Смотрим число в центре
    //2) Если оно больше k - рассматриваем левый подмассив
    //3) Если оно меньше k - рассматриваем правый подмассив
    //4) Если оно равняется k - нашли число, возвращаем его индекс
    //5) повторяем пока подмассив не станет пустым

    //Пример
    //Ищем 50 в массиве
    //Индекс     1  2  3   4    5   6   7   8   9   10  11
    //Число      3  5  8   10   12  15  18  20  20  50  60
    //           |                   |                   |
    //          low                 mid                 high
    //mid = low + (high - low) / 2
    //2 этап
    //Индекс      7   8   9   10  11
    //Число      18  20  20  50  60
    //           |        |       |
    //          low      mid      high
    //3 этап
    //Индекс     10  11
    //Число      50  60
    //         /  |     \
    //      low   mid   high
    //mid == искомое число, возвращаем индекс mid

    //Сложность алгоритма в худшем случе
    //В худшем случе мы должны в ходе работы алгоритма прийти от массива размера n к массиву размера 1
    //Каждую итерацию работы алгоритма массив, где производится поиск, уменьшается в 2 раза
    // (выбирается либо левый подмассив, либо правый подмассив)
    //Алгоритм делит массив размера n на 2 столько раз (k), чтобы получить подмассив длинны 1
    // (в худшем случае)
    //Нас интересует k - столько раз массив делится на подмассивы. Это и будет оценкой сложности
    // алгоритма в худшем случае.
    //Сколько раз надо делить n на 2, чтобы получить 1 == Сколько раз надо умножить 2 на себя,
    // чтобы получить n
    //n=2^k == log2(n)
    //Сложность алгоритма двоичного поиска O(log(N))
    //Если число N - не степень двойки, то выбираем такое наименьшее k, что 2^k > N
    //O(log(N)) гораздо лучше, чем O(N)
    //log2(50000) ~ 15.6
    //Пример из жизни - в словаре 50 000 слов нужное слово будет находиться не за 50 000 итераций в
    // худшем случае, а максимум за 16 итераций
    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
     * Реализация двоичного поиска с помощью рекурсии
     */
    //На каждом вызове метода должны быть:
    // 1) Подсчет индекса mid
    // 2) Проверка (т.н base case или условие выхода из рекурсии). Либо мы нашли искомое число и
    // выходим из рекурсии, либо подмассив пустой, искомого числа в массиве нет и мы возвращаем -1.
    // 3) Рекурсивный вызов либо левого подмассива, либо правого подмассива.


    //Сигнатура метода (один из возможных вариантов):
    public static int binarySearch2(int[] sortedArray, int key, int low, int high) {
        // считаем индекс центрального элемента
        int middle = low + (high - low) / 2;

        // base case (условие выхода) - регион поиска пустой
        if (low > high) {
            // не нашли элемента, который равен ключу
            return -1;
        }

        if (key == sortedArray[middle]) {
            // в случае, если элемент в центре равняется ключу (нашли элемент)
            return middle;
        } else if (key < sortedArray[middle]) {
            // рекурсивный вызов для левого подмассива
            // не забывайте здесь ключевое слово return (подумайте, зачем оно нужно)
            return binarySearch2(sortedArray, key, low, middle - 1);
        } else {
            // рекурсивный вызов для правого помассива
            return binarySearch2(sortedArray, key, middle + 1, high);
        }
    }
}