package Java_Basics;

public class TwoDimArray {

	public static void main(String[] args) {

		String a[][]=new String[3][5];
		
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
		
		//Print all the Array values ;
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}

	}

}
