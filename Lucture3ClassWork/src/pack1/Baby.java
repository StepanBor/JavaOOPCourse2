package pack1;

public class Baby {
	
	private String name;
	private String lastname;
	private int age;
	
	
	public Baby(String name, String lastname, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	public Baby() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String playWith(Play someThing) {
		
		String result="Want to play "+ someThing+System.lineSeparator();
		if (someThing.canPlay()) {
			result +=":(" + someThing.play();
		} else {
			result +=":(";
		}
		return result;
	}
	
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Baby [name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
	

}
