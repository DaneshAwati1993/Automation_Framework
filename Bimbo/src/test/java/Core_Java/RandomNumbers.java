package Core_Java;

public class RandomNumbers {

	public static void main(String[] args) {

		//between 0 to 1
		
		double d1=Math.random();
		System.out.println(d1);
		
		double d2=Math.random();
		System.out.println(d2);
		
		//between 10 to 99
		
		double d3=Math.random()*100;
		System.out.println(d3);
		
		//between 109 to 999
		
		double d4=Math.random()*1000;
		System.out.println(d4);
	}

}
