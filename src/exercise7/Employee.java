/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author millan04
 */
public class Employee {
    protected String name;
    protected String ssn;
    protected double netPay;
    
    public Employee(String name, String ssn) {
        this.name=name;
        this.ssn=ssn;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getNetPay() {
        return netPay;
    }
    public void printWeeklyCheck(){
       System.out.println("Their weekly pay check is $"+getNetPay());
   }
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", ssn=" + ssn + '}';
    }
    
}
