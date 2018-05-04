package pack1;

public class ThreadMain {

	public static void main(String[] args) {

		Thread[] nt = new Thread[100];

		for (int i = 0; i < nt.length; i++) {

			nt[i] = new Thread(new NewThread(i), "thread " + Integer.toString(i));

			nt[i].start();

			try {
				nt[i].join();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		

	}

}
