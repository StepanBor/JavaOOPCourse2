package pack1;

public class Student extends Human {

	private String groupeName;
	private int course;
	private double averegeBall;
	
	
	
	public Student(int age, String sex, String birthDay, String citizenship, String groupe, int course,
			double averegeBall) {
		super(age, sex, birthDay, citizenship);
		this.groupeName = groupe;
		this.course = course;
		this.averegeBall = averegeBall;
	}
	
	
	
	public Student() {
		super();
		
	}



	
	public String getGroupe() {
		return groupeName;
	}
	public void setGroupeName(String groupe) {
		this.groupeName = groupe;
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
		return "Student [groupeName=" + groupeName + ", course=" + course + ", averegeBall=" + averegeBall
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
