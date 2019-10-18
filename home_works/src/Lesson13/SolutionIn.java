package Lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class SolutionIn {
    public static void main(String[] args) {


        //3

        List <Integer> listFromText2 = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileInputStream("text2.txt"), StandardCharsets.UTF_8.name()).useDelimiter(",")){
            int i = 0;
            while (scanner.hasNextInt()){
                if(i < 100) {
                    listFromText2.add(scanner.nextInt());
                    i++;
                } else {
                    break;
                }
            }
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

        int sum = 0;
        int amountOfNumbers = 0;

        for (Integer value: listFromText2) {
            if(value > 0){
                sum += value;
                amountOfNumbers++;
            }
        }

        for (Integer value: listFromText2) {
           System.out.println(value);
        }
        System.out.println("List size " + listFromText2.size());


        double average = sum/(double)amountOfNumbers;

        System.out.println("Sum " + sum);
        System.out.println("Amount of positive numbers " + amountOfNumbers);
        System.out.println("Average " + average);

        //4

        List<Contact> listFromText3 = new ArrayList<>();

        try(Scanner scanner = new Scanner(new FileInputStream("text3.txt"), StandardCharsets.UTF_8.name()).useDelimiter("\n")){
            while (scanner.hasNext()){
                String[] valueStr = scanner.next().split("/");
                listFromText3.add(new Contact(valueStr));
            }
        } catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

        System.out.println("List of contacts");
        for (Contact value: listFromText3) {
            System.out.println(value);
        }

        if(!listFromText3.isEmpty()){
            Collections.sort(listFromText3, new Comparator<Contact>() {
                @Override
                public int compare(Contact o1, Contact o2) {
                    return o1.getYearOfBirth().compareTo(o2.getYearOfBirth());
                }
            });
        }
        System.out.println("List of contacts after sorting");
        for (Contact value: listFromText3) {
            System.out.println(value);
        }

        int numberForCount = 0;

        System.out.println("List of contacts after sorting, first five");

            for (Contact value: listFromText3) {
                if (numberForCount < 5) {
                    System.out.println(value);
                    numberForCount++;
                } else {
                    break;
                }
            }

    }
}
