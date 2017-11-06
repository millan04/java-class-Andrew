package exercise4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author yasiro01
 */
public class Ex4Driver {

  
  /* Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task1(Integer n){
    return n * 2;
}

  /* Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
 public Integer task2(String num){
     return Integer.parseInt(num);
 }
  /* Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
 public Integer task3(Character num){
     return Character.getNumericValue(num);
 }
 /* Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity. */
 public Character task4(String ch){
     return ch.charAt(0);
 }
  /* Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
 public Integer task5(Integer n, Integer m){
     return n+m;
 }
  /* Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity. */
 public Character task6(String str, Integer num){
     return (char)((int)str.charAt(0) + num);
 }
  /* Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
 public Integer task7(Integer[] array){
     return array[0];
 }
  /* Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity. */
public Boolean task8(Integer[] array, Integer num){
    return array[0]%num==0;
}
  /* Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task9(java.lang.String[] array){
    return array.length;
}
  /* Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */

    /**
     *
     * @param hash
     * @return
     */

public Integer task10(HashMap<> hash){
    return hash.size();
}
}
