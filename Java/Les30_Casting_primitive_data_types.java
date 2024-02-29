package Java;

public class Les30_Casting_primitive_data_types {
    public static void main(String[] args) {
        //Урок 30: Приведение примитивных типов данных.
        int i = 23;
        short s = 123;
        byte b = 1;
        double d = 123.23;
        float f = 12.34f;
        long l = 14251251251512L; // в конце long Нужно писать L

        int a = 123;
        long l1 = a;     // неявное приведение
        int x = (int)l1; // явное приведение

        int q = 123;
        double w = q; // Неявное приведение

        double e =123.6;
        int y = (int) e; // явное приведение, при конвертации double в int потеряется часть после .

       long t =  Math.round(e);
        //.round - метод для округления до целого числа
        System.out.println(t);

        byte u = (byte) 129; // конвертировать неявно не получится, так как превышено максимальное
        //значение byte, а при неявном конвертировании u станет равна числу в пределах для byte
        System.out.println(u);

        }
    }
