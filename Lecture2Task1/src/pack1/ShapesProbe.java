package pack1;

public class ShapesProbe {

	public static void main(String[] args) {
		
		Point p1=new Point(8.0,6.0);
		Point p2=new Point(5,9);
		Point p3=new Point(6,8);
		Point p4=new Point(3,7); 
		
		Desk d1=new Desk();
				
		Triangle t1=new Triangle(new Point(8,6), new Point(9,6), new Point(7,5));
		Quadrangle q1=new Quadrangle(p1,p2,p3,p4);
		Circle c1=new Circle(new Point(7,2),new Point(3,9));
		Circle c2=new Circle(new Point(9,5),new Point(3,5));
		
		d1.setPart(0, t1);
		System.out.println(d1);
		System.out.println();
		d1.setPart(0, c2);
		System.out.println(d1);
		System.out.println();
		d1.setPart(1, c1);
		System.out.println(d1);
		System.out.println();
		d1.clearPart(0);
		System.out.println(d1);
		System.out.println();
				
		System.out.println("Total area is "+d1.getTotalArea());

	}

}
