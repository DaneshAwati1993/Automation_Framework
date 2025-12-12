package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileObject {

	public static void main(String[] args) throws IOException {
		
		//Create and Write data in file
//		FileWriter Writer=new FileWriter("Test.txt1");
//		Writer.write("Hi Danesh Welcome to Java\nMaster\nline1\nline2");
//		Writer.close();
		
		//Read file 
//		File myFile=new File("Test.txt1");
//		Scanner sc=new Scanner(myFile);
//		while(sc.hasNextLine())
//		{
//			String line=sc.nextLine();
//			System.out.println(line);
//		}
		
		//Delete the file 
		File file=new File("Test.txt");
		if(file.delete())
		{
			System.out.println("File Is deleted.........");
		}
		else
			System.out.println("File not found");
		
	}

}
