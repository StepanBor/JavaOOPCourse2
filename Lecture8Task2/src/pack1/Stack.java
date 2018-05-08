package pack1;

import java.util.Arrays;

public class Stack {

	private int size;
	private int count = 0;
	private Object[] arr;
	private String[] type;
	private Class<?>[] classOb;
	BlackList blackList=new BlackList();
	

	public Stack(int size) {
		super();
		this.size = size;
		arr = new Object[size];
		type = new String[size];
		classOb = new Class[size];
		

	}
	
	
	
	public Stack() {
		super();

	}

	public String getType() {
		return type[count - 1];
	}

	public Class getClassOb() {
		return classOb[count - 1];
	}

	// public void setType(String[] type) {
	// this.type = type;
	// }

	public int getCount() {
		return count;
	}

	// public void setCount(int count) {
	// this.count = count;
	// }

	public <T> void putObject(T put) {
		
		if(blackList.isInBlakList(put)) {
			System.out.println("Type is forbiden");
			return;
		}
				
		if (count <= (arr.length - 1)) {
			put.getClass().cast(arr[count]);
			arr[count] = put;
			type[count] = put.getClass().getName();
			classOb[count] = put.getClass();
			count++;

		} else {

			Object[] newArr = new Object[arr.length * 2];
			String[] newType = new String[arr.length * 2];

			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
				newType[i] = type[i];
				put.getClass().cast(arr[count]);
				arr[count] = put;
				type[count] = put.getClass().getName();
				classOb[count] = put.getClass();
				count++;
			}

		}

	}

	// public Object getObject() {
	//
	// return arr[count - 1];
	// }

	public <T> T getObject() {

		if (count == 0) {
			System.out.println("Stack is empty");
			return null;
		}

		return (T) arr[count - 1];
	}

	public <T> T getAndDellObj() {
		
		T temp= (T) arr[count - 1];
		
		if (count == 0) {
			System.out.println("Stack is empty");
			return null;
		}
		arr[count-1]=null;
		count--;
		return temp;
	}

	@Override
	public String toString() {
		return "Stack [size=" + size + ", count=" + count + ", arr=" + Arrays.toString(arr) + "\n, type="
				+ Arrays.toString(type) + "]";
	}
	
	

}
