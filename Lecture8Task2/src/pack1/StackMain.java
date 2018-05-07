package pack1;

public class StackMain {

	public static void main (String[] args) {
		
		Stack s=new Stack(10);
		
		String st="Hello";
		
		s.putObject(st);
		Integer in=58;
		
		s.putObject(in);
		
	
	
		System.out.println(s.getCount());
		System.out.println(s.getType());
		
		
		
		Object b= s.getObject();
		
		
		
		
		
		System.out.println(b.getClass().getName());
		
		System.out.println(b);
	}

}
