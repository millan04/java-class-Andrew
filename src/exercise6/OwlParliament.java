package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class OwlParliament
 * @author yasiro01
 */
public class OwlParliament {
    private HashSet <String> set;
    
    public OwlParliament(String fileName) throws FileNotFoundException{
        this.set = new HashSet<String>();
        Scanner fileScanner = new Scanner(new File(fileName));
	  int lineID = 0;
//	  ArrayList lineNumbers = new ArrayList();
	  Pattern pattern =  Pattern.compile("^[A-Za-z]+[\\sA-Za-z,]+\\d+,?[Owl]+$");
	  Matcher matcher = null;
	  while(fileScanner.hasNextLine()){
			String line = fileScanner.nextLine();
			lineID++;
			matcher = pattern.matcher(line);
			if(matcher.find()){
				set.add(line);
			  
			}
			

		}
}


    public int size(){
        return set.size();
    }
    public Object getChief(){
        ArrayList<String> kang= new ArrayList();
        ArrayList<Integer> age = new ArrayList();
        ArrayList<String> name= new ArrayList();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            kang.add((String) itr.next());
        }
        for(int i=0; i<kang.size();i++){
            String animal=kang.get(i);
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
        Object chief = new Owl(name.get(index), age.get(index));
        return chief;
    }
}
