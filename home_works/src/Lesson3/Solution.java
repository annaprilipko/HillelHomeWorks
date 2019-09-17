package Lesson3;

import Lesson3.people.Student;
import Lesson3.people.StudentFactory;
import Lesson3.people.Teacher;
import Lesson3.unalive.Auditory;
import Lesson3.unalive.Cathedra;
import Lesson3.unalive.Group;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){

        ArrayList <Student> studentsInGroup1 = new ArrayList<>();
        Group group1 = new Group("Z-55");
        group1.listMaker(30, studentsInGroup1);

        ArrayList <Student> studentsInGroup2 = new ArrayList<>();
        Group group2= new Group("A-2655");
        group2.listMaker(30, studentsInGroup2);

        ArrayList <Student> studentsInGroup3 = new ArrayList<>();
        Group group3 = new Group("J-12");
        group3.listMaker(30, studentsInGroup3);

        ArrayList<Teacher> mathTeathers = new ArrayList<>();
        ArrayList<Auditory> mathCathedraAuditorys = new ArrayList<>();
        Cathedra mathCathedra = new Cathedra(mathTeathers, mathCathedraAuditorys);

        ArrayList<Teacher> progTeathers = new ArrayList<>();
        ArrayList<Auditory> progCathedraAuditorys = new ArrayList<>();
        Cathedra progCathedra = new Cathedra(progTeathers, progCathedraAuditorys);

    }
}
