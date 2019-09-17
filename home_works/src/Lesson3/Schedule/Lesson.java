package Lesson3.Schedule;

public enum Lesson {
    lESSON1("8.30"),
    lESSON2("10.25"),
    lESSON3("12.35"),
    lESSON4("14.30"),
    lESSON5("16.25"),
    lESSON6("18.10");

    private String lesson;

    Lesson(String lesson){
        this.lesson = lesson;
    }

    public String getLesson(){return lesson;}

}
