package test;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;


public class TestCaseA
{
   @Before
   public void beforeMethod()
   {
       System.out.println(" method..");
   }
 
   @Test
   public void JUnit4Test()
   {
      System.out.println("In tedfgdfgst method");
   }
 
   @After
   public void afterMethod()
   {
      System.out.println("afterdfgdfg method");
   }
}