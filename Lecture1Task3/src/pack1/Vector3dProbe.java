package pack1;

public class Vector3dProbe {

	public static void main(String[] args) {
		Vector3d a=new Vector3d(5,8,-9);
		Vector3d b=new Vector3d(3,-3,3);
		Vector3d c=a.getAxB(b);
		Vector3d d=a.getSum(b);
		int ab=a.getAB(b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(ab);
		

	}

}
