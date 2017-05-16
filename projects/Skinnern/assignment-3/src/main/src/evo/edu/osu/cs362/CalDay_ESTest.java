/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 19:44:41 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.cs362.Appt;
import edu.osu.cs362.CalDay;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CalDay_ESTest extends CalDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(1, 1, 1, 1, 1, "\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\n", "\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\n");
      calDay0.addAppt(appt0);
      Appt appt1 = new Appt(2, 1, 5, 5, 59, "\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\t1/1/1 at 1:1am ,\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\n, \t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\n\n \n", "\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\t1/1/1 at 1:1am ,\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\n, \t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\n\n \n");
      calDay0.addAppt(appt1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.isValid();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.year = (-1660);
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getSizeAppts();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(1, 1, 1, 1, 1, "\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\n", "\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\n");
      calDay0.addAppt(appt0);
      calDay0.getSizeAppts();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getMonth();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = (-2125);
      calDay0.getMonth();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getDay();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.day = 0;
      calDay0.day = (-1005);
      calDay0.getDay();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getAppts();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(2, 2, 2, 2, 2, "U", "U");
      calDay0.addAppt(appt0);
      calDay0.getAppts();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.valid = true;
      // Undeclared exception!
      try { 
        calDay0.iterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      // Undeclared exception!
      try { 
        calDay0.addAppt((Appt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-326), (-326), 1962, 1962, 0);
      mockGregorianCalendar0.setLenient(false);
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         assertThrownBy("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getDay();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getAppts();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.isValid();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(2, 2, 2, 2, 2, "@y", "@y");
      calDay0.addAppt(appt0);
      calDay0.toString();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.toString();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.iterator();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(2, 2, 2, 2, 2, "@y", "@y");
      calDay0.addAppt(appt0);
      Appt appt1 = new Appt(1, 1, 1, 1, 1, "\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\t2/2/2 at 2:2am ,@y, @y\n \n", "\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\t2/2/2 at 2:2am ,@y, @y\n \n");
      calDay0.addAppt(appt1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(2, 2, 2, 2, 2, "@y", "@y");
      calDay0.addAppt(appt0);
      calDay0.addAppt(appt0);
      assertEquals(14, calDay0.getDay());
      assertEquals(2014, calDay0.getYear());
      assertEquals(1, calDay0.getMonth());
      assertTrue(calDay0.isValid());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Appt appt0 = new Appt(79, 79, 79, 79, 79, "q$T_y", "q$T_y");
      calDay0.addAppt(appt0);
      assertFalse(calDay0.isValid());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      // Undeclared exception!
      try { 
        calDay0.getSizeAppts();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      int int0 = calDay0.getYear();
      assertEquals(2014, int0);
      assertEquals(14, calDay0.getDay());
      assertEquals(1, calDay0.getMonth());
      assertTrue(calDay0.isValid());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.valid = false;
      calDay0.valid = true;
      // Undeclared exception!
      try { 
        calDay0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      int int0 = calDay0.getMonth();
      assertEquals(14, calDay0.getDay());
      assertEquals(2014, calDay0.getYear());
      assertEquals(1, int0);
      assertTrue(calDay0.isValid());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Iterator<?> iterator0 = calDay0.iterator();
      assertEquals(2014, calDay0.getYear());
      assertEquals(14, calDay0.getDay());
      assertNotNull(iterator0);
      assertEquals(1, calDay0.getMonth());
  }
}