package pack1;

public class CatProbe {

	public static void main(String[] args) {
		Cat[] cats = new Cat[3];

		cats[0] = new Cat(1, 3, "Murzik", "mongrel", "mail", "rats");
		cats[1] = new Cat(1, 8, "Lord", "Maincoone", "mail", "RoyalCanine");
		cats[2] = new Cat(2, 2, "Murca", "Abesine", "femail", "Wiskas");

		for (int i = 0; i < cats.length; i++) {
			
			System.out.println(cats[i].getName());
			cats[i].voice();
			System.out.println(cats[i]);
			System.out.println();

		}

	}

}
