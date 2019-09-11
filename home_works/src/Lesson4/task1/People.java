package task1;

import java.util.Objects;

public class People {
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;

        if(!(obj instanceof People)) return false;

        People people = (People) obj;
        return Objects.equals(people.name, this.name) && Objects.equals(people.age, this.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return String.format("name=%s", "age=%d", name, age);
    }
}
