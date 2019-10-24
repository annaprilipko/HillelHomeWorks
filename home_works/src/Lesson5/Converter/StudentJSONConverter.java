package Converter;

import Student.Student;


public class StudentJSONConverter implements IStudentStringConverter {
    @Override
    public String converter(Student student){

        StringBuilder builder = new StringBuilder();

        builder.append("{\n").append("\"name\"")
                .append("; ").append(student.name)
                .append(", ").append("\"age\"")
                .append("; ").append(student.age)
                .append("\n}");

        return builder.toString();
    }
}
