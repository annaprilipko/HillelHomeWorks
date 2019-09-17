package Lesson3.unalive;

import Lesson3.people.Student;
import Lesson3.people.StudentFactory;

import java.util.ArrayList;

public class Group {
    private String groupNumber;
    public ArrayList <Student> listOfStudents;

    public Group(String groupNumber){
        this.groupNumber = groupNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public ArrayList<Student> listMaker(int numberStudentsInGroup, ArrayList<Student> students){
        for (int i = 0; i < numberStudentsInGroup; i++){
            students.add(StudentFactory.creat());
        }
        return students;
    }
}
