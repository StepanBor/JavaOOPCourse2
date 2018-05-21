package pack1;

import java.util.Arrays;

public class Classwork2 {
	
	public static void main(String[] args) {
//		System.out.println(area(1));
//		
//		System.out.println(area(-1));
//		
//		
//	}
//	
//	public static double area(double radius) {
//		
//		if (radius<0) {
//			throw new IllegalArgumentException("Negative arg");
//		}
//		return Math.PI*radius*radius;
		
		Baby baby=new Baby("Kiril","Ts",4);
		Cat22 cat1=new Cat22(5, 8, "Vaska", "mongrel", "mail", "rats");
		Cat22 cat2=new Cat22(8, 8, "Murca", "mongrel", "mail", "rats");
		Cat22 cat3=new Cat22(4, 8, "Churca", "mongrel", "mail", "rats");
		
		Cat22[] catArray=new Cat22[] {cat1,cat2,cat3};
		
		Arrays.sort(catArray);
		
		baby.playWith(cat1);
		
		System.out.println(baby.playWith(cat1));
		
		for (int i = 0; i < catArray.length; i++) {
			System.out.println(catArray[i]);
		}
		
	}
	
}
