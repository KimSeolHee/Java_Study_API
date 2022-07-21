package com.iu.util.calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.getTime());
//		now.roll(Calendar.MINUTE, 20 );
		
		now.add(Calendar.MINUTE, 20);
		System.out.println(now.getTime());
		
		System.out.println("====================");
		now = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E");
		String time = sd.format(now.getTime());
		System.out.println(time);
		

	}

}
