package Core_Java;

public class StringComparision {

	public static void main(String[] args) {

		System.out.println("Example 1 : \n-------------------");
		String a1="Danesh";
		String a2="Danesh";
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		System.out.println("\nExample 2 : \n-------------------");		
		String a3=new String("Danesh");
		String a4=new String("Danesh");
		
		System.out.println(a3==a4);
		System.out.println(a3.equals(a4));
		
		System.out.println("\nExample 3 : \n-------------------");		
		String a5="Danesh";
		String a6=new String("Danesh");
		
		System.out.println(a5==a6);
		System.out.println(a5.equals(a6));
		
		System.out.println("\nExample 4 : \n-------------------");		
		String a7="Danesh";
		String a8=new String("Danesh");
		String a9=a8;
		
		System.out.println(a7==a8);
		System.out.println(a7.equals(a8));
		System.out.println(a7==a9);
		System.out.println(a7.equals(a9));
		System.out.println(a8==a9);
		System.out.println(a8.equals(a9));
		
		System.out.println("-------------------------------------------------");		
		//Intern : 
		
		String a10="Danesh";
		String a11="Danesh";
		String a12=new String("Danesh Awati");
		a12=a12.intern();
		String a13=a12.intern();
		
	}

}
