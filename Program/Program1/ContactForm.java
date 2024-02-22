package Program.Program1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {
    //expends - наследование JFrame - основной встроенный класс в Java Swing - встроенная библиотека java
    //для работы с графическим дизайном. Так же для работы с дизайном приложения существует библиотека JavaFX, но она намного
    //сложнее и не является встроенной.

    JTextField name_field, email_field;
    JRadioButton male, female;
    JCheckBox check;

    public ContactForm(){
        super("Контактная форма");
        //title - название приложения в JFrame
        super.setBounds(200, 100, 300,200);
        //.setBounds() - обращение к методу, который показывает расположение графических элементов по X и Y, так
        //же метод может задать размер графического элемента ширина и высота
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //.setDefaultCloseOperation() - метод позволяющий указать что будет происходить при закрытии приложения
        //Для реализации прекращения работы при закрытии приложения обращаемся к методу JFrame с параметром
        //EXIT_ON_CLOSE

        Container container = super.getContentPane();
        // Для корректной работы нужно импортировать метод Container для этого нужно нажать на него и
        //нажать Options+Enter. Сам этот контейнер представляет собой слой на котором и будут располагаться
        //графические элементы. После импорта появляется библиотека awt, где можно создавать кнопки, радио кнопки
        //контейнеры и прочее

        //.getContentPane() - метод возвращающий объект, созданный на основе класса Container
        container.setLayout(new GridLayout(5,2,2,10) );
        //.setLayout() - метод позволяющий указать настройки для контейнера и расположение объектов в нем
        // При выделении памяти предлагаются варианты расположения объектов
        //GroupLayout - позволяет группировать объекты
        //CardLayout - расположение объектов один под другим как в карточной колоде
        //GridLayout - система сеток, где можно указать кол-во рядов, кол-во столбцов и отступы между ними

        // !!! Почитать про другие варианты !!!

        JLabel name = new JLabel("Введите имя: ");
        //Создаем текстовую надпись на основе класса JLabel (Label - надпись)
        name_field = new JTextField("",1);
        // На основе класса JTextField создаем текст, который будет вводить пользователь и кол-во колонок

        JLabel email = new JLabel("Введите email: ");
        email_field = new JTextField("@",1);

        container.add(name);
        // Если обратиться к контейнеру мы можем передать в него переменные созданные на основе классов
        //через метод .add
        container.add(name_field);
        container.add(email);
        container.add(email_field);

        male = new JRadioButton("Мужской");
        //JRadioButton - класс для создания радио кнопок
        female = new JRadioButton("Женский");
        check = new JCheckBox("Согласен?", false);
        // JCheckBox - Класс для создания кнопок с галочкой, так же можно отметить изначальное
        // нахождение галочки, где true - галочка установлена изначально, false - нет
        JButton send_button = new JButton("Отправить");
        //JButton - класс для создания кнопок
        male.setSelected(true);
        //Через метод .setSelection обращаемся к переменной male и указываем true, то есть изначально будет
        //установлено Мужской
        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        //Класс позволяющий создавать группу кнопок. Например, для выбора Мужского или Женского пола
        //нужно чтобы эти переменные были в одной группе, для возможности их использования поочередно, то есть
        // при выборе Мужской, женский автоматически станет неактивным и наоборот
        group.add(male);
        group.add(female);

        container.add(check);
        container.add(send_button);

        send_button.addActionListener(new ButtonEventManager());
        //.addActionListener - метод обработки событий
    }
    class ButtonEventManager implements ActionListener{
        //Создаем вложенный класс вне тела конструктора с названием выделяемой памяти, которое мы указывали в
        // конструкторе. Класс будет наследовать данные из интерфейса ActionListener.
        //Реализуем интерфейс ActionListener с помощью options+Enter и у нас появляется метод actionPerformed,
        //где осталось только прописать код. То есть при каждом нажатии на кнопку send_button мы начинаем
        // обрабатывать событие. Это событие мы получаем из-за взаимодействия с вложенным классом в связи с тем,
        // что мы выделили память данного класса, последний в свою очередь наследует данные из интерфейса
        //ActionListener, который реализуется за счет метода actionPerformed. Следовательно, при каждом нажатии
        //кнопки send_button происходит реализация метода actionPerformed и записанного в него кода.
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
// Поскольку объекты name_field и email_field изначально создавались внутри конструктора На основе класса
// JTextField мы не могли приравнять их к переменной name, поэтому мы переносим их за тело конструктора в тело
//класса. Получается что мы в конструкторе уже обращаемся к этим объектам и теперь можем приравнять к ним name
            String email = email_field.getText();
// За счет метода .getText мы получаем весть текст, который вводил пользователь

            String isMale = "Мужской";
            if(!male.isSelected())
                isMale = "Женский";
// Для реализации проверки так же выносим создание объектов male и female за пределы конструктора, а внутри
// конструктора уже обращаемся к ним, тоже-самое для переменной check. Теперь в дальнейшем мы сможем
// предоставить собранную информацию пользователю в виде всплывающего окна


            boolean checkBox = check.isSelected();

            JOptionPane.showMessageDialog(null, "Ваша почта:" +email +"\nВаш пол: "
                    + isMale + "\nВы согласны? " +checkBox, "Привет, " + name, JOptionPane.PLAIN_MESSAGE);
            //JOptionPane - класс для создания всплывающих окон. .showMessageDialog - метод для создания
            //всплывающих окон. null - без привязки к родительскому компоненту, далее текст сообщения, далее
            //текст всплывающего окна, затем обращаемся к методу JOptionPane и указываем параметр для
            // всплывающего окна .PLAIN_MESSAGE
        }

    }

}
