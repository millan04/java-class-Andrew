package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class FrogArmy
 * @author yasiro01
 */
public class FrogArmy {
    private ArrayList <String> lines = new ArrayList();    
    public FrogArmy(String fileName) throws FileNotFoundException{
        Scanner fileScanner = new Scanner(new File(fileName));
	  int lineID = 0;
//	  ArrayList lineNumbers = new ArrayList();
	  Pattern pattern =  Pattern.compile("^[A-Za-z]+[\\sA-Za-z,]+\\d+,?[Frog]+$");
	  Matcher matcher = null;
	  while(fileScanner.hasNextLine()){
			String line = fileScanner.nextLine();
			lineID++;
			matcher = pattern.matcher(line);
			if(matcher.find()){
				lines.add(line);
			  
			}
			

		}
}

    public int size(){
        return lines.size();
    }
    public Object getChief(){
        ArrayList<Integer> age = new ArrayList();
        ArrayList<String> name= new ArrayList();
        
        for(int i=0; i<lines.size();i++){
            String animal=lines.get(i);
            String[] parts =animal.split(",");
            age.add(Integer.parseInt(parts[1]));
            name.add(parts[0]);
        }
        Integer max =0;
        Integer index=0;
        for(int i=0; i<age.size();i++){
            if(age.get(i)>= max){
                max=age.get(i);
                index=i;
            }
        }
        Object chief = new Frog(name.get(index), age.get(index));
        return chief;
    }
}
