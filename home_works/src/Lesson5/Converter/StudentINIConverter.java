package Converter;

import Student.Student;


public class StudentINIConverter implements IStudentStringConverter{
    @Override
    public String converter(Student student){

        StringBuilder builder = new StringBuilder();

        builder.append("name=").append(student.name).append("\n").append("age=").append(student.age);

        return builder.toString();
    }
}
