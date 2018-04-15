package pack1;

public class Phone {

	private int number;
	private String vendor;
	private String model;
	private String networkName;
	
	public Phone(int number, String vendor, String model) {
		super();
		this.number = number;
		this.vendor = vendor;
		this.model = model;
		networkName="noNetwork";
	}

	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	public void registerInNetwork(Network net) {
		net.regPhone(this);
		
	}
	
	public String call(Network net, int num) {
		System.out.println(net.call(num));
		return net.call(num);
	}

	@Override
	public String toString() {
		return "Phone [number=" + number + ", vendor=" + vendor + ", model=" + model + ", networkName=" + networkName
				+ "]";
	}
	
	
		
	
}
