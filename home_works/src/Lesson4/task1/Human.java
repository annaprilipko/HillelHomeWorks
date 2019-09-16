package Lesson4.task1;

import java.util.Objects;

public class Human {
    public String name;
    public int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;

        if(!(obj instanceof Human)) return false;

        Human human = (Human) obj;
        return Objects.equals(human.name, this.name) && Objects.equals(human.age, this.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return String.format("name=%s, age=%d", name, age);
    }
}
