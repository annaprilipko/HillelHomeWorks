package Lesson12;

public class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Неверно введено имя");
        }

        this.name = name;
    }


    public void setAge(int age) {

        if(age <= 0){
            throw new IllegalArgumentException("Неверный возраст");
        }

        this.age = age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(){

    }

    public static void deserialize(String str) throws MyDomainException{
        new Student();
        throw new MyDomainException();
    }

    public static void secondDeserialize() throws MyDomainException{
        String str = "";
        try{
            Student.deserialize(str);
        }catch (MyDomainException e){
            System.out.println("А вот и ошибочка метода secondDeserialize");
            e.printStackTrace();
            throw e;
        }
    }

    public static void catchDeserialize(){
        String str = "";

        try {
           Student.deserialize(str);
        } catch (MyDomainException e){
            System.out.println("А вот и ошибочка метода catchDeserialize");
            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }

}
