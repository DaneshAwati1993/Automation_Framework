package Core_Java;

import java.util.Arrays;

public class InbuiltMethodsofArrays {

	public static void main(String[] args) {

		int a1[]= {10,20,30,11,33,23,44,18,55};
		
		System.out.println("Before Sorting : "+Arrays.toString(a1));
		
		Arrays.sort(a1);
		
		System.out.println("After Sorting : "+Arrays.toString(a1));
		
		char a2[]= {'A','Z','R','B','M','D'};
		
		System.out.println("Before Sorting : "+Arrays.toString(a2));
		
		Arrays.sort(a2);
		
		System.out.println("After Sorting : "+Arrays.toString(a2));
	}

}
