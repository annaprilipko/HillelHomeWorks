package Lesson1.Task6;

//6. Посùитатþ сумму øифр ùисла. Например, в ùисле 123 сумма øифр - 6.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        int sum = 0;

        while (number > 0){
            sum += number % 10;
            number /= 10;
        }

        System.out.print(sum);

    }
}
