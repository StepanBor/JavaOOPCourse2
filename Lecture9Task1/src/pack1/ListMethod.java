package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {

			list.add(i);

		}

		int[] tempIndex = { 0, 0, list.size() - 1 };

		for (int i : tempIndex) {
			list.remove(i);
			tempIndex[2] = list.size()-1;
		}

		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
