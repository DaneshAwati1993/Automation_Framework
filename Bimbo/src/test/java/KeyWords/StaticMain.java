package KeyWords;

public class StaticMain {

	public static void main(String[] args) {

		System.out.println(Static.city);
		Static.Display1();
		
		Static st=new Static();		//Non-static variablr nd method object creation is mandatory
		System.out.println(st.rollNum);
		st.grade='A';
		System.out.println(st.grade);
		st.Display2();
		System.out.println(st.city);
		st.Display1();

	}

}
