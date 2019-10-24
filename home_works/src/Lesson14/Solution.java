package Lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        List <File> fileList = new ArrayList<>();

        if (args.length == 0) {
            System.out.println("no arguments were given.");
        }
        else {
            for (String a : args) {
                File file = new File(a);
                fileList.add(file);
                System.out.println(a);
            }
        }

        //i. Побайтовое ùтение и записþ напрāмуĀ из/в File[Input/Output]Stream

        long startFirst = System.currentTimeMillis();

       try(InputStream streamIn = new FileInputStream(fileList.get(0));
           OutputStream streamOut = new FileOutputStream(fileList.get(1))){

           while (streamIn.available() > 0){
               int readByte = streamIn.read();
               if (readByte < 0){
                   break;
               }
               streamOut.write(readByte);
           }
       }catch (IOException e){
           System.out.println(e.getMessage());
           e.printStackTrace();
       }

        System.out.println("Копирование побайтово:");

        System.out.println(System.currentTimeMillis() - startFirst);

       //ii. Буферное (локалþнýй байтовýй массив на 4Кб) ùтение и записþ напрāмуĀ из/в File[Input/Output]Stream

        long startSecond = System.currentTimeMillis();

        try(InputStream streamIn = new FileInputStream(fileList.get(2));
            OutputStream streamOut = new FileOutputStream(fileList.get(3))){

            byte[] chunk = new byte[4000];

            while (streamIn.available() > 0){

                int readCount = streamIn.read(chunk);
                if (readCount < 0){
                    break;
                }
                streamOut.write(readCount);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Копирование с буфером:");
        System.out.println(System.currentTimeMillis() - startSecond);

        // iii. Побайтовое ùтение и записþ ùерез Buffered[Input/Output]Stream

        long startThird = System.currentTimeMillis();

        try (OutputStream streamOut = new BufferedOutputStream(
                new FileOutputStream(fileList.get(1)));
                InputStream streamIn = new BufferedInputStream(
                        new FileInputStream(fileList.get(0)))){
            while (streamIn.available() > 0){
                int readByte = streamIn.read();
                if (readByte < 0){
                    break;
                }
                streamOut.write(readByte);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Копирование побайтовове с Buffered:");
        System.out.println(System.currentTimeMillis() - startThird);

        // iv. Буферное (локалþнýй байтовýй массив на 4Кб) ùтение и записþ ùерез Buffered[Input/Output]Stream


        long startFours = System.currentTimeMillis();

        try (OutputStream streamOut = new BufferedOutputStream(
                new FileOutputStream(fileList.get(3)));
             InputStream streamIn = new BufferedInputStream(
                     new FileInputStream(fileList.get(2)))){

            byte[] chunk = new byte[4000];

            while (streamIn.available() > 0){

                int readCount = streamIn.read(chunk);
                if (readCount < 0){
                    break;
                }
                streamOut.write(readCount);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Копирование с буфером с Buffered:");
        System.out.println(System.currentTimeMillis() - startFours);

    }

}
