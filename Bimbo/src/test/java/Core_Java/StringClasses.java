package Core_Java;

public class StringClasses {

	public static void main(String[] args) {

		String a1="Welcome"; 	//emocleW
		
		//Approach 1 :
		String rev1="";
		for(int i=a1.length()-1; i>=0; i--)
		{
			rev1=rev1+a1.charAt(i);
		}
		System.out.println(rev1);
		
		//Approach 2 :
		String rev2="";
		
		char a2[]=a1.toCharArray();
		for(int i=a2.length-1; i>=0;i--)
		{
			rev2=rev2+a2[i];
		}
		System.out.println(rev2);
		
		//Approach 3 :
		StringBuffer a3=new StringBuffer("Danesh");
		//StringBuilder a4=new StringBuilder("Welcome");
		
		a3.reverse();
		System.out.println(a3);
		
		//Approach 3 :
		StringBuilder a4=new StringBuilder("Danesh Awati");		
		a4.reverse();
		System.out.println(a4);

	}

}
