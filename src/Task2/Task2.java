package Task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//2. Определитþ век по заданному году. Например, 2019 - 21 век, но 2000 - 20 век.

public class Task2 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int yearForCentury = Integer.parseInt(reader.readLine());

        int century = yearForCentury/100 + 1;

        System.out.println(century);
    }
}
