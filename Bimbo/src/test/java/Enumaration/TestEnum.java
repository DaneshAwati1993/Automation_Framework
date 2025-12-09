package Enumaration;

public class TestEnum {
	
	public static void main (String[] args) {

		System.out.println(WEEK.SUNDAY);
		
		String a1=WEEK.SUNDAY.toString();
		System.out.println(a1);
		
		//Iterate all the values in enum
		for(WEEK day:WEEK.values())
		{
			System.out.println(day);
		}
		
		//Retrive the Index of all the values in enum
		for(WEEK day:WEEK.values())
		{
			System.out.println(day.ordinal());
		}
	}

}
