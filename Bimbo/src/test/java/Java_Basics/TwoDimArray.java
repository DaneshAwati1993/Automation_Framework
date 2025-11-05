package Java_Basics;

public class TwoDimArray {

	public static void main(String[] args) {

		String  a[][]=new String[3][5];
		
		System.out.println(a.length); //TOtal number of Rows
		System.out.println(a[2].length); //TOtal number of Columns
		
		a[0][0]="A1";
		a[0][1]="B1";
		a[0][2]="C1";
		a[0][3]="D1";
		a[0][4]="E1";
		
		
		a[1][0]="A2";
		a[1][1]="B2";
		a[1][2]="C2";
		a[1][3]="D2";
		a[1][4]="E2";
		
		
		a[2][0]="A3";
		a[2][1]="B3";
		a[2][2]="C3";
		a[2][3]="D3";
		a[2][4]="E3";

		System.out.println(a[0][2]);
		System.out.println(a[1][2]);
		System.out.println(a[2][2]);
		
		//length of array : 
		
		System.out.println("total number of rows : "+a.length);
		System.out.println("total number of columns : "+a[0].length);

		//Print all the Array values ;
		//Normal For loop ;
		System.out.println("====================================\nNormal For loop....\n====================================");
		
		int a1[][]= {{100,200},{300,400},{500,600}};
		
		for (int i=0;i<a1.length;i++)
		{
			for (int j=0;j<a1[i].length;j++)
			{
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("====================================\nEnhanced for loop....\n====================================");
		//Enhanced for loop : 
		
		for(int arr[]:a1)
		{
			for(int x:arr)
			{
				System.out.print(x+ " ");
			}
			System.out.println();
		}

		
		//Find Sum of Elements in an Array : 
		
		int a2[]= {1,2,3,4,5};
		int sum=0;
		for(int x:a2)
		{
			sum +=x;
		}
		System.out.println("Total sum of all the digits from the array is : "+sum);
		
		
		//Find Even and Odd numbers from an Array : 
		
		int a3[]= {1,2,3,4,5,6};
		int Even=0;
		int Odd=0;
		for (int x1:a3)
		{
			if(x1%2==0)
			{
				Even++;
			}
			else
			{
				Odd++;
			}
		}
		System.out.println("Total number of Odd Digits : "+Odd);
		System.out.println("Total number of Even Digits : "+Odd);
		
	}

}
