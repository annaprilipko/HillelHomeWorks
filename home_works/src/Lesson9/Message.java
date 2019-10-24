package Lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Message {
    String message;
    Date date;
    String phoneNumber;

    public Message(String message, Date date, String phoneNumber) {
        this.message = message;
        this.date = date;
        this.phoneNumber = phoneNumber;
    }

    Collection<Message> find(Collection<Message> messages, String value){

        List<Message> foundedMessages = new ArrayList<>();

        for (Message item: messages) {
            if(item.message.contains(value) || item.phoneNumber.contains(value)){
                foundedMessages.add(item);
            }
        }

        return foundedMessages;
    }

    @Override

    public String toString(){
        return String.format("Messege=%s", this.message);

    }
}
