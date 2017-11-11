package exercise6;

import java.util.Objects;

/**
 * Class Crow
 * @author yasiro01
 */
public class Crow {
    private String name;
    private Integer age;
    private Integer iq;
    
    public Crow(){
        this.iq=100;
    }
    public Crow(String name, Integer age, Integer iq){
        this.name=name;
        this.age=age;
        this.iq=iq;
    }
    public Crow(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getIq() {
        return iq;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.age);
        hash = 47 * hash + Objects.hashCode(this.iq);
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
        final Crow other = (Crow) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.iq, other.iq)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
