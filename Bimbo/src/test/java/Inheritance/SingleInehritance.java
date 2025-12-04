package Inheritance;


class Danesh
{
	int a=10;
	void display()
	{
		System.out.println(a);
	}
}

class Anand extends Danesh
{
	int b=20;
	void print()
	{
		System.out.println(b);
	}
}

public class SingleInehritance {
	
	
	
	public static void main(String[] args)
	{
		
		Danesh D=new Danesh();
		
		D.display();
		
		Anand A=new Anand();
		
		A.print();
		A.display();
		
		
		
	}

}
