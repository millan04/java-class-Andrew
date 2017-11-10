package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Roster
 * Task 10: Create a class Roster that contains a private member ArrayList<Student> studentList (reuse class Student from task 9). Its constructor must take the name of a file as a parameter, read data from the file (sample roster.csv is provided, another file of a similar structure may be used for grading), create an object of type Student based on the content of a line, and add that object to the ArrayList studentList.
 * Implement method printRoster that prints all the elements of the studentList.
 * @author yasiro01
 */
public class Roster {
    private ArrayList<String> studentlist;
    
    
    public Roster(String fileName) throws IOException{
        this.studentlist = new ArrayList();
        BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = inputFile.readLine()) != null) {
            /* Turn each line into a Scanner object and parse it one token at a time */
            Scanner lineContent = new Scanner(line);
            while (lineContent.hasNext()) {
                String[] parts = lineContent.next().split(",");
                studentlist.add(parts[0]+" is majoring in "+parts[1]+" with a GPA of "+parts[2]+"\n");
            }
        }
    }

    public String printRoster(){
        String roster="";
        for(int i=0; i<=studentlist.size();i++){
            roster += studentlist.get(i);
        }
        return roster;
    }
}
