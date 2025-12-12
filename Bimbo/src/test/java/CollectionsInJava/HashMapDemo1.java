package CollectionsInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo1 {

	public static void main(String[] args) {

	//Declaration
//	HashMap hm=new HashMap();
//	Map m=new HashMap();
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	//Adding values
	
	hm.put(101, "Danesh");
	hm.put(102, "Anand");
	hm.put(103, "Aishu");
	hm.put(104, "Danesh");
	
	System.out.println(hm);
	hm.put(101, "DaneshAwati");
	System.out.println(hm);
	
	//Size of the HashMap
	System.out.println(hm.size());
	
	//remove 1 pair 
	hm.remove(104);
	System.out.println(hm);
	
	//retrieve the value of given Key
	System.out.println(hm.get(101));
	
	//Retrieve all the key and values
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	System.out.println(hm.entrySet());
	
	//Retrieve data from hashMap 
	//Using for loop
	
	for (Integer k:hm.keySet())
	{
		System.out.println(k+"  "+hm.get(k));
	}
	
	//Using iterator
	System.out.println("\n");
	Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
	while(it.hasNext())
	{
		Entry<Integer,String>entry=it.next();
		System.out.println(entry.getKey()+"  "+entry.getValue());
		//System.out.println(it.next());
	}
	
	}

}
