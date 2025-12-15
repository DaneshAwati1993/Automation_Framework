package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHavingSOmeNumberSortinDescendingOrder {

	public static void main(String[] args) {

		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		
		arrlist.add(20);
		arrlist.add(5);
		arrlist.add(50);
		arrlist.add(25);
		arrlist.add(60);
		
		System.out.println("Input ArrayList : "+arrlist);
		Collections.sort(arrlist);
		System.out.println("Sorted ArrayList(asc) : "+arrlist);
		Collections.sort(arrlist,Collections.reverseOrder());
		System.out.println("Sorted ArrayList(Desc) : "+arrlist);
	}

}
