package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Group implements IVoencom {

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

	public Student[] getStudentList() {
		return studentList;
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

	public void enrollStudent(Student student) /* throws GroupOverflowException */ {

		try {
			if (count < groupSize) {
				studentList[count] = student;
				student.setgroupName(groupName);
				student.setCourse(course);
				count++;
			} else {
				throw new GroupOverflowException();
			}
		} catch (GroupOverflowException e) {
			System.out.println(e.getMessage());
			return;
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

			studentList[index] = new Student();
			count--;
		} else {
			System.out.println("Student not found.");
		}

	}

	public void excludeStudent(Student student) {

		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i].myEquals(student)) {
				int index = i;
				excludeStudent(index);
			}
		}
		System.out.println("There is no this student in group");

	}

	
	
	public void sortByAge() {
		Arrays.sort(studentList,
				(s1, s2) -> CheckNull.checkNull(s1, s2) != CheckNull.CONST ? CheckNull.checkNull(s1, s2)
						: (s1.getAge() - s2.getAge()));
	}

	public void sortByLastname() {
		Arrays.sort(studentList,
				(s1, s2) -> CheckNull.checkNull(s1, s2) != CheckNull.CONST ? CheckNull.checkNull(s1, s2)
						: s1.getLastname().compareToIgnoreCase(s2.getLastname()));
	}

	public void sortByAveregeBall() {
		Arrays.sort(studentList,
				(s1, s2) -> CheckNull.checkNull(s1, s2) != CheckNull.CONST ? CheckNull.checkNull(s1, s2)
						: (int) (s1.getAveregeBall() * 10 - s2.getAveregeBall() * 10));
	}

	public void sortByParametr(int param) {
		if (param == 1) {
			System.out.println("Sort by age");
			sortByAge();
		}
		if (param == 2) {
			System.out.println("Sort by lastname");
			sortByLastname();
		}
		if (param == 3) {
			System.out.println("Sort by average ball");
			sortByAveregeBall();
		}
	}

	public String searchStudent(String lastname) {
		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i].getLastname().equalsIgnoreCase(lastname)) {
				return studentList[i].toString();
			}
		}
		return "there is no student with " + lastname + " lastname";

	}
	
	public void createTxtFile(String fileName) {

		File tempDirec = new File("tempDirectory");

		tempDirec.mkdir();

		File textFile = new File("tempDirectory\\" + fileName);
		try (PrintWriter pw = new PrintWriter(textFile)) {
			pw.print("Name,Lastname,groupe,course,averegeBall,age,birthDay,citizenship"+System.lineSeparator());
			for (int i = 0; i < studentList.length; i++) {
				if(studentList[i].getName().equals("noName")) {
					continue;
				}
				pw.print(studentList[i].toStringShort());
			}
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}
		try {
			textFile.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	@Override
	public String toString() {
		String temp = "group [groupName=" + groupName + ", course=" + course + ", studentList:\n";

		for (int i = 0; i < count; i++) {
			temp = temp + studentList[i].toString();
		}
		return temp;
	}

	@Override
	public Human[] voencom(Human[] human) {

		int tempCount = 0;
		Human[] tempArr = new Human[1];
		for (int i = 0; i < human.length; i++) {
			if (human[i] != null && human[i].getAge() >= 18 && human[i].getSex().equals("mail")) {
				if (tempCount == 0) {
					tempArr[tempCount++] = human[i];

				} else {
					tempArr = Arrays.copyOf(tempArr, tempArr.length + 1);
					tempArr[tempCount++] = human[i];
				}
			}
		}
		return tempArr;

	}

}
