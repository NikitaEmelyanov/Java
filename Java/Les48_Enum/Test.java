package Java.Les48_Enum;

public class Test {
    //До появления Enum приходилось присваивать каждому животному или чему то еще свое значение
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args) {
        int animal = DOG;

        switch (animal){
            case DOG:
                System.out.println("It's a dog");
            case FROG:
                System.out.println("It's a frog");
                break;
            default:
                System.out.println("It's not an animal");

        }

    }
}
