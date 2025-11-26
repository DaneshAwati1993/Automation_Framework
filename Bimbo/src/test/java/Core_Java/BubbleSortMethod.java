package Core_Java;

import java.util.Arrays;

public class BubbleSortMethod {

	public static void main(String[] args) {


		int a1[]= {10,33,9,6,7,55,66,35,42,77};
		int temp=0;
		
		System.out.println("Ascending order sorting : \n----------------------------------");
		
		for (int i=0; i<a1.length; i++)
		{
			for(int j=i+1; j<a1.length;j++)
			{
				if (a1[j]<a1[i])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(a1));
		
System.out.println("\n\nDescending order sorting : \n----------------------------------");
		
		for (int i=0; i<a1.length; i++)
		{
			for(int j=i+1; j<a1.length;j++)
			{
				if (a1[j]>a1[i])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(a1));
	}

}
