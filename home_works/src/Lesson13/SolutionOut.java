package Lesson13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class SolutionOut {
    public static void main(String[] args) {

        //1

        try (PrintWriter writer = new PrintWriter(new FileOutputStream("text.txt"))){
            writer.println("Hello, world");
        } catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

        //2

        try(PrintWriter writer = new PrintWriter(new FileOutputStream("text2.txt"))) {
            for(int i = 0; i < 1000; i ++){
                int number = (int) (Math.random() *(1150+1))-500;
                writer.print(number + ",");
            }
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

        //4

        try(PrintWriter writer = new PrintWriter(new FileOutputStream("text3.txt"))) {
            writer.print("Name1 / Surname1 / 111111111111 / 1956 \n");
            writer.print("Name2 / Surname2 / 222222222222 / 1948 \n");
            writer.print("Name3 / Surname3 / 333333333333 / 2003 \n");
            writer.print("Name4 / Surname4 / 444444444444 / 2001 \n");
            writer.print("Name5 / Surname5 / 555555555555 / 1859 \n");
            writer.print("Name6 / Surname6 / 666666666666 / 2011 \n");
            writer.print("Name7 / Surname7 / 777777777777 / 1999 \n");
            writer.print("Name8 / Surname8 / 888888888888 / 1569 \n");
            writer.print("Name9 / Surname9 / 999999999999 / 1457 \n");
            writer.print("Name10 / Surname10 / 12121212121 / 1987");
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
