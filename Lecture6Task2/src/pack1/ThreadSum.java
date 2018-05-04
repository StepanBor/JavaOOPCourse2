package pack1;

public class ThreadSum implements Runnable {

	private int[] inpArr;
//	private int threadIndex;
	private int beginIndex;
	private int endIndex;
	private int sum;
		
	public ThreadSum(int[] inpArr, int beginIndex, int endIndex) {
		super();
		this.inpArr = inpArr;
		this.beginIndex = beginIndex;
		this.endIndex = endIndex;
		sum=0;
	}
	
	public ThreadSum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int[] getInpArr() {
		return inpArr;
	}

	public int getSum() {
		return sum;
	}

//	public void setInpArr(int[] inpArr) {
//		this.inpArr = inpArr;
//	}

	@Override
	public void run() {
		for (int i = beginIndex; i <= endIndex; i++) {
			sum=sum+inpArr[i];
		}
		
	}

	

}
