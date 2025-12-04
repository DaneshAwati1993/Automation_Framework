package KeyWords;

public class ThisKeyword {
	
	//Variables 
	
	int x,y; 	//Instance variable mapped to object
	
	/*
	ThisKeyword (int x, int y)		//a & b are local variables.  //Parameterized Constructors
	{
		this.x=x;
		this.y=y;
	}
	
	*/
	void setData(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	//Method
	void Display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		
		ThisKeyword th=new ThisKeyword();
		th.setData(1000, 555);
		th.Display();
		
		
	}

}
