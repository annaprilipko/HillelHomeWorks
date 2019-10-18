package Lesson9;

import javafx.util.Pair;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<>();

        contactList.add(new Contact("Denn", "111111111"));
        contactList.add(new Contact("Lena", "222222222"));
        contactList.add(new Contact("Kate", "333333333"));
        contactList.add(new Contact("Mike", "444444444"));
        contactList.add(new Contact("Gon", "555555555"));
        contactList.add(new Contact("Ivan", "666666666"));
        contactList.add(new Contact("Anna", "777777777"));
        contactList.add(new Contact("Heya", "888888888"));

        List<CallLog> callLogList = new ArrayList<>();

        callLogList.add(new CallLog("Lena", "222222222", new Date(), "3 min"));
        callLogList.add(new CallLog("Lena", "222222222", new Date(), "58 min"));
        callLogList.add(new CallLog("Denn", "111111111", new Date(), "320 min"));
        callLogList.add(new CallLog("Denn", "111111111", new Date(), "22 min"));
        callLogList.add(new CallLog("Denn", "111111111", new Date(), "89 min"));
        callLogList.add(new CallLog("Denn", "111111111", new Date(), "1 min"));
        callLogList.add(new CallLog("Gon", "555555555", new Date(), "15 min"));
        callLogList.add(new CallLog("Gon", "555555555", new Date(), "5 min"));
        callLogList.add(new CallLog("Gon", "555555555", new Date(), "9 min"));
        callLogList.add(new CallLog("Gon", "555555555", new Date(), "56 min"));
        callLogList.add(new CallLog("Gon", "555555555", new Date(), "89 min"));
        callLogList.add(new CallLog("Anna", "777777777", new Date(), "78 min"));
        callLogList.add(new CallLog("Anna", "777777777", new Date(), "5 min"));
        callLogList.add(new CallLog("Heya", "888888888", new Date(), "6 min"));
        callLogList.add(new CallLog("Ivan", "666666666", new Date(), "78 min"));
        callLogList.add(new CallLog("Ivan", "666666666", new Date(), "2 min"));
        callLogList.add(new CallLog("Ivan", "666666666", new Date(), "2 min"));
        callLogList.add(new CallLog("Mike", "444444444", new Date(), "2 min"));
        callLogList.add(new CallLog("Heya", "888888888", new Date(), "2 min"));
        callLogList.add(new CallLog("Heya", "888888888", new Date(), "2 min"));


        List<Message> messages = new ArrayList<>();

        messages.add(new Message("Bla-bla-bla", new Date(), "321"));
        messages.add(new Message("La-la-la-la", new Date(), "321"));
        messages.add(new Message("Oooooo", new Date(), "321"));

        //  4 задача: группировка звонков по контактам, вывод на экран

        Map<Contact, List<CallLog>> test = new HashMap<>();

        test = CombiningContactAndCallLog(contactList,callLogList);

        for (Map.Entry<Contact, List<CallLog>> item: test.entrySet()) {
            System.out.println(item.getKey() + ":");
            List<CallLog>listLogs = item.getValue();
            for (CallLog logs : listLogs) {
                System.out.println(logs);
            }
        }

        // 5 задача, вывод на экран
        List<Pair<Contact,Integer>> listOfTopFiveCalls = new ArrayList<>();
        listOfTopFiveCalls = topFiveCalls(test);

        for (Pair<Contact,Integer> item: listOfTopFiveCalls) {
            System.out.println(item);
        }


    }
//  4 задача: группировка звонков по контактам

    public static Map<Contact, List<CallLog>> CombiningContactAndCallLog(List<Contact> contacts, List<CallLog> callLogs){

        Map<Contact, List<CallLog>> resultOfCombining = new HashMap<>();

        for (Contact contact: contacts) {
            List<CallLog> resultOfCallLogs = new ArrayList<>();
            for (CallLog callLog: callLogs) {
                if(contact.phoneNumber.equals(callLog.phoneNumber)){
                    resultOfCallLogs.add(callLog);
                }
            }
            resultOfCombining.put(contact, resultOfCallLogs);
        }

        return resultOfCombining;
    }

    //  5 задача: Реализуйте вýвод топ-5 контактов с наиболþúим колиùеством звонков


    public static List<Pair<Contact,Integer>> topFiveCalls(Map<Contact, List<CallLog>> CombiningContactAndCallLog){
        List<Pair<Contact, Integer>> middleResultTopFiveCalls= new ArrayList<>();
        List<Pair<Contact, Integer>> resultTopFiveCalls= new ArrayList<>();

        List<Integer> pairIntegers = new ArrayList<>();

        for (Map.Entry<Contact, List<CallLog>> item: CombiningContactAndCallLog.entrySet()) {
            List<CallLog>listLogs = item.getValue();
            Integer numberOfCalls = listLogs.size();
            pairIntegers.add(numberOfCalls);
            Pair<Contact,Integer> pair = new Pair<>(item.getKey(),numberOfCalls);
            middleResultTopFiveCalls.add(pair);
        }


        Collections.sort(pairIntegers);
        Collections.reverse(pairIntegers);

        for (int i = 0; i < 5; i++){
            Integer number = pairIntegers.get(i);
            for (Pair<Contact,Integer>item: middleResultTopFiveCalls) {
                if(number.equals(item.getValue())){
                    Pair<Contact,Integer> pair = new Pair<>(item.getKey(), number);
                    resultTopFiveCalls.add(pair);
                }

            }
        }


        return resultTopFiveCalls;
    }

}
