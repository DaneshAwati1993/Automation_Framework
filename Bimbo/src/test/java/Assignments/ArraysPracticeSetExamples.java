package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPracticeSetExamples {

	public static void main(String[] args) {

//		🧩 Java Arrays Practice Set (50 Examples)
//		🟢 Level 1: Basics (Array creation, access, iteration)
		System.out.println("\n======================================\nSolution for the Example 1 : \n======================================");
//		1️⃣ Declare and initialize a 1D array of integers and print all elements.
		
		int a1[]= {1,2,3,4,5};
		for (int i=0; i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
		}
		
		System.out.println("\n======================================\nSolution for the Example 2 : \n======================================");
//		2️⃣ Read n integers from the user and store them in an array, then print them.
		Scanner sc=new Scanner(System.in);
		
		/*
        System.out.print("Enter how many numbers you want to store: ");
		int n2=sc.nextInt();
		int[] a2=new int[n2];
        System.out.println("Enter " + n2 + " integers:");
        
        System.out.println("Read the Numbers");
        for (int i=0; i<n2; i++)
        {
        	System.out.println("Element "+(i+1)+" is : ");
        	a2[i]=sc.nextInt();
        }
        System.out.println("Print the Array");
        for(int i=0;i<n2;i++)
        {
        	System.out.println("number :"+i+" is : "+a2[i]);
        }
	*/
		
		System.out.println("\n======================================\nSolution for the Example 3 : \n======================================");

//		3️⃣ Find the sum of all elements in an array.
		int a3[]= {1,2,3,4,5};
		int sum3=0;
		for(int i=0;i<a3.length;i++)
		{
			sum3=sum3+a3[i];
		}
		System.out.println("Total Sum of all the elements in the Array is : "+sum3);
		
		System.out.println("\n======================================\nSolution for the Example 4 : \n======================================");
//		4️⃣ Find the average of all array elements.
		int a4[]= {10,2,3,40,50};
		int sum4=0;
		int count4=0;
		for(int i=0;i<a4.length;i++)
		{
			sum4=sum4+a4[i];
			count4++;

		}
		System.out.println("Total Sum of all the elements in the Array is : "+sum4);
		System.out.println("Total Average of all the elements in the Array is : "+(sum4 / count4));
		
		System.out.println("\n======================================\nSolution for the Example 5 : \n======================================");
//		5️⃣ Find the maximum element in an array.
		int a5[]= {100,2,3,60,50};
		Arrays.sort(a5);
		for(int i=a5.length-1;i<a5.length;i++)
		{
		System.out.println("Maximum element in an array is : "+a5[i]);
		}
		
		System.out.println("\n======================================\nSolution for the Example 6 : \n======================================");
//		6️⃣ Find the minimum element in an array.
		int a6[]= {100,20,3,60,50};
		Arrays.sort(a6);
		for(int i=0; i<a6.length-(a6.length-1); i++)
		{
		System.out.println("Minimum element in an array is : "+a6[i]);
		}
		
		System.out.println("\n======================================\nSolution for the Example 7 : \n======================================");
//		7️⃣ Count even and odd numbers in an array.
		int a7[]= {4,2,3,5,7,61};
		int Even4=0 , Odd4=0;
		for(int i=0;i<a7.length;i++)
		{
			if(a7[i]%2==0)
			{
				Even4++;
			}
			else
			{
				Odd4++;
			}

		}
		System.out.println("Total Count of Even numbers in the Array is : "+Even4);
		System.out.println("Total Count of Odd numbers in the Array is : "+Odd4);
		
		System.out.println("\n======================================\nSolution for the Example 8 : \n======================================");
//		8️⃣ Search for a specific element in the array (linear search).
		int a8[]= {4,2,3,5,7,61};
		boolean found8=false;
		int num8=1;
		for(int i=0;i<a8.length;i++)
		{
			if(num8==a8[i])
			{
				System.out.println("Entered number "+num8+" Is the part of The Array");
				found8=true;
			}
		}
		if(!found8)
		{
			System.out.println("Entered number "+num8+" is not a part of the Array");
		}
		
		System.out.println("\n======================================\nSolution for the Example 9 : \n======================================");
//		9️⃣ Copy elements from one array to another.
		int a9[]= {1,2,3};
		int a92[]= new int[a9.length];
		for (int i9=0;i9<a9.length;i9++)
		{
			a92[i9]=a9[i9];
			System.out.print(a92[i9]+" ");
		}
		 // 🔹 Method 2: Using System.arraycopy()
        int[] a93 = new int[a9.length];
        System.arraycopy(a9, 0, a93, 0, a9.length);
        System.out.println("\nMethod 2 : Copied Array (System.arraycopy): " + Arrays.toString(a93));

        // 🔹 Method 3: Using Arrays.copyOf()
        int[] a94 = Arrays.copyOf(a9, a9.length);
        System.out.println("\nMethod 3 : Copied Array (Arrays.copyOf): " + Arrays.toString(a94));
        
		System.out.println("\n======================================\nSolution for the Example 10 : \n======================================");
//		🔟 Reverse the array elements manually (without library).
		int a10[]= {4,2,3,5,7,6};
		for(int i=0;i<a10.length;i++)
		{
			System.out.print(a10[a10.length-i-1]+ " ");
		}
		
//		🟡 Level 2: Sorting, Swapping, and Modifying
		System.out.println("\n======================================\nSolution for the Example 11 : \n======================================");
//		11️⃣ Sort the array in ascending order (use loops, not built-in sort).
		int a11[]= {4,2,30,5,1,6};
        System.out.println("Original Array: " + Arrays.toString(a11));
        for(int i=0; i<a11.length-1; i++)
        {
        	for(int j=i+1; j<a11.length; j++)
        	{
        		if(a11[i]>a11[j])
        		{
        			int temp=a11[i];
        			a11[i]=a11[j];
        			a11[j]=temp;
        		}
        	}
        }
        System.out.println("Ascending Order Sorted Array is : "+Arrays.toString(a11));
        
		System.out.println("\n======================================\nSolution for the Example 12 : \n======================================");

        // 🔹 Sorting using nested loops (Bubble Sort logic)
		
//		12️⃣ Sort the array in descending order.
		int a12[]= {4,2,30,5,1,6};
        System.out.println("Original Array: " + Arrays.toString(a12));
        for(int i=0; i<a12.length-1; i++)
        {
        	for(int j=i+1; j<a12.length; j++)
        	{
        		if(a12[i]<a12[j])
        		{
        			int temp12=a12[i];
        			a12[i]=a12[j];
        			a12[j]=temp12;
        		}
        	}
        }
        System.out.println("Descending Order Sorted Array is : "+Arrays.toString(a12));
        
		System.out.println("\n======================================\nSolution for the Example 13 : \n======================================");
//		13️⃣ Swap the first and last elements in an array.
		int a13[]= {4,2,30,5,1,6};
        System.out.println("First Element in the Array is :"+a13[0]+"\nLast Element in the Array is : "+a13[a13.length-1]);
        System.out.println("\nSwapping of the first and last elements in an array "+"\n--------------------------------------------------------");
        for(int i=0;i==0;i++)
        {
        	for (int j=a13.length-1;j<a13.length;j++)
        	{
        		int temp13=a13[i];
        		a13[i]=a13[j];
        		a13[j]=temp13;
        	}
        }
        System.out.println("First Element in the Array is :"+a13[0]+"\nLast Element in the Array is : "+a13[a13.length-1]);
        
		System.out.println("\n======================================\nSolution for the Example 14 : \n======================================");
//		14️⃣ Rotate an array by one position to the right.
		int a14[]= {4,2,30,5,1,6};
		int last14=a14[a14.length-1];
        System.out.println("Original Array: " + Arrays.toString(a14));
        for(int i=a14.length-1; i>0; i--)
        {
        	a14[i]=a14[i-1];
        }
        a14[0]=last14;
        System.out.println("After Rotating an array by one position to the right is :"+Arrays.toString(a14));
		
		System.out.println("\n======================================\nSolution for the Example 15 : \n======================================");
//		15️⃣ Rotate an array by k positions.
		int a15[]= {4,2,30,5,1,6};
		int a15Roatposition=3;
		int last15=a15[a15.length-a15Roatposition];
        System.out.println("Original Array: " + Arrays.toString(a15));
        int temp15[]=new int[a15Roatposition];
        
        //Create the temp array for the a15Roatposition
        for (int i=0;i<a15Roatposition;i++)
        {
        	temp15[i]=a15[a15.length-a15Roatposition+i];
        }
        //Shift the array post the a15Roatposition
        for (int i=a15.length-1;i>=a15Roatposition;i--)
        {
        	a15[i]=a15[i-a15Roatposition];
        }
        //Copy the array temp elements to the begging of the ARray
        for (int i=0; i<a15Roatposition;i++)
        {
        	a15[i]=temp15[i];
        }

        System.out.println("After Rotating an array by one position to the right is :"+Arrays.toString(a15));
        
		System.out.println("\n======================================\nSolution for the Example 16 : \n======================================");
//		16️⃣ Remove a specific element from the array (shift elements).
		
		System.out.println("\n======================================\nSolution for the Example 17 : \n======================================");
//		17️⃣ Insert a new element at a given position.
		
		System.out.println("\n======================================\nSolution for the Example 18 : \n======================================");
//		18️⃣ Count occurrences of a given number in an array.
		
		System.out.println("\n======================================\nSolution for the Example 19 : \n======================================");
//		19️⃣ Find the second largest element in the array.
		int a19[]= {100,2,3,60,50};
		Arrays.sort(a19);
		System.out.println("Array after sorting is : "+Arrays.toString(a19));
		for(int i=a19.length-2;i<a19.length-1;i++)
		{
		System.out.println("Maximum element in an array is : "+a19[i]);
		}
		
		System.out.println("\n======================================\nSolution for the Example 20 : \n======================================");
//		20️⃣ Find the second smallest element.
		int a20[]= {100,20,3,60,50};
		Arrays.sort(a20);
		System.out.println("Array after sorting is : "+Arrays.toString(a20));
		for(int i=1; i<a20.length-(a20.length-2); i++)
		{
		System.out.println("Minimum element in an array is : "+a20[i]);
		}
		
		System.out.println("\n======================================\nSolution for the Example 21 : \n======================================");
//		🟠 Level 3: Multi-Dimensional Arrays
//
//		21️⃣ Declare and print a 2D matrix (3×3).
		int a21[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0; i<a21.length;i++)
		{
			for (int j=0;j<a21[i].length;j++)
			{
			System.out.print(a21[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n======================================\nSolution for the Example 22 : \n======================================");
//		22️⃣ Input elements into a 2D array and print them in matrix form.
		/*
		System.out.println("Enter the number of rows is : ");
		int row22=sc.nextInt();
		System.out.println("Enter the number of columns is : ");
		int col22=sc.nextInt();
		int a22[][]=new int[row22][col22];
		
		//Take input data for the 2d ARray
        for (int i=0; i<row22; i++)
        {
           	{
        		for (int j=0;j<col22;j++)
        		{
        			System.out.println("Elements ["+i+"]["+j+"] is :" );
        			a22[i][j]=sc.nextInt();
        		}
           	}
        }
        System.out.println("Print the Array");
        for (int i=0; i<row22; i++)
        {
           	{
        		for (int j=0;j<col22;j++)
        		{
        			System.out.print(a22[i][j]+" " );
        		}
           	}
           	System.out.println();
        }
		*/
		
		System.out.println("\n======================================\nSolution for the Example 23 : \n======================================");
//		23️⃣ Find the sum of all elements in a 2D array.
		int a23[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum23=0;
		for (int i=0; i<a23.length;i++)
		{
			for(int j=0; j<a23[i].length;j++)
			{
				sum23=sum23+a23[i][j];
			}
		}
		System.out.println("Total sum of the all the elements from the Array is : "+sum23);
		
		System.out.println("\n======================================\nSolution for the Example 23 : \n======================================");
//		24️⃣ Find the sum of each row and each column.
		System.out.println("Print the Original Matrix Array\n---------------------------------");
		int a24[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i<a24.length;i++)
		{
			for (int j=0; j<a24[i].length;j++)
			{
				System.out.print(a24[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Row Sum Calualtions\n------------------------------");
		for (int i=0; i<a24.length;i++)
		{
			int sum24row=0;
			for(int j=0; j<a24[i].length;j++)
			{
				sum24row=sum24row+a24[i][j];
			}
			System.out.println("Total sum of the all the elements from the row "+i+" is : "+sum24row);
		}
		System.out.println("\nColumn Sum Calualtions\n------------------------------");
		for (int j=0; j<a24.length;j++)
		{
			int sum24col=0;
			for(int i=0; i<a24[j].length;i++)
			{
				sum24col=sum24col+a24[i][j];
			}
			System.out.println("Total sum of the all the elements from the row "+j+" is : "+sum24col);
		}
		
		System.out.println("\n======================================\nSolution for the Example 25 : \n======================================");
//		25️⃣ Print the main diagonal elements.
		System.out.println("Print the Original Matrix Array\n---------------------------------");
		int a25[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i<a25.length;i++)
		{
			for (int j=0; j<a25[i].length;j++)
			{
				System.out.print(a25[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nPrint the Main DIagonal Elements\n------------------------------");
		for (int i=0; i<a25.length;i++)
		{
			for(int j=0; j<a25[i].length;j++)
			{
				if(i==j)
				{
					System.out.print(a25[i][j]+" ");
				}
			}
		}
		
		System.out.println("\n======================================\nSolution for the Example 26 : \n======================================");
//		26️⃣ Print the secondary diagonal elements.
		System.out.println("Print the Original Matrix Array\n---------------------------------");
		int a26[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i<a26.length;i++)
		{
			for (int j=0; j<a26[i].length;j++)
			{
				System.out.print(a26[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nPrint the Secondary DIagonal Elements\n------------------------------");
		for (int i=0; i<a25.length;i++)
		{
			for(int j=0; j<a25[i].length;j++)
			{
				if(i+j==a25.length-1)
				{
					System.out.print(a25[i][j]+" ");
				}
			}

		}
		
		System.out.println("\n======================================\nSolution for the Example 27 : \n======================================");
//		27️⃣ Find the sum of diagonals separately.
		System.out.println("Print the Original Matrix Array\n---------------------------------");
		int a27[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i<a27.length;i++)
		{
			for (int j=0; j<a27[i].length;j++)
			{
				System.out.print(a27[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nPrint the Main DIagonal Elements\n------------------------------");
		int sum27maindiagonal=0;
		for (int i=0; i<a27.length;i++)
		{
			for(int j=0; j<a27[i].length;j++)
			{
				if(i==j)
				{
					System.out.print(a27[i][j]+" ");
					sum27maindiagonal=sum27maindiagonal+a27[i][j];					
				}
			}
		}
		System.out.println("Total SUm of the Main diagonal is : "+sum27maindiagonal);
		System.out.println("\nPrint the Secondary DIagonal Elements\n------------------------------");
		int sum27Secodiagonal=0;
		for (int i=0; i<a27.length;i++)
		{
			for(int j=0; j<a25[i].length;j++)
			{
				if(i+j==a27.length-1)
				{
					System.out.print(a27[i][j]+" ");
					sum27Secodiagonal=sum27Secodiagonal+a27[i][j];					
				}
			}
		}
		System.out.print("Total SUm of the Main diagonal is : "+sum27Secodiagonal);

		System.out.println("\n======================================\nSolution for the Example 28 : \n======================================");
//		28️⃣ Transpose of a matrix.
		int a28[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.print("Print Original Matrix\n-------------------------\n");
		for(int i=0;i<a28.length;i++)
		{
			{
				for(int j=0;j<a28[i].length;j++)
				{
					System.out.print(a28[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		System.out.print("\nPrint Transpose Matrix\n-------------------------\n");
		for(int j=0;j<a28.length;j++)
		{
			{
				for(int i=0;i<a28[j].length;i++)
				{
					System.out.print(a28[i][j]+" ");
				}
			}
			System.out.println();	
		}
		System.out.println("\n======================================\nSolution for the Example 29 : \n======================================");
//		29️⃣ Multiply two matrices (m×n and n×p).
		int a291[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int a292[][]= {{1,2},{3,4},{5,6}};
		int rowA=a291.length;
		int colA=a291[0].length;
		int rowB=a292.length;
		int colB=a292[0].length;
		int Result[][]=new int[rowA][colB];
		
		if(colA !=rowB)
		{
			System.out.println("Multiple of the Matrix is Not Possible....");
			return;
		}
		System.out.println("Printing the Matrix aftre multiplication fo 2 Matrix \n-------------------------------------------------------");
		for(int i=0;i<rowA;i++)
		{
			for(int j=0;j<colB;j++)
			{
			for(int k=0;k<colA;k++)
				{
				Result[i][j] +=(a291[i][k]*a292[k][j]);
				}
			System.out.print(Result[i][j]+" ");
			}
			System.out.println();
		}	
		
		System.out.println("\n======================================\nSolution for the Example 30 : \n======================================");
//		30️⃣ Find the largest element in each row of a 2D array.
		int a30[][]= {{1,2,9},{4,5,6},{7,8,9}};

		for(int i=0;i<a30.length;i++)
		{
			int max = a30[i][0];
			{
				for(int j=0;j<a30[i].length;j++)
				{
					if (a30[i][j]>max)
					{
						max=a30[i][j];
					}
				}
			}
			System.out.println("Maximum element in an array row : "+i+" is :"+max);
			
		}
		
		System.out.println("\n======================================\nSolution for the Example 31 : \n======================================");
		
//		🔵 Level 4: Searching and Frequency
//
//		31️⃣ Implement Binary Search on a sorted array.
		/*
		int a31[]= {1,2,3,4,5,6,7,8,9};
		int num31=7;
		int low=0;
		boolean found=false;
		int max=a31.length-1;
		if (low<=max)
		{
			int mid = (low+max)/2;
		
			if (a31[mid] == num31) 
			{
		        System.out.println("Number found at position/index: " + mid);
		        found = true;
		        break;
		    }
		    else if (num31 > a31[mid]) {
		        low = mid + 1;  // search right side
		    }
		    else {
		        max = mid - 1; // search left side
		    }
		}

		if (!found) {
		    System.out.println("Number not found in array.");
		}

		*/
		
		System.out.println("\n======================================\nSolution for the Example 32 : \n======================================");
//		32️⃣ Find duplicate elements in an array.
		int a32[][]= {{1,2,3},{3,4,5},{5,6,7}};
		for (int i=0;i<a32.length;i++)
		{
			for(int j=0;j<a32[i].length;j++)
			{
				for(int x=i;x<a32.length;x++)
				{
					for(int y=(x==i ? j+1 : 0);y<a32[x].length;y++)
					{
						if(a32[i][j]==a32[x][y])
						{
							System.out.print(a32[i][j]+" ");
						}
					}
				}
			}
		}
		System.out.println("\n======================================\nSolution for the Example 33 : \n======================================");

//		33️⃣ Remove duplicates and print unique elements only.
		int a33[][]= {{1,2,3},{3,1,5},{5,6,7}};
		for (int i=0;i<a33.length;i++)
		{
			for(int j=0;j<a33[i].length;j++)
			{
				 boolean unique = true;
				 for (int x = 0; x <= i; x++) 
				 {
					 for (int y = 0; y < (x == i ? j : a33[x].length); y++)
					 {
						if(a33[i][j]!=a33[x][y])
						{
							unique=false;
							break;
						}
					}
				}
				if(unique)
				{
					System.out.print(a33[i][j]+" ");
				}
			}
		}
//		34️⃣ Find elements that appear more than once.
//		35️⃣ Find the frequency of each element in an array.
//		36️⃣ Find missing number from array of 1 to N.
//		37️⃣ Check if two arrays are equal (same elements in same order).		
//		38️⃣ Merge two arrays into one larger array.
//		39️⃣ Find common elements between two arrays.
//		40️⃣ Find elements present in first array but not in second.
//
//		🔴 Level 5: Logical & Pattern-Based
//
//		41️⃣ Move all zeros to the end of the array (keep order of others).
//		42️⃣ Check if array is palindrome (same forward/backward).
//		43️⃣ Find the pair of elements whose sum equals a given number.
//		44️⃣ Find triplets in array that sum to a given number.
//		45️⃣ Rearrange array in alternating positive and negative numbers.
//		46️⃣ Find maximum product of two elements in an array.
//		47️⃣ Print array elements in spiral order (2D array).
//		48️⃣ Rotate a 2D matrix by 90° clockwise.
//		49️⃣ Find the difference between sums of diagonals.
//		50️⃣ Find the saddle point in a matrix (if exists).
//
//		⚙️ Bonus Challenges (optional advanced)
//
//		✅ Implement array reversal using recursion.
//		✅ Implement in-place transpose of a square matrix.
//		✅ Find leaders in an array (elements greater than all to their right).
//		✅ Find majority element (appears more than n/2 times).
//		✅ Kadane’s Algorithm – maximum subarray sum.
//		
		
	}

	private static int abs(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
