package exercise6;

import java.util.Objects;

/**
 * Class Frog
 * @author yasiro01
 */
public class Frog {
    private String name;
    private Integer age;
    private String color;
    
    public Frog(){
        this.color="Green";
    }
    public Frog(String name, Integer age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public Frog(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.age);
        hash = 59 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Frog other = (Frog) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
