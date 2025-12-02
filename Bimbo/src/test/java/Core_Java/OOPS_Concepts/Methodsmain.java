package Core_Java.OOPS_Concepts;

public class Methodsmain {

	public static void main(String[] args) {

		Methods mt1=new Methods();
		
		//Calling Method
		//invoking the Method
		//1) No Input params and no Return type

		mt1.message1();
		
		//2) No Input params and has a Return type

		int x=mt1.message2();
		System.out.println(x);
		
		//3) Has Input params and no Return type

		mt1.message3("Danesh");
		mt1.message4("Danesh", 10);
		
		//4) Has Input params and has a Return type
		String fullname=mt1.message5("Danesh", "Awati");
		System.out.println(fullname);

	}

}
