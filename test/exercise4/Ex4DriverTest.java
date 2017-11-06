/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import static com.sun.media.jfxmediaimpl.MediaUtils.error;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import notes.UnitTesting;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class Ex4DriverTest {
  
  public Ex4DriverTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

    /**
     * Test of <error> method, of class Ex4Driver.
     */
    /**
     * Test of multiply method, of class Ex4Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("Task 1");
        Integer n=10;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 20;
        Integer result = instance.task1(n);
        assertEquals(expResult, result);
        n =5;
        expResult =10;
        result = instance.task1(n);
        assertEquals(expResult, result);
        
  }
    @Test
    public void testTask2() {
        System.out.println("Task 2");        
        String n="10";
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 10;
        Integer result = instance.task2(n);
        assertEquals(expResult, result);
        n ="5";
        expResult =5;
        result = instance.task2(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testTask3(){
        System.out.println("Task 3");
        Character ch= '6';
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 6;
        Integer result= instance.task3(ch);
        assertEquals(expResult, result);
        ch='5';
        expResult = 5;
        result= instance.task3(ch);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTask4(){
        System.out.println("Task 4");
        String a="A";
        Ex4Driver instance= new Ex4Driver();
        Character expResult = 'A';
        Character result = instance.task4(a);
        assertEquals(expResult, result);
        a="B";
        expResult ='B';
        result = instance.task4(a);
        assertEquals(expResult, result);
    }
        @Test
    public void testTask5(){
        System.out.println("Task 5");
        Integer n=5;
        Integer m=6;
        Integer expResult = 11;
        Ex4Driver instance = new Ex4Driver();
        Integer result= instance.task5(n,m);
        assertEquals(expResult, result);
        n=2;
        m=3;
        expResult = 5;
        result= instance.task5(n,m);
        assertEquals(expResult, result);
    }
    @Test
    public void testTask6(){
        System.out.println("Task 6");
        String n="A";
        Integer m=6;
        Character expResult = 'G';
        Ex4Driver instance = new Ex4Driver();
        Character result= instance.task6(n,m);
        assertEquals(expResult, result);
        n="B";
        m=6;
        expResult = 'H';
        result= instance.task6(n,m);
        assertEquals(expResult, result);
    }
     @Test
    public void testTask7(){
        System.out.println("Task 7");
        Integer[] n={9,8,7};
        Integer expResult = 9;
        Ex4Driver instance = new Ex4Driver();
        Integer result= instance.task7(n);
        assertEquals(expResult, result);
        Integer[] m={1,5,6,4,8};
        expResult = 1;
        result= instance.task7(m);
        assertEquals(expResult, result);
    }
         @Test
    public void testTask8(){
        System.out.println("Task 8");
        Integer[] n={9,8,7};
        Integer a=2;
        Boolean expResult = false;
        Ex4Driver instance = new Ex4Driver();
        Boolean result= instance.task8(n,a);
        assertEquals(expResult, result);
        Integer[] m={15,5,6,4,8};
        a=5;
        expResult = true;
        result= instance.task8(m,a);
        assertEquals(expResult, result);
    }
         @Test
    public void testTask9(){
        System.out.println("Task 9");
//        List<Class> list= new ArrayList<>();
        String[] list = {"Alice", "Bob", "Charlie"};
        Integer expResult = 3;
        Ex4Driver instance = new Ex4Driver();
        Integer result= instance.task9(list);
        assertEquals(expResult, result);
        String[] m={"Hello","World"};
        expResult = 2;
        result= instance.task9(m);
        assertEquals(expResult, result);
    }
    @Test
    public void testTask10(){
        System.out.println("Task 10");
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
            hm.put(0,"Hello");
            hm.put(1,"World");
            hm.put(2,"Bob");
        Integer expResult= 3;
        Ex4Driver instance = new Ex4Driver();
        Integer result= instance.task10(hm);
        assertEquals(expResult, result);
        HashMap<Integer,String> hash=new HashMap<Integer,String>();
            hm.put(0,"Hello");
            hm.put(1,"World");
        expResult=2;
        result= instance.task10(hash);
        assertEquals(expResult, result);
    }
    
}
