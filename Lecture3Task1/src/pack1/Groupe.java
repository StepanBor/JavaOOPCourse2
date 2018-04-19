package pack1;

public class Groupe {

	private String groupeName;
	private int course;
	private int groupeSize;
	private int count;
	private Student[] studentList;

	public Groupe(String groupeName, int course, int groupeSize) {
		super();
		this.groupeName = groupeName;
		this.course = course;
		this.groupeSize = groupeSize;
		count = 0;
		studentList = new Student[groupeSize];
		for (int i = 0; i < studentList.length; i++) {
			studentList[i] = new Student();
		}
	}

	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGroupeName() {
		return groupeName;
	}

	public void setGroupeName(String groupeName) {
		this.groupeName = groupeName;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getGroupeSize() {
		return groupeSize;
	}

	public void setGroupeSize(int groupeSize) {
		this.groupeSize = groupeSize;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void regStudent(Student student) {
		
		try {
			if (count < groupeSize) {
				studentList[count] = student;
				count++;
				student.setGroupeName(this.groupeName);
			} else {
				throw new GroupeOverflowException();
			}
		} catch (GroupeOverflowException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void excludeStudent(int index) {
		if(index<=count) {
			studentList[index]=new Student();
		}
	}

}
