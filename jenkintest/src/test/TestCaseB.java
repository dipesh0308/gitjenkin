package test;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;


public class TestCaseB
{
   @Before
   public void beforeMethod()
   {
       System.out.println("Test Case B");
   }
 
   @Test
   public void JUnit4Test()
   {
      System.out.println("Test Case B method");
   }
 
   @After
   public void afterMethod()
   {
      System.out.println("Test Case B method");
   }
}