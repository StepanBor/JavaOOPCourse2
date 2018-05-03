package pack1;

public class NewThread implements Runnable {

	private long result;
	private int number;
		
	
	public NewThread(int number) {
		super();
		
		this.number = number;
	}
	
	public long factorial(int num) {
		
		if(num==0|num==1) {
			
			return 1;
		}
		
		long fact=1L;
		
		for (int i = 1; i <= num; i++) {
			fact=fact*i;			
			
		}		
		return fact;
		
	}
	
	public int getNumber() {
		return number;
	}
		
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		
		result=factorial(number);
		System.out.println(Thread.currentThread().getName()+result);
				
	}

	
}
