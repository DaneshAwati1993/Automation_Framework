package CollectionsInJava;

import java.util.HashMap;

//count only valid spaces
public class CountOccursinStringUsingHashMap {
	
	public static void getOccurances(String str)
	{
		HashMap<Character,Integer> map=new HashMap();
		char chArray[]=str.toCharArray();
		
		for (char c:chArray)
		{
			if(String.valueOf(c).isBlank()) {
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			}
		}
		System.out.println(str+" : "+map);
	}

	public static void main(String[] args) {
		
		getOccurances("aaa  bbcc   cccddd");
		getOccurances("  TestedtTest");
		getOccurances("Vijayapur  ");
		getOccurances("Karanataka");
	}

}
