package Lesson3.people;

public class StudentFactory {

    public static Student creat(){

        String[] names = {"Вася","Маша","Катя","Саша","Петя","Ангелина","Федор"};

        Student student = new Student();

        student.name = names[(int)(Math.random()*names.length-1)];
        student.age = (int)(Math.random()*100);
        student.mark = Math.random()*10;

        return student;
    }

}
