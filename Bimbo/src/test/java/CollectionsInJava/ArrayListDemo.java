package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		//Declaration or Creating an Object
		ArrayList arrlist=new ArrayList();
		
		List list=new ArrayList();
		
		ArrayList<Integer> intarr=new ArrayList<>();
		
		//Adding data into ArrayList : 
		arrlist.add(100);
		arrlist.add("Danesh");
		arrlist.add(123.45);
		arrlist.add(true);
		arrlist.add(null);
		arrlist.add(null);
		arrlist.add(true);

		//Size of array : 
		int size=arrlist.size();
		System.out.println(size);
		
		//Print all values from arrlist
		System.out.println(arrlist);
		
		//Remove element from arraylist
		arrlist.remove(5);
		System.out.println(arrlist);
		
		//Insert element at specific index into arraylist
		arrlist.add(3,"AnandAwati");
		System.out.println(arrlist);
		
		//Modify element at specific index into arraylist
		arrlist.set(5,false);
		System.out.println(arrlist);
		
		//Retrieve value at specific index into arraylist
		System.out.println(arrlist.get(3));
		
		//Retrieve all elements from the arraylist with index
		//1-for loop
		for(int i=0;i<arrlist.size()-1;i++)
		{
			System.out.print(arrlist.get(i)+ " , ");
		}
		System.out.println("\n");
		
		//2- for each loop
		for (Object x:arrlist)
		{
			System.out.print(x+",");
		}
		
		//3- Using iterator - Java collection
		System.out.println("\n");

		Iterator it=arrlist.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
		
		//checking Arraylist is empty or not
		
		System.out.println(arrlist.isEmpty());
		
		//Remove some element from arrlist
		ArrayList list2=new ArrayList();
		list2.add(100);
		list2.add("Danesh");
		list2.add(false);
		
		arrlist.removeAll(list2);
		System.out.println(arrlist);
		
		//remove all the elemnts from list
		arrlist.clear();
		System.out.println(arrlist);
		System.out.println(arrlist.isEmpty());
	}

}
