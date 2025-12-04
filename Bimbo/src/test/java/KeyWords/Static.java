package KeyWords;

public class Static {
	
	//Variables
	int rollNum;
	char grade;
	static String city="Bijapur";
	
	//method
	static void Display1()
	{
		System.out.println("Static Display-1 Method");
	}

	void Display2()
	{
		System.out.println("Non-Static Method");
	}
	
	public static void main(String[] args) {

		/*
		System.out.println(city);
		Display1();
		
		Static st=new Static();
		System.out.println(st.rollNum);
		st.grade='A';
		System.out.println(st.grade);
		st.Display2();
		System.out.println(st.city);
		st.Display1();

		*/
		
	}

}
