package Task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//3. Определитþ високоснýй ли заданнýй год.

public class Task3 {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(reader.readLine());

        if( year % 4 == 0 && year % 100 != 0) System.out.println("Год высокосный");
        else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) System.out.println("Год высокосный");
        else System.out.println("Год не высокосный");

    }
}
