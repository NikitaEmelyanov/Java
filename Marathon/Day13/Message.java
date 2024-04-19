package Marathon.Day13;

import java.util.Date; // Класс для работы с датами

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;


    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }
    public User getReceiver() {
        return receiver;
    }
    public String getText() {
        return text;
    }
    @Override
    public String toString() {
        return "FROM: " +  this.sender +
                "\nTO: " + receiver +
                "\nON: " + date + "\n" +
                text+ "\n";
    }
}
