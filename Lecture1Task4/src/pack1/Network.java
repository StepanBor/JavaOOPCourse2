package pack1;

public class Network {

	private String name;
	private int netSize;
	private int count;
	private Phone[] network;
	
	public Network(String name, int netSize) {
		super();
		this.name = name;
		this.netSize=netSize;
		count=0;
		network=new Phone[netSize];
		for (int i = 0; i < network.length; i++) {
			network[i]=new Phone();
		}
	}
	
	
	public Network() {
		super();
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBaseSize() {
		return netSize;
	}
	
	public void setBaseSize(int baseSize) {
		this.netSize = baseSize;
	}
	
	public Phone[] getNetwork() {
		return network;
	}
	
	public void setNetwork(Phone[] base) {
		this.network = base;
	}
	
	
	
	
	public void regPhone(Phone phone) {
		network[count]=phone;
		phone.setNetworkName(name);
		count++;
		
	}
	
	public String call(int num) {
		
		for (int i = 0; i < network.length; i++) {
			if(network[i].getNumber()==num) {
				
				return "beep-beep "+network[i].toString();
			}
		}
		
		return "abonent doesn't exist";
	}
	
	public void getAbonentsInf() {
		System.out.println();
		for (int i = 0; i < network.length; i++) {
			System.out.println(network[i]);
		}
	}
	

}
