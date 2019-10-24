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


        List<Message> listOfMessages = new ArrayList<>();

        listOfMessages.add(new Message("Bla-bla-bla", new Date(), "222222222"));
        listOfMessages.add(new Message("La-la-la-la", new Date(), "111111111"));
        listOfMessages.add(new Message("Oooooo", new Date(), "666666666"));
        listOfMessages.add(new Message("Bla-bla-bla", new Date(), "444444444"));
        listOfMessages.add(new Message("La-la-la-la", new Date(), "222222222"));
        listOfMessages.add(new Message("Oooooo", new Date(), "444444444"));
        listOfMessages.add(new Message("Bla-bla-bla", new Date(), "222222222"));
        listOfMessages.add(new Message("La-la-la-la", new Date(), "555555555"));
        listOfMessages.add(new Message("Oooooo", new Date(), "888888888"));
        listOfMessages.add(new Message("Bla-bla-bla", new Date(), "777777777"));
        listOfMessages.add(new Message("La-la-la-la", new Date(), "555555555"));
        listOfMessages.add(new Message("Oooooo", new Date(), "333333333"));

        //  4 задача: группировка звонков по контактам, вывод на экран, test

        System.out.println("Вывод звонков по контактам");

        Map<Contact, List<CallLog>> test = new HashMap<>();

        test = CombiningContactAndCallLog(contactList,callLogList);

        for (Map.Entry<Contact, List<CallLog>> item: test.entrySet()) {
            System.out.println(item.getKey() + ":");
            List<CallLog> listLogs = item.getValue();
            for (CallLog logs : listLogs) {
                System.out.println(logs);
            }
        }

        System.out.println("Вывод топ 5 контактов");

        // 5 задача, вывод на экран
        List<Pair<Contact,Integer>> listOfTopFiveCalls = new ArrayList<>();
        listOfTopFiveCalls = topFiveCalls(test);

        for (Pair<Contact,Integer> item: listOfTopFiveCalls) {
            System.out.println(item);
        }

        //6 задача, вывод на экран

        System.out.println("Вывод сообщений по контактам");

        Map<Contact, List<Message>> test2 = new HashMap<>();

        test2 = CombiningContactAndMessage(contactList,listOfMessages);

        for (Map.Entry<Contact, List<Message>> item: test2.entrySet()) {
            System.out.println(item.getKey() + ":");
            List<Message>listMessages = item.getValue();
            for (Message messages : listMessages) {
                System.out.println(messages);
            }
        }

        System.out.println("Вывод топ 5 сообщений");

        // 5 задача, вывод на экран
        List<Pair<Contact,Integer>> listOfTopFiveMessages = new ArrayList<>();
        listOfTopFiveMessages = topFiveMasseges(test2);

        for (Pair<Contact,Integer> item: listOfTopFiveMessages) {
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

        Collections.sort(middleResultTopFiveCalls, new Comparator<Pair<Contact, Integer>>() {
            @Override
            public int compare(Pair<Contact, Integer> o1, Pair<Contact, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });

        for (int i = 0; i < 5; i++) {
            resultTopFiveCalls.add(middleResultTopFiveCalls.get(i));
        }

        return resultTopFiveCalls;
    }

    // 6 задача: Используя отображения, сгруппируйте все сообщения по контактам (Map<Contact, List<Message>>).

    public static Map<Contact, List<Message>> CombiningContactAndMessage(List<Contact> contacts, List<Message> messages){

        Map<Contact, List<Message>> resultOfCombining = new HashMap<>();

        for (Contact contact: contacts) {
            List<Message> resultOfMessages = new ArrayList<>();
            for (Message message: messages) {
                if(contact.phoneNumber.equals(message.phoneNumber)){
                    resultOfMessages.add(message);
                }
            }
            resultOfCombining.put(contact, resultOfMessages);
        }

        return resultOfCombining;
    }

    // 7 задача: Реализуйте вывод топ-5 контактов с наибольшим количеством сообщений (List<Pair<Contact, Integer>>).

    public static List<Pair<Contact,Integer>> topFiveMasseges(Map<Contact, List<Message>> CombiningContactAndMessage){
        List<Pair<Contact, Integer>> middleResultTopFiveMasseges= new ArrayList<>();
        List<Pair<Contact, Integer>> resultTopFiveMasseges = new ArrayList<>();

        List<Integer> pairIntegers = new ArrayList<>();

        for (Map.Entry<Contact, List<Message>> item: CombiningContactAndMessage.entrySet()) {
            List<Message>listMesseges = item.getValue();
            Integer numberOfMesseges = listMesseges.size();
            pairIntegers.add(numberOfMesseges);
            Pair<Contact,Integer> pair = new Pair<>(item.getKey(),numberOfMesseges);
            middleResultTopFiveMasseges.add(pair);
        }

        Collections.sort(middleResultTopFiveMasseges, new Comparator<Pair<Contact, Integer>>() {
            @Override
            public int compare(Pair<Contact, Integer> o1, Pair<Contact, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });

        for (int i = 0; i < 5; i++) {
            resultTopFiveMasseges.add(middleResultTopFiveMasseges.get(i));
        }

        return resultTopFiveMasseges;
    }
}
