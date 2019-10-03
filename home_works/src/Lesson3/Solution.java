package Lesson3;

import Lesson3.people.Student;
import Lesson3.people.StudentFactory;
import Lesson3.people.Teacher;
import Lesson3.unalive.Auditory;
import Lesson3.unalive.Cathedra;
import Lesson3.unalive.Faculty;
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
        Teacher Petrov = new Teacher("Petrov");
        Teacher Sidorov = new Teacher("Sidorov");
        mathTeathers.add(Petrov);
        mathTeathers.add(Sidorov);

        ArrayList<Auditory> mathCathedraAuditorys = new ArrayList<>();
        Auditory mathAudituryOne = new Auditory(403);
        Auditory mathAudituryTwo = new Auditory(405);
        mathCathedraAuditorys.add(mathAudituryOne);
        mathCathedraAuditorys.add(mathAudituryTwo);

        Cathedra mathCathedra = new Cathedra(mathTeathers, mathCathedraAuditorys);

        ArrayList<Teacher> progTeathers = new ArrayList<>();
        Teacher Novikov = new Teacher("Novikov");
        Teacher Plushkin = new Teacher("Plushkin");
        mathTeathers.add(Novikov);
        mathTeathers.add(Plushkin);

        ArrayList<Auditory> progCathedraAuditorys = new ArrayList<>();
        Auditory progAudituryOne = new Auditory(509);
        Auditory progAudituryTwo = new Auditory(535);

        Cathedra progCathedra = new Cathedra(progTeathers, progCathedraAuditorys);

        ArrayList<Cathedra> listCathedrasForCoderFaculty = new ArrayList<>();
        listCathedrasForCoderFaculty.add(mathCathedra);
        listCathedrasForCoderFaculty.add(progCathedra);

        Faculty coderFaculty = new Faculty(listCathedrasForCoderFaculty);

    }
}
