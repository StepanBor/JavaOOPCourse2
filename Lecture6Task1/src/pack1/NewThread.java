package pack1;

import java.math.BigInteger;

public class NewThread implements Runnable {

	private String result;
	private int number;
		
	
	public NewThread(int number) {
		super();
		
		this.number = number;
	}
	
	public NewThread() {
		super();
		
	}

	public String factorial(int num) {
		
		if(num==0|num==1) {
			
			return "1";
		}
		
		BigInteger fact=new BigInteger("1");
		
		
		for (int i = 1; i <= num; i++) {
			fact=fact.multiply(new BigInteger(Integer.toString(i)));			
			
		}		
		return fact.toString();
		
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
		System.out.println("fact("+number+")= "+result+"---"+Thread.currentThread().getName());
				
	}

	
}
