package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.awt.Component;
import java.text.ParseException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class GroupMain {

	public static void main(String[] args) {
		Group gr = new Group("LM-02", 1, 10);
		Human[] voencom;

		for (;;) {
			int option = JOptionPane.showConfirmDialog(null, "Do you want to add student to group LM-02 manualy?");

			if (option == 0) {
				String stud1 = JOptionPane
						.showInputDialog("Input  name, lastname, sex, groupe, course, average ball, birthday dd:mm:yyyy, ctizenship,");

				String[] stud = stud1.split(",");
				// System.out.println(Arrays.toString(stud));
				try {
					Student stud2 = new Student(stud);
					gr.enrollStudent(stud2);
				} catch (ParseException e) {
					System.out.println("Wrong birthday date format");
				} catch (NumberFormatException b) {
					System.out.println("Wrong average ball data format");
				}
			} else {
				break;
			}
		}

		// System.out.println(option);

		// Student studProbe = new Student();

		Student[] st = new Student[10];
		Student studProbe = new Student();
		try {
			st[0] = new Student("femail", "Maria", "Ponomarenko", "1998-12-12", "Ukraine", 2.5);
			st[1] = new Student("mail", "Vlad", "Dracula", "1212-12-12", "Romania", 5.0);
			st[2] = new Student("mail", "Petya", "Petrov", "1999-10-10", "Russia", 5.0);
			st[3] = new Student("mail", "Mahmud", "Mahmudov", "2001-12-12", "Egypt", 4.2);
			st[4] = new Student("femail", "Gulnara", "Karimova", "1999-10-10", "Kazahstan", 2.5);
			st[5] = new Student("mail", "Borya", "Vasiliev", "1991-10-10", "Ukraine", 2.5);
			st[6] = new Student("mail", "Nicolay", "Petrenko", "2000-10-10", "Ukraine", 3.0);
			st[7] = new Student("mail", "Bamba", "Balamba", "2000-12-12", "Uganda", 5.0);
			st[8] = new Student("mail", "Aleksandr", "Aleksandrov", "2000-12-12", "Ukraine", 4.2);
			st[9] = new Student("mail", "Akim", "Caraedov", "2000-12-12", "Mongolia", 4.2);
			studProbe = new Student("femail", "Gulnara", "Karimova", "1999-12-12", "Kazahstan", 2.5);
		} catch (ParseException e) {
			System.out.println("Wrong birthday date format");
		}

		// try {
		for (int i = 0; i < st.length; i++) {
			gr.enrollStudent(st[i]);
//			System.out.println(st[i]);
		}
		// } catch (GroupOverflowException e) {
		// System.out.println(e);
		// }

		System.out.println(gr);
		System.out.println();
		System.out.println("Sort by average ball");
		gr.sortByAveregeBall();

		System.out.println(gr);
		System.out.println();

		System.out.println("Exclude student 2");
		gr.excludeStudent(2);
		System.out.println(gr);

		System.out.println("Exclude student 0");
		gr.excludeStudent(0);
		System.out.println(gr);

		System.out.println("search snudent Balamba");
		System.out.println(gr.searchStudent("Balamba"));

		System.out.println();
		System.out.println("Voencomat list ");
		voencom = gr.voencom(gr.getStudentList());


//		Arrays.sort(voencom, (s1, s2) -> CheckNull.checkNull(s1, s2) != CheckNull.CONST ? CheckNull.checkNull(s1, s2)
//				: s1.getLastname().compareToIgnoreCase(s2.getLastname()));
//		System.out.println(Arrays.toString(voencom));
//
//		gr.createTxtFile("StudentList");
		
//		try {
//
//			Group gr2=Group.createFromFile(new File("tempDirectory\\StudentList"));
//			System.out.println(gr2);
//		}catch (FileNotFoundException e) {
//			System.out.println(e);
//		}
		
		
//		try {
//
//			GroupDatabase.addStudent(gr.getStudentList().get(1));
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}

		gr.addGroupToDatabase();

	}

}
