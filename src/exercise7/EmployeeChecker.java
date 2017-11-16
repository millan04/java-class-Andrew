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
public class EmployeeChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee person = new HourlyEmployee("John", "000-00-0000", 25.33, 13);
        double p= person.getNetPay();
        System.out.println(p);
        person.printWeeklyCheck();
        System.out.println(person);
        System.out.println("----------------------");
        SalariedEmployee guy = new SalariedEmployee("Bob", "100-00-0000", 100000.00);
        double g= guy.getNetPay();
        System.out.println(g);
        guy.printWeeklyCheck();
        System.out.println(guy);
    }
    
}
