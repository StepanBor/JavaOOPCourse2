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
		for(int i=0; i<network.length; i++) {
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
	
	public int getNetSize() {
		return netSize;
	}
	
	public void setNetSize(int netSize) {
		this.netSize = netSize;
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
		phone.setNet(this);
		count++;
	}
	
	public String call(int num, Phone caller) {
		
		for (int i = 0; i < network.length; i++) {
			if(network[i].getNumber()==num) {
				//System.out.println(caller+" is calling to "+network[i]);
				network[i].incomeCall(caller);
				return caller+" is calling to "+network[i];
			}
		}
		//System.out.println();
		//System.out.println("abonent doesn't exist");
		return "abonent doesn't exist";
	}
	
	public void getAbonentsInf() {
		System.out.println();
		for (int i = 0; i < network.length; i++) {
			System.out.println(network[i]);
		}
	}
	

}
