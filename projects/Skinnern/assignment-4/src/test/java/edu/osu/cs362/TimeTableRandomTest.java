package edu.osu.cs362;
 
 import java.util.*;
 
 import org.junit.Test;
 
 
 import static org.junit.Assert.*;
 
 
 
 /**
  * Random Test Generator  for TimeTable class.
  */
 
 public class TimeTableRandomTest {

	 private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	 private static final int NUM_TESTS = 100;

	 /**
	  * Return a randomly selected method to be tests !.
	  */
	 //****************************************************
	 public static String RandomSelectMethod(Random random) {
		 String[] methodArray = new String[]{"getApptRange", "deleteAppt"};// The list of the of methods to be tested in the Appt class

		 int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		 return methodArray[n]; // return the method name
	 }
	 //****************************************************
	 /**
	  * Generate Random Tests that tests CalDay Class.
	  */
	 @Test
	 public void radnomtest() throws Throwable {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start test");

		 //for loop to iterate, and create data to be tested
		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed = 10;//System.currentTimeMillis();
			 //System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);

			 for (int i = 0; i < NUM_TESTS; i++) {
			 	//create values
				 int startHour = ValuesGenerator.getRandomIntBetween(random, -1, 25);
				 int startMinute = ValuesGenerator.getRandomIntBetween(random, -1, 60);
				 int startDay = ValuesGenerator.getRandomIntBetween(random, -1, 32);
				 int startMonth = ValuesGenerator.getRandomIntBetween(random, -1, 13);
				 int startYear = ValuesGenerator.getRandomIntBetween(random, 0, 2017);
				 int cDay = ValuesGenerator.getRandomIntBetween(random, 1, 31);
				 int cMonth = ValuesGenerator.getRandomIntBetween(random, 10, 12);
				 int cYear = ValuesGenerator.getRandomIntBetween(random, 0, 2017);
				 String title = "Party Time";
				 String description = "Excellent!";

				 //create secondary values to be used for our loop
				 int startHour1 = ValuesGenerator.getRandomIntBetween(random, -1, 25);
				 int startMinute1 = ValuesGenerator.getRandomIntBetween(random, -1, 60);
				 int startDay1 = ValuesGenerator.getRandomIntBetween(random, -1, 32);
				 int startMonth1 = ValuesGenerator.getRandomIntBetween(random, -1, 13);
				 int startYear1 = ValuesGenerator.getRandomIntBetween(random, 0, 2017);
				 int cDay1 = ValuesGenerator.getRandomIntBetween(random, 1, 31);
				 int cMonth1 = ValuesGenerator.getRandomIntBetween(random, 10, 12);
				 int cYear1 = ValuesGenerator.getRandomIntBetween(random, 0, 2017);
				 String title1 = "Party Time";
				 String description1 = "Excellent!";
				 //Construct a new Appointment object with the initial data
				 GregorianCalendar cal = new GregorianCalendar(cDay, cMonth, cYear);
				 GregorianCalendar call = new GregorianCalendar(cDay1, cMonth1, cYear1);
				 CalDay calday = new CalDay(cal);
				 TimeTable timeTable = new TimeTable();

				 //add to appt list
				 Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
				 Appt appt1 = new Appt(startHour1, startMinute1, startDay1, startMonth1, startYear1, title1, description1);
				 String methodName = TimeTableRandomTest.RandomSelectMethod(random);

				 //testing deleteAppt if it exists
				 if (methodName.equals("deleteAppt")) {
					 calday.addAppt(appt);
					 calday.addAppt(appt1);
					 Appt ranappt = ValuesGenerator.getRandomIntBetween(random, 0, 10) == 5 ? new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description) : null;
					 timeTable.deleteAppt(calday.getAppts(), ranappt);
				 } else {
				 	//create and add the appt, then delete it
					 calday.addAppt(appt);
					 calday.addAppt(appt1);
					 LinkedList<Appt> appts = ValuesGenerator.getRandomIntBetween(random, 0, 10) == 5 ? calday.getAppts() : null;
					 timeTable.deleteAppt(appts, appt);
				 }
			 }
			//display the time elapsed
			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if ((iteration % 10000) == 0 && iteration != 0)
				 System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
		 }

		 //end test
		 System.out.println("ending test");
	 }
	 //****************************************************
 }