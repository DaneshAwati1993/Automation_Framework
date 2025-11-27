package Core_Java;

import java.util.Arrays;

public class StringsInJava {

	public static void main(String[] args) {


		//Approach 1:
		
		String a1="Danesh";
		System.out.println(a1);
		
		//Approach 2:
		
		String a2=new String("Awati");
		System.out.println(a2);
		
		String a3 ="Bijapur";
		
		int len=a1.length();
		System.out.println(len);
		System.out.println(a2.length());
		System.out.println("Danesh1".length());
		
		//Concatination fo Strings : 
		
		System.out.println("Concat of Strings : "+a1+" " +a2);
		System.out.println(a1.concat(" "+a2));
		System.out.println(a1.concat(" "+a2).concat(" "+a3));
		
		//Trim() :
		
		String a4="  Testing  ";
		System.out.println("Before Trim : "+a4);
		System.out.println(a4.length());
		System.out.println(a4.trim());
		System.out.println(a4.trim().length());
		
		//CharAt() :It will return single character as per the position of character
		
		String a5="JavaProgramming";
		System.out.println(a5.charAt(0));
		
		//Contains () : it will Return Boolean value.
		
		String a6="Danesh";
		String a7="nesh";
		System.out.println(a6.contains(a7));
		
		//Equals () : it will Return Boolean value.
		
		String a8="DANESH";
		String a9="danesh";
		System.out.println(a8.contains(a9));
		
		//Equalsignore () : it will Return Boolean value.
		
		String a10="DANESH";
		String a11="danesh";
		System.out.println(a10.equalsIgnoreCase(a11));
		
		//contentEquals () : it will Return Boolean value.
		
		String a12="DANESH";
		String a13="Danesh";
		System.out.println(a12.contentEquals(a13));
		
		//replace() : 
		String a14="JavaProgrammingPractise";
		System.out.println(a14.replace('a', 'Z'));
		
		String a15="Selenium Java Selenium Python Selenium ";
		System.out.println(a15.replace("Selenium", "Testing"));
		
		//Substring() : 
		//Retrieve part of the  Main STring
		
		String a16="Danesh";
		System.out.println(a16.substring(3)); //Retrieve data from the position to end of teh String
		
		System.out.println(a16.substring(0, 4));	//Retrieve data from the position to the position mentioned.	
		
		
		//Retrieve part of the  Main STring
		
		System.out.println(a16.toUpperCase()); 
				
		System.out.println(a16.toLowerCase());	
		
		
		//Split Method :
		
		String a17="Danesh Awati Academy";
		
		String a18[]=a17.split(" ");
		System.out.println(Arrays.toString(a18));
		System.out.println(a18[0]);
		System.out.println(a18[1]);
		
		String a19="daneshawati@123.com";
		String a20[]=a19.split("@");
		System.out.println(Arrays.toString(a20));
		
		String a21="$1,23,456";
		String a22[]=a21.split(",");
		System.out.println(Arrays.toString(a22));
		System.out.println((a22[2]));
		
		
		String a23="$1,23,456";
		System.out.println(a23.replace(",", ""));
		System.out.println(a23.replace(",", "").replace("$", ""));
		
		//Reversing the String : 
		
		String a24="Danesh";
		String rev1="";		//Empty String.
		
		for(int i=a24.length()-1; i>=0; i--)
		{
			rev1=rev1+a24.charAt(i);
		}
		System.out.println(rev1);
		
		
		String a25="Java"+(10+20+30+40);
		System.out.println(a25);
		String a26=10+20+"Java"+30+40;
		System.out.println(a26);
		String a27=10+"20"+30+40+"50"+60+70;
		System.out.println(a27);
		String a28=10+20+"Java"+30+40+50+"Good"+60+70+80;
		System.out.println(a28);
		String a29="Java"+20+30+"Good";
		System.out.println(a29);
		

	
	}

}
