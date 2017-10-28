package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yasiro01
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
      task1(3);
      System.out.println(task2(numberArr, 90));
      System.out.println(task3(numberArr, 75));
      task4(numberArr);
      task5(numberArr);
      task6();
      task7();
      System.out.println(task8(numberLst, 75));
      task9();
   task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function nHeads() that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row. Seed the randomizer in the main() function.
   * @param n
   */
  public static void task1(int n) {
      System.out.println(nHeads(n));
      
  }
  public static ArrayList<String> nHeads(int n){
      ArrayList<String> list1 = new ArrayList();
      int count=0;
      while(count != n) {
      Random rnd = new Random();
      int side = rnd.nextInt(2);
      if(side == 0){
          list1.add("Heads");
          count +=1;
          if(count==n){
              break;
          }
      }
      else {
          list1.add("Tails");
          count = 0;
      }
  }
      return list1;
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
      return number(arr,n);
  } 
  public static boolean number(int[] arr, int n) {
      for(int i=0; i <= arr.length; i++) {
          if(n < arr[i]){
              return false;
          }
 
  }
      return true;
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
      return below(arr, threshold);
  }
  
  public static int below(int[] arr, int threshold) {
      int count = 0;
      for(int i=0; i <= arr.length-1; i++) {
          if(arr[i]<threshold){
              count +=1;
          }
  }
      return count;
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
      System.out.println(difference(arr));
  }
  public static int difference(int[] arr) {
      int max = arr[0];
      int x=0;
      for (int i =1 ; i<arr.length; i++){
          if (arr[i]>max) {
              max = arr[i];
              x=i;
          }
      }
      int diff= 100-max;
      int[] arr2;
      arr2= new int[arr.length];
      for (int i=0; i<arr.length; i++){
          arr2[i]=arr[i]+diff;
      }
      return arr2[x];
  }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
      System.out.println(grade(arr));
  }
  public static String grade(int[] arr) {
      int A=0;
      int B=0;
      int C=0;
      int D=0;
      int F=0;
      for(int i=0; i<arr.length; i++) {
          if (arr[i]>=90 ){
              A+=1;
          }
          else if (arr[i]>=80){
              B+=1;
          }
          else if (arr[i]>=70){
              C+=1;
          }
          else if (arr[i]>=60){
              D+=1;
          }
          else{
              F += 1;
          }
          }
      return "A: "+Integer.toString(A)+", B: "+Integer.toString(B) +", C: "+Integer.toString(C)+", D: "+Integer.toString(D) +", F: "+Integer.toString(F);
      }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    ArrayList<Double> arr;
    arr = new ArrayList<Double> ();
    Double number=new Double(1);
    while (number != 0){
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter number:%n");
    int num = IntegerParse(keyboard.nextLine());
    arr.add(number);
    //arr.add(IntegertoString(number));
    }
    System.out.println(arr);
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
      ArrayList arr = new ArrayList(10);
      for (int i=0; i<10;i++) {
          ArrayList arr2= new ArrayList();
          Random rnd = new Random();
          int num = rnd.nextInt(101)+50;
          arr.set(i, arr2.add(num));
          
      }
      System.out.println(arr);
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
      int count = 0;
      for(int i=0; i <=arrLst.size()-1; i++) {
          if(arrLst(i)<threshold){
              count +=1;
          }
  }
      return count;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
      int[][] table =new int[10][10];
      for (int row=1; row<table.length; row++){
          for (int col=1; col<table[1].length; col++){
              table[row][col]=row*col;
              System.out.printf("%6d", table[row][col]);
          }
          System.out.println();
      }
      return table;
      
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
public static void task10(int[][] matrix) {
    printArray(matrix);
}

public static int getSumOfRow(int[][] array, int rowNum) {
        int sumOfRows = 0;

        for(int i = 0; i < array[rowNum].length; i++) {
            sumOfRows += array[rowNum][i];
        }
        return sumOfRows;
    }
public static int getColumnSum(int[][] array, int columnNum) {
        int sumOfColumn = 0;

        for(int i = 0; i < array.length; i++) {
            sumOfColumn += array[i][columnNum];
        }
        return sumOfColumn;
    }

public static void printArray(int[][] array) {
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                System.out.printf("%4d ", array[i][j]);
            }
            System.out.printf("Sum = %4d", getSumOfRow(array, i));

            System.out.println();
        }

        SumOfColumnPrint(array);
    }
public static void SumOfColumnPrint(int[][] array) {
        for(int i = 0; i < array[0].length; i++)
            System.out.printf("%4d ", getColumnSum(array, i));
    }

    

    private static Double IntegertoString(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int IntegerParse(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int arrLst(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
