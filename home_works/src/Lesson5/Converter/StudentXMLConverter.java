package Converter;

import Student.Student;


public class StudentXMLConverter implements IStudentStringConverter {
    @Override
    public String converter(Student student){

        StringBuilder builder = new StringBuilder();

        builder.append("<student>\n")
                .append("<name>").append(student.name).append("</name>\n")
                .append("<age>").append(student.age).append("</age>\n")
                .append("</student>");

        return builder.toString();
    }
}
