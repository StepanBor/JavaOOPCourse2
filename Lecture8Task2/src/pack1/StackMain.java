package pack1;

import java.util.Comparator;

public class StackMain {

	public static void main(String[] args) {

		Stack s = new Stack(10);

		Integer in = 58;

		s.putObject(in);

		String st = "Hello";

		s.putObject(st);

		Cat cat = new Cat();
		Human human = new Human();

		Double r = 5.8;
		Vector3d v = new Vector3d();

		s.blackList.addToBlackList(r);
		s.blackList.addToBlackList(v);

		s.putObject(cat);
		s.putObject(human);

		s.putObject(r);
		s.putObject(v);
	

		Human b = s.getObject();

		System.out.println(b);

		System.out.println(s);

		System.out.println(s.blackList.toString());

	}

}
