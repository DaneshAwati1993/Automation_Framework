package MethodOverRiding;

class ParentClass
{
	void display()
	{
		System.out.println("Parent Display method");
	}
}

class ChildClass extends ParentClass
{
	@Override
	void display()
	{
		System.out.println("Child Display method");
	}
}

public class OverrideAnnotation {

	public static void main(String[] args) {

		ChildClass cc=new ChildClass();
		cc.display();
	}

}
