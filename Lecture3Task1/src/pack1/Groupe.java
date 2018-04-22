package pack1;

import java.util.Arrays;

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

	public void enrollStudent(Student student) {

		try {
			if (count < groupeSize) {
				studentList[count] = student;
				count++;
				student.setGroupeName(groupeName);
				student.setCourse(course);
			} else {
				throw new GroupeOverflowException();
			}
		} catch (GroupeOverflowException e) {
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
			studentList[index].setGroupeName("noGroupe");
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
		return "Groupe [groupeName=" + groupeName + ", course=" + course + ", studentList=\n"
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
