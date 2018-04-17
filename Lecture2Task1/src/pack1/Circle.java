package pack1;

public class Circle extends Shape {

	
	private double radius;
	private Point[] p=new Point[2];
	
	
 	public Circle(Point p1, Point p2) {
		super();
		
		p[1]=p1;
		p[2]=p2;
		radius=p[1].getDistToPoint(p[2]);
	}
	

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Point getP1() {
		return p[1];
	}


	public void setP1(Point p1) {
		p[1] = p1;
	}


	public Point getP2() {
		return p[2];
	}


	public void setP2(Point p2) {
		p[2] = p2;
	}


	@Override
	public double getPerimetr() {
		return 2*Math.PI*radius;
	}

	@Override
	public double gatArea() {
		return Math.PI*Math.pow(2, radius)/2;
	}
	
	public Point getCenterPoint() {
		return p[1];
	}

}
