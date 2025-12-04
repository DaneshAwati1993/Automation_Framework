package ConstrictorOverLaoding;

public class EncapsulationMain {

	public static void main(String[] args) {

		Encapsulation Acc=new Encapsulation();
		
		Acc.setAccNum(123456789);
		Acc.setName("Danesh");
		Acc.setBalance(1234569.50);
		
		double balance=Acc.getBalance();
		int Accnumber=Acc.getAccNum();
		String name=Acc.getName();
		System.out.println(Accnumber);
		System.out.println(name);
		System.out.println(balance);

		
		
	}

}
