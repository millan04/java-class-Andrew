package exercise6;

import java.util.Objects;

/**
 * Class Owl
 * @author yasiro01
 */
public class Owl {
    private String name;
    private Integer age;
    private String wisdom;
    
    public Owl(){
        this.wisdom="Medium";
    }
    public Owl(String name, Integer age, String wisdom){
        this.name=name;
        this.age=age;
        this.wisdom=wisdom;
    }
    public Owl(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getWisdom() {
        return wisdom;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.age);
        hash = 83 * hash + Objects.hashCode(this.wisdom);
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
        final Owl other = (Owl) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.wisdom, other.wisdom)) {
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
