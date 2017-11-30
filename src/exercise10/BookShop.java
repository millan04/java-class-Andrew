package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;
import exercise10.Book;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
    private ArrayList<Book> catalog;
  public BookShop() {
      ArrayList<Book> catalog;
//      ArrayList<Book> catalog;
  }
  
  public BookShop(String filename) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
            Scanner lineContent = new Scanner(line);
            while (lineContent.hasNext()) {
                String[] parts = lineContent.next().split(",");
                System.out.println(parts[0]);
                Book o= new Book(parts[0], parts[1].toString(),Double.parseDouble(parts[2]),Integer.parseInt(parts[3]));
                
//                this.catalog.add(o);
            }
        }
    }

  
  public BookShop(BookShop anotherBookShop) {
      catalog=anotherBookShop.catalog;
  }
  
  public void addNewTitle(Book book) {
      catalog.add(book);
  }
  
  public int size() {
      return catalog.size();
  }
  
  public void discountAll(Double discountPercent) {
      
  }
  
  public void printCatalog() {
        for (Book catalog1 : catalog) {
            System.out.println(catalog1);
        }
  }
  
  public void order(Comparator<Book> comp) {
      Collections.sort(catalog, comp);
      
  }
  
  public ArrayList<Book> getCatalog() {
      return catalog;
  }

}
