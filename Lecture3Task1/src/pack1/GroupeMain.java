package pack1;

public class GroupeMain {

	public static void main(String[] args) {
		
		Student[] st=new Student[10];
		st[0]=new Student(18, "femail", "Maria", "Ponomarenko", "12:12:2000", "Ukraine", 2.5);
		st[1]=new Student(18, "mail", "Vasya", "Vasiliev", "12:12:2000", "Ukraine", 5.0);
		st[2]=new Student(20, "mail", "Petya", "Petrov", "10:08:1999", "Russia", 5.0);
		st[3]=new Student(18, "mail", "Mahmud", "Mahmudov", "12:06:2000", "Egypt", 4.2);
		st[4]=new Student(20, "femail", "Gulnara", "Karimova", "06:08:1999", "Kazahstan",2.5);
		st[5]=new Student(18, "mail", "Borya", "Vasiliev", "12:12:2000", "Ukraine", 2.5);
		st[6]=new Student(18, "mail", "Nicolay", "Petrenko", "12:12:2000", "Ukraine", 3.0);
		st[7]=new Student(18, "mail", "Bamba", "Balamba", "12:12:2000", "Uganda", 5.0);
		st[8]=new Student(18, "mail", "Aleksandr", "Aleksandrov", "12:12:2000", "Ukraine", 4.2);
		st[9]=new Student(18, "mail", "Akim", "Caraedov", "12:12:2000", "Mongolia", 4.2);
		Groupe gr=new Groupe("LM-02", 1, 10);
		
		for (int i = 0; i < st.length; i++) {
			gr.enrollStudent(st[i]);
		}
		
		System.out.println(gr);
		System.out.println();
		System.out.println();
		gr.sortByAveregeBall();
		System.out.println(gr);
		System.out.println();
		System.out.println();
		gr.sortByLastname();
		System.out.println(gr);

		System.out.println();
		gr.excludeStudent(2);
		System.out.println(gr);
		gr.enrollStudent(st[9]);
		gr.enrollStudent(st[8]);
		System.out.println();
		System.out.println(gr.searchStudent("Balamba"));
	}

}
