package edu.osu.cs362;

import java.util.*;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	//set timeout for testing to 30 seconds
	private static final long TestTimeout = 60 * 500 * 1;
	private static final int NUM_TESTS = 100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
	//****************************************************
	public static String RandomSelectMethod(Random random) {
		String[] methodArray = new String[]{"isValid", "addAppt"};
		// The list of the of methods to be tested in the Appt class

		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		return methodArray[n]; // return the method name
	}
	//****************************************************
	/**
	 * Generate Random Tests that tests CalDay Class.
	 */
	//****************************************************
	@Test
	public void radnomtest() throws Throwable {
		//initiate our timer
		long startTime = Calendar.getInstance().getTimeInMillis();
		long total = Calendar.getInstance().getTimeInMillis() - startTime;
		System.out.println("Starting random testing...");

		//for loop to check if we have approached our timeout session
		for (int iteration = 0; total < TestTimeout; iteration++) {
			long randomseed = 10;//System.currentTimeMillis();
			Random random = new Random(randomseed);

			//for loop to iterate through values
			for (int i = 0; i < NUM_TESTS; i++) {
				//construct inital data to be used
				int startHour = ValuesGenerator.getRandomIntBetween(random, -1, 25);
				int startMinute = ValuesGenerator.getRandomIntBetween(random, -1, 60);
				int startDay = ValuesGenerator.getRandomIntBetween(random, -1, 32);
				int startMonth = ValuesGenerator.getRandomIntBetween(random, -1, 13);
				int startYear = ValuesGenerator.getRandomIntBetween(random, 0, 2017);
				int calDay = ValuesGenerator.getRandomIntBetween(random, 1, 31);
				int calMonth = ValuesGenerator.getRandomIntBetween(random, 10, 12);
				int calYear = ValuesGenerator.getRandomIntBetween(random, 0, 2017);
				String title = "Party Time";
				String description = "Excellent!";

				//construct additional set of data to be used
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
				GregorianCalendar cal = new GregorianCalendar(calDay , calMonth, calYear);
				CalDay calday = new CalDay(cal);

				//assign our strings into the appt list
				Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
				Appt appt1 = new Appt(startHour1, startMinute1, startDay1, startMonth1, startYear1, title1, description1);
				//testing method to decide if it selects inbalid or addappt
				String methodName = ApptRandomTest.RandomSelectMethod(random);
				if (methodName.equals("isValid")) {
					calday.isValid();
				} else {
					calday.addAppt(appt);
					calday.addAppt(appt1);
				}
			}
			//display the elapsed time
			total = (Calendar.getInstance().getTimeInMillis() - startTime);
			if ((iteration % 10000) == 0 && iteration != 0)
				System.out.println("total time: " + total + " of " + TestTimeout);

		}

		//end test
		System.out.println("ending test");

	}
	//****************************************************
}