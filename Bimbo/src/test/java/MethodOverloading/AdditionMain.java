package MethodOverloading;

public class AdditionMain {

	public static void main(String[] args) {

		Addition Add=new Addition();
		
		Add.sum();
		Add.sum(10, 25);
		Add.sum(100, 250.75);
		Add.sum(154.89, 123);
		Add.sum(10, 20, 30);
				
	}

}
