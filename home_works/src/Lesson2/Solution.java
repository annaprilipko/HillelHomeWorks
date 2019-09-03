package Lesson2;


public class Solution {

    public static void main(String []args){
        Student[] arr = new Student[4];
        for(int i = 0; i < arr.length; i++){
            arr[i] = StudentFactory.creat();
        }
        print(arr);

        bubbleSortByName(arr);
        System.out.println("После сортировки по имени");
        print(arr);


        bubbleSortByAge(arr);
        System.out.println("После сортировки по возрасту");
        print(arr);

        System.out.println("Найденный студент по запрошенному имени:");
        System.out.println(findByName("Катя", arr));

        System.out.println("Найденные студенты по запрошенному имени:");
        print(findByNameMoreStudents("Катя", arr));
        //System.out.println(findByNameMoreStudents("Катя", arr));
    }

    public static void bubbleSortByName(Student[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i].name.compareTo(arr[j].name) > 0){
                    Student tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

    public static void bubbleSortByAge(Student[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i].age > arr[j].age){
                    Student tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

    public static Student findByName(String str, Student[] arr){

        Student foundedStudent = new Student();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].name.equals(str)) {
                foundedStudent = arr[i];
            }
        }
        return foundedStudent;
    }

    public static Student[] findByNameMoreStudents(String str, Student[] arr){
        Student[] foundedStudents = new Student[arr.length];
        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].name.equals(str)) {
                foundedStudents[counter] = arr[i];
                counter++;
            }
        }

        return foundedStudents;
    }

    public static void print(Student[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
