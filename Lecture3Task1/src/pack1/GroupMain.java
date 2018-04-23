package pack1;

public class GroupMain {

	public static void main(String[] args) {
		
		Student[] st=new Student[10];
		st[0]=new Student("femail", "Maria", "Ponomarenko", "12:12:2000", "Ukraine", 2.5);
		st[1]=new Student("mail", "Vasya", "Vasiliev", "12:12:2000", "Ukraine", 5.0);
		st[2]=new Student("mail", "Petya", "Petrov", "10:08:1999", "Russia", 5.0);
		st[3]=new Student("mail", "Mahmud", "Mahmudov", "12:06:2000", "Egypt", 4.2);
		st[4]=new Student("femail", "Gulnara", "Karimova", "06:08:1999", "Kazahstan",2.5);
		st[5]=new Student("mail", "Borya", "Vasiliev", "12:12:2000", "Ukraine", 2.5);
		st[6]=new Student("mail", "Nicolay", "Petrenko", "12:12:2000", "Ukraine", 3.0);
		st[7]=new Student("mail", "Bamba", "Balamba", "12:12:2000", "Uganda", 5.0);
		st[8]=new Student("mail", "Aleksandr", "Aleksandrov", "12:12:2000", "Ukraine", 4.2);
		st[9]=new Student("mail", "Akim", "Caraedov", "12:12:2000", "Mongolia", 4.2);
		
		Group gr=new Group("LM-02", 1, 10);
		//try {
		for (int i = 0; i < st.length; i++) {
			gr.enrollStudent(st[i]);
//		}
//		} catch(GroupOverflowException e){
//			System.out.println(e);
//		}
		
		System.out.println(gr);
		System.out.println();
		System.out.println("Sort by average ball");
		gr.sortByAveregeBall();
		System.out.println(gr);
		System.out.println();
		System.out.println("Sort by lastname");
		gr.sortByLastname();
		System.out.println(gr);

		System.out.println("Exclude student 2");
		gr.excludeStudent(2);
		System.out.println(gr);
//		gr.enrollStudent(st[9]);
//		gr.enrollStudent(st[8]);
//		System.out.println();
		System.out.println(gr.searchStudent("Balamba"));
	}

}
