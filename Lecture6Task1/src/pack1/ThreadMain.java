package pack1;

public class ThreadMain {

	public static void main(String[] args) {
		
		NewThread[] nt=new NewThread[100];
		
		for (int i = 0; i <nt.length; i++) {
			
			nt[i]=new NewThread(i);
			nt[i].run();
						
		}
		

	}

}
