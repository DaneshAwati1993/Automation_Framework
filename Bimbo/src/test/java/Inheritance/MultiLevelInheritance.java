package Inheritance;

class Ravatappa
{
	String s1="Owns a Villa";
	void print1()
	{
		System.out.println(s1);
	}
}

class Danesh2 extends Ravatappa
{
	String s2="Owns a farma";
	void print2()
	{
		System.out.println(s2);
	}
}

class Anand2 extends Danesh2
{
	String s3="Owns a Home";
	void print3()
	{
		System.out.println(s3);
	}
}


public class MultiLevelInheritance {

	public static void main(String[] args) {

		System.out.println("Grand Father  : \n---------------------------------");
		Ravatappa R=new Ravatappa();
		R.print1();
		
		System.out.println("\nSon : \n---------------------------------");
		Danesh2 D2=new Danesh2();
		D2.print1();
		D2.print2();
		
		System.out.println("\nGrand Son  : \n---------------------------------");
		Anand2 A2=new Anand2();
		A2.print1();
		A2.print2();
		A2.print3();
	}

}
