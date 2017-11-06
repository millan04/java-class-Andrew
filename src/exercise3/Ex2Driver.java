package exercise3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.nio.file.Files.write;
import static java.nio.file.Files.write;
import static java.nio.file.Files.write;
import static java.nio.file.Files.write;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author yasiro01
 */
public class Ex2Driver {
  public static final String PATH = "data/";
  /**
   * main application function
   * @param args 
   */
  public static void main(String[] args) throws IOException {
    int[][] matrix1 = null;
    int[][] matrix2 = null;
    int[][] result = null;
    try {
      matrix1 = readFile(PATH + "matrix1.txt");
      matrix2 = readFile(PATH + "matrix2.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex2Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
    System.out.println("Matrix 1");
    printMatrix(matrix1);
    System.out.println("Matrix 2");
    printMatrix(matrix2);
    if (matrix1[0].length == matrix2.length) {
      result = multiply(matrix1, matrix2);
    } else {
      Logger.getLogger(Ex2Driver.class.getName()).log(Level.SEVERE, "{0}", "Impossible to multiply matrices");
      System.exit(0);
    }
    System.out.println("Result");
    printMatrix(result);
    try {
      writeMatrix(result, PATH + "result.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex2Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
  }
  /**
   * Print a matrix
   * @param matrix to print
   */
  
  public static void printMatrix(int[][] matrix) {
    for (int[] row: matrix) {
      for (int item: row) {
        System.out.printf("%5d", item);
      }
      System.out.printf("%n");
    }
  }
  /**
   * Write a matrix to the file
   * @param matrix 
   * @param filename 
   * @throws java.io.FileNotFoundException 
   */
  public static void writeMatrix(int[][] matrix, String filename) throws FileNotFoundException, IOException {
    int length=matrix.length;
    int width=matrix[0].length;
    BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
    writer.write("Result Matrix");
    for(int i=0; i<length; i++) {
        for(int j=0; j<width; j++) {
            writer.append((char) matrix[i][j]);
        }
    }
    writer.close();

  }
  /**
   * Read a matrix from a file
   * @param filename
   * @return matrix read from a file
   * @throws java.io.FileNotFoundException
   */
  public static int[][] readFile(String filename) throws FileNotFoundException, IOException {
    File file = new File(filename);
    Scanner scanner = new Scanner(file);
    List<Integer> integers = new ArrayList<> ();
    while (scanner.hasNext()) {
        if (scanner.hasNextInt()) {
            integers.add(scanner.nextInt());
        }
        else {
            scanner.next();
        }
    }
    int length= integers.get(0);
    int width= integers.get(1);
    integers.remove(0);
    integers.remove(0);
    int [][] matrix= new int[length][width];
    for(int i=0; i<length; i++) {
        for(int j=0; j<width; j++) {
            if(i>=1 & width>1){
                matrix[i][j]=integers.get(width+j);
            }
            else {
                matrix[i][j]= integers.get(i+j);
        }
            
    }
        
   }
    return matrix;
  }
    /*
    10. Open the input file and create a Scanner object to read its content
    20. Read two values (rows and columns) from the first line, if possible
    30. Create a new 2-D array
    40. Read data from the file, one line at a time, using the Scanner object
    50. Split each line into individual tokens and put them into your array
    60. Return the array
    */

    private static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        
        int aRows = matrix1.length;
        int aColumns = matrix1[0].length;
        int bRows = matrix2.length;
        int bColumns = matrix2[0].length;

        if (aColumns != bRows) {
            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
        }

        int[][] C = new int[aRows][bColumns];
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                C[i][j] = 0;
            }
        }

        for (int i = 0; i < aRows; i++) { // aRow
            for (int j = 0; j < bColumns; j++) { // bColumn
                for (int k = 0; k < aColumns; k++) { // aColumn
                    C[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return C;
    }

}
  /**
   * Multiply two matrices
   * @param matrix1
   * @param matrix2
   * @return the resulting matrix
   */
//  public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
//    throw new UnsupportedOperationException();
//  }
//}
