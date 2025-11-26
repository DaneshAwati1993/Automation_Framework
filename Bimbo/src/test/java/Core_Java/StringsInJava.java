package Core_Java;

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
	}

}
