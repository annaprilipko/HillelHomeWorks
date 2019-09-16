package Lesson4.task4;

public abstract class Plants {
    public String name;
    public int numberOfSort;

    public Plants(String name, int numberOfSort){
        this.name = name;
        this.numberOfSort = numberOfSort;
    }

    @Override
    public String toString() {
        return "Class named " + getClass().getSimpleName() + "  Name is " + this.name
                + "  Number of sort is " + this.numberOfSort;
    }
}
