package pack1;

public class CellPhoneNet {

	public static void main(String[] args) {
		Phone[] phones=new Phone[4];
		phones[0]=new Phone(111, "Nokia", "N3310");
		phones[1]=new Phone(222, "Meizu", "MX5");
		phones[2]=new Phone(333, "Sony", "Z3");
		phones[3]=new Phone(444, "Samsung", "s8");
		
		Network net=new Network("Life", 5);
		
		for (int i = 0; i < phones.length; i++) {
			phones[i].registerInNetwork(net);
		}
		
		
		net.getAbonentsInf();	
		System.out.println();
		
		phones[1].call(444);
		System.out.println();
		phones[1].call(888);

	}

}
