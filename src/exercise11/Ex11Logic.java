package exercise11;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Exercise 11 logic
 * @author yasiro01
 */
public class Ex11Logic {
  
  /**
   * Task 1
   * @param <T>
   * @param item
   * @return length of the parameter's string representation
   */
  // TODO: Implement method strLen
    public <T> int strLen(T item){
        return item.toString().length();
    }
    
    
  
  /**
   * Task 2
   * @param <T>
   * @param item1
   * @param item2
   * @param item3
   * @return the greater of three parameters
   */
  // TODO: Implement method greater
    public <T extends Comparable> T greater(T item1, T item2, T item3){
        if( item1.compareTo(item2)>=0 & item1.compareTo(item3)>=0){
            return item1;
        }
        if( item2.compareTo(item1)>=0 & item2.compareTo(item3)>=0){
            return item2;
        }
        else{
            return item3;
        }
        
    }
    
  
  /**
   * Task 3
   * @param <T>
   * @param list of objects
   * print a list of items
   */
  // TODO: Implement method printList
    public <T> void printList(T list){
        Collection<T> list1 = (Collection<T>) list;
//        String l = "";
//        for (Iterator<T> it = list1.iterator(); it.hasNext();) {
//            l += it;
//            l += ',';
//        }
//        System.out.print('['+l+']'); 
       System.out.print(list1);
        }
          
    
  
  /**
   * Task 4
   * @param <T>
    * @param item1
    * @param item2
  
   * @return the smallest item in the collection
   */
  // TODO: Implement method findMinItem
    public<T> T lessThan(T item1, T item2){
        T min= item1;
        if(min.hashCode()< item2.hashCode()){
                min = min;
        }
            else{
                min = item2;
            }
        return min;
    }
    /**
     * @param <T> 
     * @param list
     * @return */
    public <T> T findMinItem(T list){
        Collection<T> list1 = (Collection<T>) list;
        Iterator<T> num= list1.iterator();
        T min = num.next();
        //Helper helper = new Helper();
        Iterator<T> it=list1.iterator();
        for (int i=0; i<list1.size(); i++) {
            T value= it.next();
            min=this.lessThan(min, value);
            //min=helper.lessThan(min, value);
            
        }
        return min;
    }
}
//class Helper{
//    public<T extends Comparable> T lessThan(T item1, T item2){
//        T min= item1;
//        if( min.compareTo(item2)<=0){
//                min = min;
//        }
//            else{
//                min = item2;
//            }
//        return min;
//    }
//}

  /**
   * Task 5
   * @param <T>
   * @param <U>
   * A class with two data members, T fuzz and U buzz
   * Implement the constructor, getters, setters, and toString
   */
  // TODO: Implement class Foo
class Foo<T>{
    private T fuzz;
    private T buzz;
      /**
   * @param <T>
   * @param object
   * @return length of the parameter's string representation
   */
    public Foo(T fuzz, T buzz){
        this.fuzz=fuzz;
        this.buzz=buzz;
    }

    public T getFuzz() {
        return fuzz;
    }

    public void setFuzz(T fuzz) {
        this.fuzz = fuzz;
    }

    public T getBuzz() {
        return buzz;
    }

    public void setBuzz(T buzz) {
        this.buzz = buzz;
    }

    @Override
    public String toString() {
        return "Foo{" + "fuzz=" + fuzz + ", buzz=" + buzz + '}';
    }
    
    
}
