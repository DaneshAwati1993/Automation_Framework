package Java_Basics;

public class CallByValuevsCallByRef {

	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValuevsCallByRef obj=new CallByValuevsCallByRef();
		int x=10;
		int y=20;
		obj.sum(x, y);
		
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);

		
	}
	
	public int sum(int a, int b)
	{
	int c=a+b;
	return c;
	}
	
	public void swap(CallByValuevsCallByRef t)
	{
		int temp;
		temp =t.p;
		t.p=t.q;
		t.q=temp;
	}

}
