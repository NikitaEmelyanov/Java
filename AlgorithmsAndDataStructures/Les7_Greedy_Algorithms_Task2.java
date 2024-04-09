package AlgorithmsAndDataStructures;

/**
 * Урок 7. Жадные алгоритмы. Реализация алгоритма (часть 2)
 */

public class Les7_Greedy_Algorithms_Task2 {
    public static void main(String[] args) {
        int [] stations = {0,200,375,550,750,950};
        System.out.println(minStops(stations,400));

    }
    //return -1 if it's impossible to get from A to B
    public static int minStops (int[] stations, int capacity){
        int result = 0; //Оптимальное количество остановок
        int currentStop = 0;

        while (currentStop < stations.length -1 ){
            //-1 обеспечит выход из цикла, когда мы доедем до конечной точки
            int nextStop = currentStop;

            while (nextStop < stations.length -1 &&
                    stations [nextStop +1] - stations [currentStop] <= capacity)
                //Проверка можно ли доехать до следующей заправки, при учете того, что мы можем
                // проехать меньше или равное количество километров равное объему бака
            nextStop++;

            if (currentStop ==nextStop)
                return -1;
            if (nextStop <stations.length -1)
                result++;
            currentStop = nextStop;
        }
        return result;
    }
}
