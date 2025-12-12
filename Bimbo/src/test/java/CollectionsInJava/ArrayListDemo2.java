package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

import Core_Java.OOPS_Concepts.Student;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();
		
		ArrayList<Student> list2=new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println("\n");
		//Using Iterator
		Iterator<Integer> it=list.iterator();
		//System.out.print(it.next());
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
		
	}

}
