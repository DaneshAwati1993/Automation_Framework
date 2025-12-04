package Inheritance;

public class Anand1 extends Danesh1
{
	
	int e=150;
	void print()
	{
		System.out.println(e);
	}

	public static void main(String[] args) {

		Danesh1 D1=new Danesh1();
		Anand1 A1=new Anand1();
		
		D1.sum();
		A1.sum();
		A1.print();
	}

}
