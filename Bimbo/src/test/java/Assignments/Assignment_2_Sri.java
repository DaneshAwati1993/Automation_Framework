package Assignments;

public class Assignment_2_Sri {

	public static void main(String[] args) {
		System.out.println("======================================\nSolution for the Example 1 : \n======================================");
//		1. Prime number find
		int a1=17;
		Boolean isPrime=true;
		if(a1<=1)
		{
			isPrime=false;
		}
		else
		{
		for(int i=2; i<=a1/2; i++)
		{
			if(a1 % i ==0)
			{
				isPrime=false;
				break;
			}
		}
		}

		if (isPrime) {
		    System.out.println("The Entered number " + a1 + " is a Prime Number");
		} else {
		    System.out.println("The Entered number " + a1 + " is Not a Prime Number");
		}
			
		System.out.println("======================================\nSolution for the Example 2 : \n======================================");
//		2. Binary tree check String [] input= {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}; output should be true or false
		
		String[] a2={"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
		boolean Binary=true;
		
		//Extarct Parent and Child Arrays
		int n2=a2.length;
		int [] Parent=new int[n2];
		int [] Child=new int[n2];
		for(int i=0; i<n2; i++)
		{
			String s2=a2[i].replace("(", "").replace(")","");
			String[] P2 = s2.split(",");
			Parent[i]=Integer.parseInt(P2[0]);
			Parent[i]=Integer.parseInt(P2[1]);
		}
			//Check child having only 1parent
			for(int i=0; i<n2; i++)
			{
				int CurrentChild=Child[i];
				int count=0;
				
				for(int j=0; j<n2; j++)
				{
					if(Child[j]==CurrentChild)
					{
						count++;
					}
				}
				
				if(count>1)
				{
					Binary=false;
				}
			}
			
			//Check Parent having maximum 2 childrens
			for (int i=0; i<n2; i++)
			{
				int CurrentParent=Parent[i];
				int count=0;
				
				for(int j=0; j<n2; j++)
				{
					if(Parent[j]==CurrentParent)
					{
						count++;
					}
				}
				
				if(count>1)
				{
					Binary=false;
				}
			}
			
			//Check for Root Count 
			int RootCount=0;
			for ( int i=0; i>n2; i++)
			{
				int ParentRoot=Parent[i];
				boolean foundAsChild = false;

				for (int j = 0; j < n2; j++) 
				{
					if (Child[j] == ParentRoot) 
					{
						foundAsChild = true;
						break;
					}
				}

            if (!foundAsChild) 
            {
                RootCount++;
            }
            if (RootCount != 1) 
            {
                return;
            }

            return; // Valid Binary Tree
        }

		
		System.out.println("======================================\nSolution for the Example 3 : \n======================================");
//		3. Pattern decode ->  String input - a2u9i  -->   output - e4a81o
		
		System.out.println("======================================\nSolution for the Example 4 : \n======================================");
//		4. Pattern decode-2 ->  String input="aabbcddab"; --> output a3b3c1d2
		
		System.out.println("======================================\nSolution for the Example 5 : \n======================================");
//		5. Maximum Duplicated Letters Checker in a sentence
//		input - "Hello world this is java"
//		output - "Hello"
//		input - "Amazing zoologist"
//		output - "zoologist"
		
		
	}
}
