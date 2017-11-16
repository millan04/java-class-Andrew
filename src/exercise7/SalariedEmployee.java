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
public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(String name, String ssn, double salary) {
        super(name, ssn);
        this.name=name;
        this.ssn=ssn;
        this.salary=salary;
        super.netPay= salary/52;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public double getNetPay(){
        return super.getNetPay();
    }
    @Override
    public void printWeeklyCheck(){
        super.printWeeklyCheck();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{"+"name= "+ name+", ssn= " +ssn+ ", salary= $"+salary +'0'+'}';
    }
    
}
