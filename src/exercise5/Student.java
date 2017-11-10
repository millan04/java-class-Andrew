package exercise5;

/**
 * Class Student
 * Task 9: Create a class Student with the following private data members: String name, String major, double gpa.
 * Implement setters for major and gpa
 * @author yasiro01
 */
public class Student {
    private String name;
    private String major;
    private Double gpa;
    
    public Student(String name, String major, Double gpa){
        this.name=name;
        this.major=major;
        this.gpa=gpa;
    
    }

    public String getName() {
        return name;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " is majoring in " + major +" with a GPA of "+Double.toString(gpa);
    }
    
}
