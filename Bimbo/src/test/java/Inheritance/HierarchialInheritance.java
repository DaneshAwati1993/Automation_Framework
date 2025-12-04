package Inheritance;

class Ravatappa2
{
	String s1="Owns a Villa";
	void print1()
	{
		System.out.println(s1);
	}
}

class Danesh3 extends Ravatappa2
{
	String s2="Owns a farma";
	void print2()
	{
		System.out.println(s2);
	}
}

class Navin extends Ravatappa2
{
	String s3="Owns a Home";
	void print3()
	{
		System.out.println(s3);
	}
}

class Pavan extends Ravatappa2
{
	String s4="Owns a Bussiness";
	void print4()
	{
		System.out.println(s4);
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {

		System.out.println("Father  : \n---------------------------------");
		Ravatappa2 R2=new Ravatappa2();
		R2.print1();
		
		System.out.println("\nSon 1 : \n---------------------------------");
		Danesh3 D3=new Danesh3();
		D3.print1();
		D3.print2();
		
		System.out.println("\nSon 2  : \n---------------------------------");
		Navin N=new Navin();
		N.print1();
		N.print3();
		
		System.out.println("\nSon 3  : \n---------------------------------");
		Pavan P=new Pavan();
		P.print1();
		P.print4();	
		
	}

}
