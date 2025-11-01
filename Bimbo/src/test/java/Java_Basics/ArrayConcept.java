package Java_Basics;

public class ArrayConcept {

	public static void main(String[] args) {

		//Array : to store similar data type values;
		
		//one Dimensional Array
		
		//1. int Array 
		
		int a[] = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		System.out.println(a[1]);
		System.out.println(a[3]);
		System.out.println(a.length);
		
		System.out.println("**************");

		//Print all the Values
		
		for (int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		//2. Double Array
		
		double d[]=new double[3];
		
		d[0]=12.33;
		d[1]=14.76;
		d[2]=45.55;
		
		System.out.println(d[1]);
			
		//3. char Array
		
		char c[]=new char[3];
		c[0]='a';
		c[1]='3';
		c[2]='$';
		
		
		//4. Boolean Array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5. String Array 
		
		String s[]=new String[3];
		s[0]="test";
		s[1]="India";
		s[2]="Hello";
		
		System.out.println(s.length);
		
		System.out.println(s[1]);

		//Object Array 
		Object obj[]=new Object[6];
		obj[0]="Tom";
		obj[1]=10;
		obj[2]=12.30;
		obj[3]=true;
		obj[4]='A';
		obj[5]="London";
		
		System.out.println(obj.length);
		System.out.println(obj[5]);
				
	}

}
