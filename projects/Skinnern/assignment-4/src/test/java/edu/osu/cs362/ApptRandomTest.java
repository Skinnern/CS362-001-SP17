package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setDescription"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
    }
	
    /**
     * Generate Random Tests that tests Appt Class.
     */

	 @Test
 
	 public void randomtest()  throws Throwable  {
		 //notify beginning test
		 System.out.println("Starting test");
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 TimeUnit.SECONDS.sleep(1);		 
		 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				//long randomseed =10;//System.currentTimeMillis();
				long randomseed = System.currentTimeMillis();
				//System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=13;
				 int startMinute=30;
				 int startDay=10;
				 int startMonth=4;
				 int startYear=2017;
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data	 
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				//***********
				//set calls we will make
				//variables will be used for random tests
				//we will want to validate the values we generate after we create them
				//***********
				appt.setStartHour(random.nextInt());
				//re validate
				appt.setStartHour(random.nextInt(24));
				appt.setStartMinute(random.nextInt());
				//re validate
				appt.setStartMinute(random.nextInt(60));
				appt.setStartDay(random.nextInt());
				//re validate
				appt.setStartDay(random.nextInt(31) + 1);	
				appt.setStartMonth(random.nextInt());
				// Revalidate
				appt.setStartMonth(random.nextInt(12) + 1);			
				//any year we recieve will be valid
				appt.setStartYear(random.nextInt());

				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
				//************
				//Set the title
				//************
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					//************
					//Set our description
					//************
						if (methodName.equals("setDescription")){
						   String newDescription=(String) ValuesGenerator.getString(random);
						   appt.setDescription(newDescription);						   
						}			
				}
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			}
			//notify we ended test
		 System.out.println("ending test");
	 }
}