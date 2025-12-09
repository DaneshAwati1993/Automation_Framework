package Enumaration;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormatting {

	public static void main(String[] args) {

		Date date=new Date();
		
		//Case 1 : 
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
		String date1=formatter.format(date);
		System.out.println(date1);
		
		//case 2 :
		SimpleDateFormat formatter2=new SimpleDateFormat("MM-dd-yyyy");
		String date2=formatter2.format(date);
		System.out.println(date2);
		
		//case 3 :
		SimpleDateFormat formatter3=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String date3=formatter3.format(date);
		System.out.println(date3);
		
		//case 4 :
		SimpleDateFormat formatter4=new SimpleDateFormat("dd-MMMM-yyyy");
		String date4=formatter4.format(date);
		System.out.println(date4);
		
		//case 5 :
		SimpleDateFormat formatter5=new SimpleDateFormat("dd-MMMM-yyyy zzzz");
		String date5=formatter5.format(date);
		System.out.println(date5);
		
		//case 6 :
		SimpleDateFormat formatter6=new SimpleDateFormat("dd MMMM yyyy HH:mm:ss z");
		String date6=formatter6.format(date);
		System.out.println(date6);
	}

}
