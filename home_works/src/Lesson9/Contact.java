package Lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    Collection<Contact> find(Collection<Contact> contacts, String value){

        List<Contact> foundedContacts = new ArrayList<>();

        for (Contact item: contacts) {
            if(item.name.contains(value) || item.phoneNumber.contains(value)){
                foundedContacts.add(item);
            }
        }

        return foundedContacts;
    }

    @Override

    public boolean equals(Object other){

        if(other == this){
            return true;
        }

        if(!(other instanceof Contact)){
            return false;
        }

        Contact newContact = (Contact) other;

        return Objects.equals(newContact.name, this.name) && Objects.equals(newContact.phoneNumber, this.phoneNumber);
    }

    @Override

    public int hashCode(){
        return Objects.hash(name,phoneNumber);
    }

    @Override

    public String toString(){
        return String.format("name=%s, phoneNumber=%s", this.name, this.phoneNumber);

    }
}
