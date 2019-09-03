package Lesson1.Task7;

/* By 3, or not by 3?
A trick I learned in elementary school to determine whether or not a number was divisible by three is to add
all of the integers in the number together and to divide the resulting sum by three. If there is no
remainder from dividing the sum by three, then the original number is divisible by three as well.
Given a series of numbers as a string, determine if the number represented by the string is divisible by three.
You can expect all test case arguments to be strings representing values greater than 0.
Example:
divisibleByThree('123') // true
divisibleByThree('8409') // true
divisibleByThree('100853') // false
divisibleByThree('33333333') // true
divisibleByThree('7') // false
*/

public class Task7 {
    public static void main(String[] args) throws Exception{
        System.out.println(divisibleByThree("123")); // true
        System.out.println(divisibleByThree("8409")); // true
        System.out.println(divisibleByThree("100853")); // false
        System.out.println(divisibleByThree("33333333")); // true
        System.out.println(divisibleByThree("7")); // false
    }

    public static boolean divisibleByThree(String str){
        boolean result = false;

        char[] charArr = str.toCharArray();
        int sum = 0;

        for (char a: charArr) {
            sum += a;
        }

        if( sum % 3 == 0 )result = true;

        return result;
    }
}
