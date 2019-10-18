package Lesson12;


import java.io.IOException;

public class Solution {
    public static void main(String[] args) {

        String str = "";

        try {
            Student.deserialize(str);
        } catch (MyDomainException e){
            System.out.println("А вот и ошибочка метода deserialize");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Перехватили Exception");
            e.printStackTrace();
        }finally {
            System.out.println("Блок finally метода deserialize");
        }

        try {
            Student.secondDeserialize();;
        }catch (MyDomainException e){
            System.out.println("А вот и ошибочка метода secondDeserialize");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Перехватили Exception");
            e.printStackTrace();
        }finally {
            System.out.println("Блок finally метода secondDeserialize");
        }

        Student.deserializeRuntime();

    }
}
