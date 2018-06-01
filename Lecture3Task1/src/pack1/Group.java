package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group implements IVoencom {

    private String groupName;
    private int course;
    private int groupSize;
    private int count;
    private List<Student> studentList = new ArrayList<Student>();

    public Group(String groupName, int course, int groupSize) {
        super();
        this.groupName = groupName;
        this.course = course;
        this.groupSize = groupSize;
        count = 0;
//		studentList = new ArrayList<Student>();


    }

    public Group() {
        super();
//		studentList = new ArrayList<Student>();

    }

    public String getgroupName() {
        return groupName;
    }

    public List<Student> getStudentList() {
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

//	public int getgroupSize() {
//		return groupSize;
//	}
//
//	public void setgroupSize(int groupSize) {
//		this.groupSize = groupSize;
//	}

//	public int getCount() {
//		return count;
//	}

    public void enrollStudent(Student student) /* throws GroupOverflowException */ {

//		try {
//			if (count < groupSize) {
//				studentList[count] = student;
//        student.setgroupName(groupName);
//        student.setCourse(course);
//				count++;
//			} else {
//				throw new GroupOverflowException();
//			}
//		} catch (GroupOverflowException e) {
//			System.out.println(e.getMessage());
//			return;
//		}
        studentList.add(student);
        student.setgroupName(groupName);
        student.setCourse(course);
//		System.out.println(studentList);

    }

//	public void swapStudent(int i, int j) {
//		Student temp = studentList[i];
//		studentList[i] = studentList[j];
//		studentList[j] = temp;
//	}

    public void excludeStudent(int index) {

        studentList.remove(index);

//		if (index <= count) {
//			for (int i = 0; i < studentList.length - 1; i++) {
//				if (index == i) {
//					swapStudent(i, i + 1);
//					index++;
//				}
//			}
//
//			studentList[index] = new Student();
//			count--;
//		} else {
//			System.out.println("Student not found.");
//		}

    }

    public void excludeStudent(Student student) {

        for (Student stud : studentList) {
            if (stud.equals(student)) {
                int index = studentList.indexOf(stud);
                excludeStudent(index);
                return;
            }
        }
//		for (int i = 0; i < studentList.length; i++) {
//			if (studentList[i].myEquals(student)) {
//				int index = i;
//				excludeStudent(index);
//			}
//		}
        System.out.println("There is no this student in group");

    }

    public void sortByAge() {
//		Arrays.sort(studentList,
//				(s1, s2) -> CheckNull.checkNull(s1, s2) != CheckNull.CONST ? CheckNull.checkNull(s1, s2)
//						: (s1.getAge() - s2.getAge()));
        studentList.sort(new CompareByAge());
    }

    //
    public void sortByLastname() {
//		Arrays.sort(studentList,
//				(s1, s2) -> CheckNull.checkNull(s1, s2) != CheckNull.CONST ? CheckNull.checkNull(s1, s2)
//						: s1.getLastname().compareToIgnoreCase(s2.getLastname()));
        studentList.sort(new CompareByLastname());
    }

    //
    public void sortByAveregeBall() {
//		Arrays.sort(studentList,
//				(s1, s2) -> CheckNull.checkNull(s1, s2) != CheckNull.CONST ? CheckNull.checkNull(s1, s2)
//						: (int) (s1.getAveregeBall() * 10 - s2.getAveregeBall() * 10));
        studentList.sort(new CompareByAvarageBall());
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

        for (Student student : studentList) {
//			if (student.getLastname().equalsIgnoreCase(lastname)) {
//				return student.toString();
//			}
            System.out.println(student);
        }

        return "there is no student with " + lastname + " lastname";

    }

    public void createTxtFile(String fileName) {

        File tempDirec = new File("tempDirectory");

        tempDirec.mkdir();

        File textFile = new File("tempDirectory\\" + fileName);
        try (PrintWriter pw = new PrintWriter(textFile)) {
            pw.print("Name,Lastname,sex,groupe,course,averegeBall,age,birthDay,citizenship" + System.lineSeparator());

            for (Student student : studentList) {
                if (student.getName().equals("noName")) {
                    continue;
                }
                pw.print(student.toStringShort());
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

    public static Group createFromFile(File extFile) throws FileNotFoundException {
        String extText = "";
        if (extFile.exists()) {

            try (InputStream input = new FileInputStream(extFile)) {
                byte[] buffer = new byte[1024];
                int temp;
                for (; (temp = input.read(buffer)) > 0; ) {
                    for (int i = 0; i < buffer.length; i++) {
                        extText = extText + (char) buffer[i];
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            throw new FileNotFoundException();
        }

        String[] extGroupe = extText.split(System.lineSeparator());

        Student[] tempStudent = new Student[extGroupe.length];
        int count = 0;
        for (int i = 0; i < extGroupe.length; i++) {
            try {
                tempStudent[i] = new Student(extGroupe[i].split(","));

            } catch (ParseException e) {
                tempStudent[i] = new Student();
                System.out.println(e);
            } catch (NumberFormatException b) {
                tempStudent[i] = new Student();
                System.out.println(b);
            } catch (ArrayIndexOutOfBoundsException c) {
                tempStudent[i] = new Student();
                System.out.println(c);
            }
        }

        for (int i = 0; i < tempStudent.length; i++) {
            if (tempStudent[i].getCourse() > 0) {
                count = i;
                break;
            }
        }
        Group group = new Group(tempStudent[count].getgroup(), tempStudent[count].getCourse(), tempStudent.length);

        for (int i = 0; i < tempStudent.length; i++) {
            if (tempStudent[i].getName().equals("noName")) {
                continue;
            }
            group.enrollStudent(tempStudent[i]);

        }

        return group;
    }

    @Override
    public String toString() {
        String temp = "group [groupName=" + groupName + ", course=" + course + ", studentList:\n";

        for (Student student : studentList) {
//			System.out.println(student);
            temp = temp + student.toString();
        }
        return temp;
    }

    @Override
    public Human[] voencom(List<Student> human) {

        int tempCount = 0;
        Human[] tempArr = new Human[1];
        for (Human hum : human) {
            if (hum != null && hum.getAge() >= 18 && hum.getSex().equals("mail")) {
                if (tempCount == 0) {
                    tempArr[tempCount++] = hum;

                } else {
                    tempArr = Arrays.copyOf(tempArr, tempArr.length + 1);
                    tempArr[tempCount++] = hum;
                }
            }
        }
        return tempArr;

    }

    public void addGroupToDatabase(Group this){

        for (Student st:studentList) {

            try {
                GroupDatabase.addStudent(st);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

    }

}
