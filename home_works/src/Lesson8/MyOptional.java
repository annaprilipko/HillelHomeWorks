package Lesson8;

import javax.print.attribute.standard.MediaSize;
import java.util.NoSuchElementException;
import java.util.Objects;

public class MyOptional<T> {
    private T value;

    private MyOptional(T value){
        this.value = value;
    }

    public boolean isPresent(){
        if(value != null){
            return true;
        }else{
            return false;
        }
    }

    public T get(){
        if(value == null){
            throw new NoSuchElementException();
        }else {
            return value;
        }
    }

    public static <T> MyOptional<T> of(T value){
        if(value == null){
            throw new NullPointerException();
        }else {
            return new MyOptional<>(value);
        }
    }


    public static <T> MyOptional<T> ofNullable(T value){
        if(value == null){
            return new MyOptional<>(null);
        }else {
            return new MyOptional<>(value);
        }
    }

    public static <T> MyOptional<T> empty(){
        return new MyOptional<>(null);
    }

    public T orElse(T other){
        if(isPresent()) return get();
        else return other;
    }

    public boolean equals(Object obj){
        if(obj == this) return true;

        if(!(obj instanceof MyOptional)) return false;

        if (this.value == null && ((MyOptional) obj).value == null) return true;

        if(((MyOptional) obj).isPresent() && this.isPresent()){
            return this.value.equals(((MyOptional) obj).value);
        }else {
            return false;
        }
    }

    public int hashCode(){

        if(value == null) return 0;
        else return Objects.hash(value);
    }
}
