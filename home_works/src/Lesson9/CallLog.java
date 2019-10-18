package Lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class CallLog {
    String name;
    String phoneNumber;
    Date date;
    String duration;

    public CallLog(String name, String phoneNumber, Date date, String duration) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.duration = duration;
    }

    Collection<CallLog> find(Collection<CallLog> callLogs, String value){

        List<CallLog> foundedLogs = new ArrayList<>();

        for (CallLog item: callLogs) {
            if(item.name.contains(value) || item.phoneNumber.contains(value)){
                foundedLogs.add(item);
            }
        }

        return foundedLogs;
    }

    public String toString(){
        return String.format("name=%s, phoneNumber=%s, date = %s, duration=%s", name, phoneNumber, date, duration);

    }
}
