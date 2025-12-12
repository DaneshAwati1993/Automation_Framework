package CollectionsInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet hs=new HashSet();
		//Set mySet=new HashSet();
		//HashSet<Integer> hs=new HashSet<Integer>();
		
		//Adding elements into hashSet
		
		hs.add(100);
		hs.add(123.44);
		hs.add(null);
		hs.add(null);
		hs.add("Danesh");
		hs.add(true);
		hs.add(231.99);
		System.out.println(hs);
		
		//Remove element from HasSet
		hs.remove(100);
		System.out.println(hs);
		
		//Insert the element inbetween
		//not possible to insert because there is no index functionality
		//Retriive the element using specific index
		//not possible to insert because there is no index functionality
		
		//Convert the HashSet into ArrayList
		ArrayList list=new ArrayList(hs);
		System.out.println(list.get(3));
		
		//Retrieve all elemnts from the HashSet
		//Normal for loop is not possible as Index is not available
		System.out.println("\n");
		//Enhanced for loop
		for (Object x:hs)
		{
			System.out.print(x+",");
		}
		
		System.out.println("\n");
		//Using Iterator
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		
		//remove all the elemnts from HashSet
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
	
	}

}
