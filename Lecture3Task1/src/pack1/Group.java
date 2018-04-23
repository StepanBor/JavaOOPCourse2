package pack1;

import java.util.Arrays;

public class Group {

	private String groupName;
	private int course;
	private int groupSize;
	private int count;
	private Student[] studentList;

	public Group(String groupName, int course, int groupSize) {
		super();
		this.groupName = groupName;
		this.course = course;
		this.groupSize = groupSize;
		count = 0;
		studentList = new Student[groupSize];
		for (int i = 0; i < studentList.length; i++) {
			studentList[i] = new Student();
		}
	}

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getgroupName() {
		return groupName;
	}

	public void setgroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getgroupSize() {
		return groupSize;
	}

	public void setgroupSize(int groupSize) {
		this.groupSize = groupSize;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void enrollStudent(Student student) /*throws GroupOverflowException*/  {

		try {
			if (count < groupSize) {
				studentList[count] = student;
				count++;
				student.setgroupName(groupName);
				student.setCourse(course);
			} else {
				throw new GroupOverflowException();
			}
	} catch (GroupOverflowException e) {
		System.out.println(e.getMessage());
	}
	}

	public void swapStudent(int i, int j) {
		Student temp = studentList[i];
		studentList[i] = studentList[j];
		studentList[j] = temp;
	}

	public void excludeStudent(int index) {
		if (index <= count) {
			for (int i = 0; i < studentList.length - 1; i++) {
				if (index == i) {
					swapStudent(i, i + 1);
					index++;
				}
			}
			studentList[index].setgroupName("nogroup");
			studentList[index].setCourse(0);
			studentList[index] = new Student();
			count--;
		}
	}

	public void excludeStudent(Student student) {

		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i].equals(student)) {
				int index = i;
				excludeStudent(index);
			}
		}

	}

	public void sortByLastname() {

		for (int i = 0; i < studentList.length; i++) {

			for (int j = 0; j < studentList.length - 1; j++) {
				if (studentList[j].getLastname().compareToIgnoreCase(studentList[j + 1].getLastname()) >= 0) {
					swapStudent(j, j + 1);
				}
			}

		}
	}

	public void sortByAveregeBall() {
		for (int i = 0; i < studentList.length; i++) {

			for (int j = 0; j < studentList.length - 1; j++) {
				if (studentList[j].getAveregeBall() <= studentList[j+1].getAveregeBall()) {
					swapStudent(j, j + 1);
				}
			}

		}
	}

	@Override
	public String toString() {
		return "group [groupName=" + groupName + ", course=" + course + ", studentList=\n"
				+ Arrays.toString(studentList) + "]";
	}

	public String searchStudent(String lastname) {
		for (int i = 0; i < studentList.length; i++) {
			if(studentList[i].getLastname().equalsIgnoreCase(lastname)) {
				return studentList[i].toString();
			}
		}
		return "there is no student with "+lastname+" lastname";
	}
	
}
