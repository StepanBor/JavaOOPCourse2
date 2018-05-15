package pack1;

import java.util.*;


public class CountRepeatedElemMain {

	public static void main(String[] args) {
		
		Integer[] arr1= {8,5,8,5,8,7,6,2};
		Character[] arr2= {'g','r','k','k','g','r','t','y'};
		
		Map<Integer, Integer> map1=getMap(arr1);
		
		Map<Character, Integer> map2=getMap(arr2);
		
		System.out.println(map1);
		System.out.println(map2);
		

	}
	
	public static <K> TreeMap<K, Integer> getMap(K[] arr) {

		TreeMap<K, Integer> mapArr = new TreeMap<>();
		Integer temp = 1;
		for (int i = 0; i < arr.length; i++) {
			if (mapArr.containsKey(arr[i])) {

				mapArr.put(arr[i], mapArr.get(arr[i]) + 1);

			} else {
				mapArr.put(arr[i], temp);
			}
		}

		return mapArr;

	}

}
