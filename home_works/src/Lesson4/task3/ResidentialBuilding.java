package Lesson4.task3;

public class ResidentialBuilding extends Building {
    public double ceilingHeight;

    public ResidentialBuilding(double height, double square, int numberOfFloors, String location, double ceilingHeight){
        super(height, square, numberOfFloors, location);
        this.ceilingHeight = ceilingHeight;
    }

    @Override
    public String toString() {
        return "Class named " + getClass().getSimpleName() + "\nHeight of building: " + super.height
                + "\nSquare of building: " + super.square + "\nThere are " + super.numberOfFloors + " floors\n"
                + "Is is located in " + super.location + "\nCeiling height is " + this.ceilingHeight;
    }

}
