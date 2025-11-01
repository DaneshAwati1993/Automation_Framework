package Java_Basics;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x="100";
		System.out.println(x+20);
		
		//Conersion of Data type from String to Int.
		int i=Integer.parseInt(x);
		System.out.println(i);
		
		//integer, String, Double , Char , Boolean
		
		//String to Double
		String s1="12.33";
		double d =Double.parseDouble(s1);
		System.out.println(d);
		
		//String to Boolean
		String s2="true";
		boolean c =Boolean.parseBoolean(s2);
		System.out.println(c);
		
		
		//int to String 
		
		int j=200;
		System.out.println(j+20);
		
		String s3=String.valueOf(j);
		System.out.println(s3+20);
	}

}
