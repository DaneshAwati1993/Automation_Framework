package KeyWords;

public class TestClass {
	
	void Display1()
	{
		System.out.println("Display 1 Method...");
	}
	
	void Display2()
	{
		//Display1();			//Implicitely calling this keyword
		this.Display1();
		System.out.println("Display 2 Method...");
	}

	public static void main(String[] args) {

		TestClass tc=new TestClass();
		tc.Display2();
	}

}
