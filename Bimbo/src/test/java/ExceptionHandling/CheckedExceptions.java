package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {

		System.out.println("Start of the Programm");
		System.out.println("Statement 1");
		
		Thread.sleep(5000);
		//FileInputStream file=new FileInputStream("D:\\Test,txt");
		System.out.println("Statement 2");
		
		System.out.println("End of the Programm");

	}

}
