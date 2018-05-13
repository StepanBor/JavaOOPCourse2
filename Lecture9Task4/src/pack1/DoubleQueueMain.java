package pack1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class DoubleQueueMain {

	public static void main(String[] args) {

		Queue<String> doubleQueue=new ArrayDeque<>();
		doubleQueue.add("Sheldon");
		doubleQueue.add("Leonard");
		doubleQueue.add("Volovitc");
		doubleQueue.add("Kutrapalli");
		doubleQueue.add("Penny");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many double cola glasses did they drink?");
		int colaGlass=sc.nextInt();
		
		for(int i=0;i<colaGlass;i++) {
			String temp=doubleQueue.poll();
			doubleQueue.add(temp);
			doubleQueue.add(temp);
		}
		System.out.println(doubleQueue);
		
	}

}
