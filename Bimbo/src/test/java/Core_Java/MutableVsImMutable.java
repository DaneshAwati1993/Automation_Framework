package Core_Java;

import java.util.Arrays;

public class MutableVsImMutable {

	public static void main(String[] args) {

		//Mutable : 
		int a1[]= {11,20,8,9,3,45,88,55,77,34};
		System.out.println("Before Sorting :"+Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println("After Sorting :"+Arrays.toString(a1));
		
		//ImMutable : 
		String a2 = new String("Welcome");
		System.out.println(a2);
		
		a2.concat("To Java Programming");
		System.out.println(a2);
		
		//Mutable :
		StringBuffer a3 = new StringBuffer("Welcome");
		System.out.println(a3);
		
		a3.append(" To Java Programming");
		System.out.println(a3);
		
		//Mutable :
		StringBuilder a4 = new StringBuilder("Danesh");
		System.out.println(a4);
		
		a4.append(" Welcome To Java Programming");
		System.out.println(a4);
	}

}
