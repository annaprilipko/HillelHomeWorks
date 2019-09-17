package Lesson3.Schedule;

import Lesson3.people.Teacher;
import Lesson3.unalive.Auditory;
import Lesson3.unalive.Group;

public class ScheduleRow {
    public Auditory room;
    public Group group;
    public Teacher teacher;
    public DayOfWeek dayOfWeek;
    public Lesson lesson;

    public ScheduleRow(Auditory room, Group group, Teacher teacher, DayOfWeek dayOfWeek, Lesson lesson){
        this.room = room;
        this.group = group;
        this.teacher = teacher;
        this.dayOfWeek = dayOfWeek;
        this.lesson = lesson;
    }

    public void makeScheduleRow(Auditory room, Group group, Teacher teacher, DayOfWeek dayOfWeek, Lesson lesson){
        //String row = "";
        //row = String.format("%s | , %s | , %s | , %s | ; %s |/n", this.room, this.group, this.teacher, this.dayOfWeek, this.lesson);
        //return row;
        System.out.printf("%20s | , %20s | , %20s | , %20s | ; %20s |/n", this.room, this.group, this.teacher, this.dayOfWeek, this.lesson);
    }
}
