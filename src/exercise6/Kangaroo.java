package exercise6;

import java.util.Objects;

/**
 * Class Kangaroo
 * @author yasiro01
 */
public class Kangaroo {
    private String name;
    private Integer age;
    private Integer babies;
    
    public Kangaroo(){
        this.babies=1;
    }
    public Kangaroo(String name, Integer age, Integer babies){
        this.name=name;
        this.age=age;
        this.babies=babies;
    }
    public Kangaroo(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getBabies() {
        return babies;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.age);
        hash = 97 * hash + Objects.hashCode(this.babies);
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
        final Kangaroo other = (Kangaroo) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.babies, other.babies)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
