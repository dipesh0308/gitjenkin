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
	   System.out.println(" A Change is done..");
   }
 
   @Test
   public void JUnit4Test()
   {
      System.out.println("In tedfgdfgst method");
	   System.out.println(" A Change is done..");
   }
 
   @After
   public void afterMethod()
   {
      System.out.println("afterdfgdfg method");
   }
}