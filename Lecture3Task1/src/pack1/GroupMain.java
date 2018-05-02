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
			st[0] = new Student("femail", "Maria", "Ponomarenko", "12:12:1998", "Ukraine", 2.5);
			st[1] = new Student("mail", "Vlad", "Dracula", "12:12:1212", "Romania", 5.0);
			st[2] = new Student("mail", "Petya", "Petrov", "10:08:1999", "Russia", 5.0);
			st[3] = new Student("mail", "Mahmud", "Mahmudov", "12:06:2001", "Egypt", 4.2);
			st[4] = new Student("femail", "Gulnara", "Karimova", "06:08:1999", "Kazahstan", 2.5);
			st[5] = new Student("mail", "Borya", "Vasiliev", "12:12:1991", "Ukraine", 2.5);
			st[6] = new Student("mail", "Nicolay", "Petrenko", "12:12:2000", "Ukraine", 3.0);
			st[7] = new Student("mail", "Bamba", "Balamba", "12:12:2000", "Uganda", 5.0);
			st[8] = new Student("mail", "Aleksandr", "Aleksandrov", "12:12:2000", "Ukraine", 4.2);
			st[9] = new Student("mail", "Akim", "Caraedov", "12:12:2000", "Mongolia", 4.2);
			studProbe = new Student("femail", "Gulnara", "Karimova", "06:08:1999", "Kazahstan", 2.5);
		} catch (ParseException e) {
			System.out.println("Wrong birthday date format");
		}

		// try {
		for (int i = 0; i < st.length; i++) {
			gr.enrollStudent(st[i]);
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
		Arrays.sort(voencom, (s1, s2) -> CheckNull.checkNull(s1, s2) != CheckNull.CONST ? CheckNull.checkNull(s1, s2)
				: s1.getLastname().compareToIgnoreCase(s2.getLastname()));
		System.out.println(Arrays.toString(voencom));
		
		gr.createTxtFile("StudentList");
		
		try {
			
			Group gr2=Group.createFromFile(new File("tempDirectory\\StudentList"));
			System.out.println(gr2);
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
