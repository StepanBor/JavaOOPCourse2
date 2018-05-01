package pack1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student extends Human {
	
	 private SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");

	private String groupName;
	private int course;
	private double averegeBall;
			
	

	public Student(String sex, String name, String lastname, String birthDay, String citizenship, double averegeBall) throws ParseException {
		super(sex, name, lastname, birthDay, citizenship);
		groupName="nogroup";
		course=0;
		this.averegeBall=averegeBall;
	}

	public Student(String[] stud) throws ParseException, NumberFormatException {
		super(stud[0], stud[1], stud[2], stud[3], stud[4]);
		groupName="noGroup";
		course=0;
		averegeBall=Double.parseDouble(stud[5]);
		
		
	}
	
	public Student() {
		super();
		groupName="noGroup";
		course=0;
		
	}
	
	public String getgroup() {
		return groupName;
	}
	public void setgroupName(String group) {
		this.groupName = group;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public double getAveregeBall() {
		return averegeBall;
	}
	public void setAveregeBall(double averegeBall) {
		this.averegeBall = averegeBall;
	}



	@Override
	public String toString() {
		return "Student [name=" + getName() + ", lastname=" + getLastname()+ " groupName=" + groupName + ", course=" + course + ", averegeBall=" + averegeBall + " age=" + getAge() +", birthDay="+ sdf.format(getBirthDay()) + ", citizenship=" + getCitizenship() + "]\n";
	}
	
	public String toStringShort() {
		return getName() + ", " + getLastname()+ ", " + groupName + ", " + course + ", " + averegeBall + ", " + getAge() +", "+ sdf.format(getBirthDay()) + ", " + getCitizenship() + System.lineSeparator();
	}
	
	public boolean myEquals(Object o) {
		
		Student st=(Student) o;
		
		if(this.getName().equals(st.getName()) && this.getLastname().equals(st.getLastname())) {
			return true;
		}
		
		return false;
		
	}
	
}
