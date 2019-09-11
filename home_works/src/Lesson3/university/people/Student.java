package Lesson3.university.people;

public class Student {
    public String name;
    public int age;
    public double mark;

    public String toString(){
        return "Имя студента " + this.name + " возраст " + this.age + " оценка " + this.mark;
    }
}
