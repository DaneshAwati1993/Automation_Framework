package MethodOverRiding;

class Bank
{//Parent
	double interest()
	{
		return 5.5;
	}
}

class BOFA extends Bank
{//child1
	double interest()
	{
		return 7.5;
	}
}

class JPM extends Bank
{//child2
	double interest()
	{
		return 9.5;
	}
}

public class MethodOverRidingExample {
	
	
	public static void main(String[] args) {


		BOFA bo=new BOFA();
		double b01=bo.interest();
		System.out.println(b01);
		
		JPM jp=new JPM();
		double jp1=jp.interest();
		System.out.println(jp1);
	}

}
