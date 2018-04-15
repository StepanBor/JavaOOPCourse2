package pack1;

public class TriangleProbe {

	public static void main(String[] args) {
		
		Triangle[] triangles=new Triangle[3];
		
		for (int i = 0; i < triangles.length; i++) {
			triangles[i]=new Triangle(i,i+1,i+2);
			System.out.println(triangles[i]);
			System.out.println();
		}

	}

}
