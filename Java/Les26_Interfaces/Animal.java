package Java.Les26_Interfaces;

public class Animal implements I_info {
    //Для реализации интерфейса из 19 урока вводим ключевое слово implements и название интерфейса
    //У нас появляется ошибка, так как мы не реализовали методы описанные в данном интерфейсе,
    //для исправления нажимаем на красную лампочку и нажимаем на implements methods и все методы реализуются
    //автоматически через @Override
    public int id;

    public Animal(int id){
        this.id = id;
    }
    public void sleep(){
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is "+ this.id);
        //Можно реализовать метод описанный в интерфейсе в ручную, а можно через @(аннотацию)
        // и Override автоматически (при нажатии Shift+Option+Enter)

    }

}
