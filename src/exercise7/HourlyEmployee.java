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
public class HourlyEmployee extends Employee{
    private Double wageRate;
    private int hours;
    
    public HourlyEmployee(String name, String ssn, Double wageRate, int hours) {
        super(name, ssn);
        super.netPay= hours * wageRate;
        this.name= name;
        this.ssn= ssn;
        this.wageRate=wageRate;
        this.hours=hours;
        
    }


    public Double getWageRate() {
        return wageRate;
    }

    public void setWageRate(Double wageRate) {
        this.wageRate = wageRate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
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
        return "HourlyEmployee{"+"name= "+ name+", ssn= " +ssn+ ", wageRate= $" + wageRate + ", hours=" + hours + '}';
    }
    
}
