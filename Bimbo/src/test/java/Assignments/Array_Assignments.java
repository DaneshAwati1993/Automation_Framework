package Assignments;

public class Array_Assignments {

	public static void main(String[] args) {
		
//		Here are 5 good 2D array problems (from basic to intermediate) for you to solve 👇
		
//		🧩 1. Sum of Rows and Columns
//		Problem:
//
//		Given a 2D integer array, print the sum of each row and column separately.
//		Example:
//
//		Input:
//		1 2 3
//		4 5 6
//		7 8 9
//
//		Output:
//		Row sums: 6, 15, 24
//		Column sums: 12, 15, 18

		System.out.println("======================================\nSolution for the Example 1 : \n======================================");

		int Ex1[][]= { {1,2,3} , {4,5,6} , {7,8,9} };
		//int sum=0;
		
		System.out.println("\nPrint the Array in matrix formate  \n______________________________________");
		
		//Calculation of Row Sum : 
		
		for (int i=0; i<Ex1.length;i++)
		{
			int sumrow=0;
			for (int j=0; j<Ex1[i].length;j++)
			{
				System.out.print(Ex1[i][j]+ " ");	
				sumrow+=Ex1[i][j];
			}
			System.out.println("   Sum of the row : "+sumrow);	
		}
		System.out.println("\nPrint the Array in matrix formate to calculate the column sum \n______________________________________");
		//Calculation of Column Sum : 
		for (int j=0; j<Ex1.length;j++)
		{
			int sumcol=0;
			for (int i=0; i<Ex1[j].length;i++)
			{
				System.out.print(Ex1[i][j]+ " ");	
				sumcol+=Ex1[i][j];
			}
			System.out.println("   Sum of the Column : "+sumcol);	
		}
		
		System.out.println("\n======================================\nSolution for the Example 2 : \n======================================");

//		🧩 2. Transpose of a Matrix
//		Problem:
//
//		Write a program to find the transpose of a matrix (rows become columns).
//		Example:
//
//		Input:
//		1 2 3
//		4 5 6
//
//		Output:
//		1 4
//		2 5
//		3 6

		int Ex2[][]= { {1 , 2 , 3} , {4 , 5 , 6} };
		int colums=Ex2[0].length;
		int rows=Ex2.length;
		int transEx2[][]=new int[colums][rows];
		
		System.out.println("\nDefine Transpose and Print the Array in matrix formate After Transpose  \n___________________________________________________________________________");		
		for (int i=0; i<rows;i++)
		{
			for (int j=0; j<colums;j++)
			{
				System.out.print(Ex2[i][j]+ " ");
				transEx2[j][i]=Ex2[i][j];
			}
			System.out.println();
		}
		System.out.println("\nPrint the Array in matrix formate After Transpose \n_________________________________________________________");
		for (int i=0; i<colums;i++)
		{
			for (int j=0; j<rows;j++)
			{
			System.out.print(transEx2[i][j]+ " ");
		}
		System.out.println();	
	}

		System.out.println("\n======================================\nSolution for the Example 3 : \n======================================");

//		🧩 3. Print Diagonals and Find Their Sums
//		Problem:
//
//		For a square matrix (N x N), print the main diagonal and secondary diagonal elements, then find their sums.
//		Example:
//
//		Input:
//		1 2 3
//		4 5 6
//		7 8 9
//
//		Output:
//		Main diagonal: 1 5 9
//		Secondary diagonal: 3 5 7
//		Sum of main diagonal = 15
//		Sum of secondary diagonal = 15

		int Ex3[][]= { {1,2,3} , {4,5,6} , {7,8,9} };
		//int sum=0;
		
		System.out.println("\nCalculate the sum of Main diagonal digits \n_________________________________________");
		
		//Calculation of Maindiagonalsum Sum : 
		int Maindiagonalsum=0;
		for (int i=0; i<Ex3.length;i++)
		{
			
			for (int j=0; j<Ex3[i].length;j++)
			{
				if (i==j)
				{
				System.out.print(Ex3[i][j]+ " ");
				Maindiagonalsum+=Ex3[i][j];
				}
			}
		}
		System.out.println("   Sum of Main Diagonal : "+Maindiagonalsum);	

		System.out.println("\nCalculate the sum of Secondary diagonal digits \n_________________________________________");
		
		//Calculation of secondarydiagonalsum Sum : 
		int secondarydiagonalsum=0;
		for (int i=0; i<Ex3.length;i++)
		{
			
			for (int j=0; j<Ex3[i].length;j++)
			{
				if (i+j==Ex3.length-1)
				{
				System.out.print(Ex3[i][j]+ " ");
				secondarydiagonalsum+=Ex3[i][j];
				}
			}
		}
		System.out.println("   Sum of Secondary Diagonal : "+secondarydiagonalsum);	

//		🧩 4. Search an Element in 2D Array
//		Problem:
//
//		Take a 2D array and a number from the user.
//
//		If the number exists in the array, print its position (row, column), else print “Not found”.
//		Example:
//
//		Input:
//		10 20 30
//		40 50 60
//		70 80 90
//
//		Search: 50
//
//		Output:
//		Element found at row 1, column 1
		
		System.out.println("\n======================================\nSolution for the Example 4 : \n======================================");

		
		int Ex4[][]= { {10,20,30} , {40,50,60} , {70,80,90} };
		
		int num5=60;
		boolean found = false;
		
		System.out.println("\nSearch an Element in 2D Array  \n_________________________________________");
		
		for (int i=0; i<Ex4.length;i++)
		{
			
			for (int j=0; j<Ex4[i].length;j++)
			{
				if(num5==Ex4[i][j])
				{
				System.out.println("\nElement number "+num5+" found at row : "+i+" column : "+j);
				found=true;
				}
			}
		}
		if(!found)
		{
			System.out.println("\nEntered number "+num5+" is not a part of the Matrix");
		}
		
		System.out.println("\n======================================\nSolution for the Example 5 : \n======================================");

		
//		🧩 5. Rotate Matrix by 90 Degrees Clockwise
//		Problem:
//
//		Rotate a square matrix 90° clockwise (without using extra space if possible).
//		Example:
//
//		Input:
//		1 2 3
//		4 5 6
//		7 8 9
//
//		Output:
//		7 4 1
//		8 5 2
//		9 6 3
		
		int Ex5[][]= { {1,2,3} , {4,5,6} , {7,8,9} };
		
		System.out.println("\nPrint the Original Matrix \n_________________________________________");
		
		for (int i=0; i<Ex5.length;i++)
		{
			
			for (int j=0; j<Ex5[i].length;j++)
			{
				System.out.print(Ex3[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("\nRotate Matrix by 90 Degrees Clockwise \n_________________________________________");
		
		for (int j=0; j<Ex5.length;j++)
		{
			
			for (int i=0; i<Ex5[j].length;i++)
			{
				{
				System.out.print(Ex3[Ex5[j].length-1-i][j]+ " ");
				}
			}
			System.out.println();
		}

	}

}
