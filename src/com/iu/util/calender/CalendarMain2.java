package com.iu.util.calender;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
//		Calendar now = Calendar.getInstance();
//		
//		Calendar future = Calendar.getInstance();
//		
//		future.set(Calendar.MINUTE, 15);
//		
//		long n = now.getTimeInMillis();
//		long f = future.getTimeInMillis();
//		
//		long result = f - n;
//		System.out.println(result);
//
//		System.out.println(result/(1000*60));
		
		
		Calendar now = Calendar.getInstance();
		
		Calendar birth = Calendar.getInstance();
		
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		
		birth.set(Calendar.YEAR, 1996);
		birth.set(Calendar.MONTH, 2);
		birth.set(Calendar.DATE, 28);
		
		b = birth.getTimeInMillis();
		
		long result = b-n;
		System.out.println("나는 몇년을 살았을까? " + (result/-(1000*60*60*24)/365));

		Date date = now.getTime();
		System.out.println(date);
	}

}
