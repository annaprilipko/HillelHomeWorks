package Lesson13;

import java.util.Objects;

public class Contact {
    private String name;
    private String surname;
    private String number;
    private String yearOfBirth;

    public Contact(String[] array){
        this.name = array[0];
        this.surname = array[1];
        this.number = array[2];
        this.yearOfBirth = array[3];
    }

    public Contact(String name, String surname, String number, String yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumber() {
        return number;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return this.name + "/" + this.surname + "/"  + this.number + "/" + this.yearOfBirth + "/";
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Contact)) {
            return false;
        }
        Contact theOther = (Contact) other;
        return Objects.equals(theOther.name, this.name) && Objects.equals(theOther.surname, this.surname) &&
                Objects.equals(theOther.number, this.number) && Objects.equals(theOther.yearOfBirth, this.yearOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, number, yearOfBirth);
    }

}
