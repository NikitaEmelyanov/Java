package Java.Les43_Nested_classes;

public class Electrocar {
    private int id;

    private class Motor{
        //Вложенный не статический класс имеет доступ к объекту и обычно имеет модификатор
        // доступа private, для ограничения доступа к данному классу. Вложенные не статические
        //классы нужны, когда объект класса сложный и комплексный и его нужно разделить на
        //подобъекты
        public void startMotor (){
            System.out.println("Motor" + id + " is starting...");
        }
    }
    public static class Battery{
        //Вложенный статический класс не имеет доступ к объекту, так как имеет модификатор
        //доступа public, такие классы могут использоваться из вне. Такой вложенный класс не
        // будет считаться подобъектом, а будет выполнять функцию логической группировки

        public void charge(){
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar (int id){
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        class SomeClass{
            //Вложенный класс находящийся внутри метода имеет доступ и к объектам (даже не
            //статическим) и к переменным метода в котором находится, если они будут
            //константами (имеют модификатор доступа final)
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);

            }
        }
        //Вложенный класс внутри метода это своего рода аналог анонимных классов, в дальнейшем
        //можно так же создать объект на основе данного класса и установить его в качестве
        //аргумента для другого метода

        System.out.println("Electrocar " + id + "is starting...");
    }
}
