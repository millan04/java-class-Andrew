// Andrew Millan

package exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Random;

/**
 * @author yasiro01
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    System.out.println(task9());
    task10();
  }
  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
      System.out.println("Hello World");
 System.out.println("-----------"); 
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
      for(int i= 1; i <=100; i++){
          if (i%3==0&&i%5==0){System.out.println("huh");}
          else if (i%3==0){System.out.println("foo");}
          else if (i%5==0){System.out.println("bar");}
          else {System.out.println(i);}
      
      }
      System.out.println("-----------");
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
      int count= 0;
      for(int i = 1; i<=100; i++){
          if (i%7==0)
          {count= count + i;}
                  }
      System.out.println(count);
  System.out.println("-----------");                
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
      int count = 0;
      long product = 1;
      for (int i=1; i<=20; i++){
          count = count + i;
          product = product * i;
      }
       System.out.printf("The sum of the numbers is %d%n",count);
       System.out.printf("The product of the numbers is %d%n",product);
  System.out.println("-----------");
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
      Scanner keyboard = new Scanner(System.in);
      System.out.printf("Enter your full name%n");
      String fullName = keyboard.nextLine();
      char [] stringToCharArray = fullName.toCharArray();
//      for (char output : stringToCharArray) {
//            if(char == char.toUpperCase() );
//      }
      System.out.println(stringToCharArray[0]);
      
  }
  
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
      int [] anArray;
      int[] list1 = new int[10];
      for(int i=0; i<10; i++){
          list1[i] = i*i*i;
          
      }
      
      System.out.println(Arrays.toString(list1));
  System.out.println("-----------");  
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    Random rnd = new Random();
    rnd.setSeed(252);
    int [] list2 = new int[100];
    for (int i=0; i< 100; i++){
        //int number = rnd.nextInt(100)+1;
        list2[i] = rnd.nextInt(100)+1 ;
    }
    System.out.println(Arrays.toString(list2));
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter your number guess%n");
    String number = keyboard.nextLine();
    int guess =Integer.parseInt(number);
    for(int i=0; i<100; i++){
        if (list2[i]== guess) {
            System.out.println("Number in Array");
            break;
        }
        else {
            System.out.print("");
        }
    }
    //System.out.println(Arrays.toString(list2));
    System.out.println("-----------");
  }
  
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
      int sum = 0;
      for (int i=0; i< numbers.length; i++) {
          sum += numbers[i];
      }
      System.out.println(sum);
      
      return sum;
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter a string%n");
    String word = keyboard.nextLine();
//    int length= word.length();
    char [] word_array = word.toCharArray();
    int [] code= new int[word.length()];
    int value_true= 0;
    int value_false=0;
    for (int i=0; i<word.length();i++){
        int ascii = (int) word_array[i];
        code[i] = ascii;
    }
    for (int i=0; i< code.length-1;i++){
        if (code[i]<=code[i+1]) {
            value_true +=0;
        }
        else {
            value_false += 1;
        }
    }
    if (value_false >= 1) {
        return false;
    }
    else {
        return true;
    }
  }
    
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
      int[] n = Number();
      ArrayList<Integer> prime= new ArrayList<Integer>();
      for (int i=0; i< n.length; i++){
      
      
      int temp;
	boolean isPrime=true;
	int num=i;
	for(int x=2;x<=num/2;x++)
	{
           temp=num%x;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	if(isPrime)
	   prime.add(num);
	else
	   System.out.println("");
      }
      for (Iterator<Integer> it = prime.iterator(); it.hasNext();) {
          Integer p = it.next();
          System.out.println(p);
      }
  }

    private static int[] Number() {
        int[] numbers = new int[100];
      for (int i=0; i<100; i++) {
          numbers[i] = i;
      }
        return numbers;
    }


    }

