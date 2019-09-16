package Lesson4.task3;

public class CommercialBuilding extends Building {
    public String type;

    public CommercialBuilding(double height, double square, int numberOfFloors, String location, String type){
        super(height, square, numberOfFloors, location);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Class named " + getClass().getSimpleName() + "\nHeight of building: " + super.height
                        + "\nSquare of building: " + super.square + "\nThere are " + super.numberOfFloors + " floors\n"
                        + "Is is located in " + super.location + "\nType of Commercial building is " + this.type;
    }
}
