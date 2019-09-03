package Lesson1.Task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1. Фрагмент определение max длā 2х ùисел.

public class Task1 {
    public static void main(String[] args) throws Exception {

        int a, b, max;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());

        if (a > b) max = a;
        else max = b;

        System.out.println(max);
    }
}
