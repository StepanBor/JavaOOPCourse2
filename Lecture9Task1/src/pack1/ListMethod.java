package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		

		List<Integer> list = new ArrayList<Integer>();

		
		for (int i = 0; i < 10; i++) {

			list.add(i);
			
			System.out.println(list.get(i));

		}

		System.out.println(list.size());
		
		int[] tempIndex = { 0, 1, 9 };

		for (int i : tempIndex) {
			list.remove(i);
		}

//		Iterator<Integer> it = list.iterator();
//
//		for (int i = 0; i < list.size(); i++) {
//
//			System.out.println(list.get(i));
//
//		}

	}

	
}
