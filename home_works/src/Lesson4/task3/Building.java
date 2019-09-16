package Lesson4.task3;

public abstract class Building {
    public double height;
    public double square;
    public int numberOfFloors;
    public String location;

    public Building(double height, double square, int numberOfFloors, String location){
        this.height = height;
        this.square = square;
        this.numberOfFloors = numberOfFloors;
        this.location = location;
    }
}
