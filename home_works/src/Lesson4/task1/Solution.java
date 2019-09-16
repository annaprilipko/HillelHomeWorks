package Lesson4.task1;

public class Solution {
    public static void main(String[] args){
        Human Jon = new Human("Jon", 39);
        Human Mark = new Human("Mark", 78);
        Human Jon2 = new Human("Jon", 39);

        System.out.println(Jon.equals(Jon2));
        System.out.println(Jon.equals(Mark));

        System.out.println(Jon.hashCode());
        System.out.println(Jon2.hashCode());
        System.out.println(Mark.hashCode());

        System.out.println(Jon.toString());
        System.out.println(Jon2.toString());
        System.out.println(Mark.toString());



    }
}
