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
import java.io.File;
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
        this.catalog = new ArrayList();
           FileReader fileReader = new FileReader(filename);
           BufferedReader bufferedReader = new BufferedReader (fileReader);
           String line;
           while ((line = bufferedReader.readLine()) !=null){
               String[] parts = line.split(",");
               Book o = new Book(parts[0], parts[1], Double.parseDouble(parts[2]), Integer.parseInt(parts[3]));
               catalog.add(o);

                       }
               fileReader.close();

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
      Double multi= discountPercent/100;
      for(int i=0; i<catalog.size(); i++){
          Double amount = catalog.get(i).getPrice();
          catalog.get(i).setPrice(amount - (amount*multi));
      }
  }
  
  public void printCatalog() {
      ArrayList<String> storage = new ArrayList();
        for (Book catalog1 : catalog) {
            storage.add(catalog1+"\n");
        }
        System.out.println(storage);
  }
  
  public void order(Comparator<Book> comp) {
      Collections.sort(catalog, comp);
      
  }
  
  public ArrayList<Book> getCatalog() {
      return catalog;
  }

}
