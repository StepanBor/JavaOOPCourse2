package pack1;

import java.util.Arrays;

public class Circle extends Shape {

	
	private double radius;
	private Point[] p=new Point[2];
	
	
 	public Circle(Point p1, Point p2) {
		super();
		
		p[0]=p1;
		p[1]=p2;
		radius=p[0].getDistToPoint(p[1]);
	}
	

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Point getP1() {
		return p[0];
	}


	public void setP1(Point p1) {
		p[0] = p1;
	}


	public Point getP2() {
		return p[1];
	}


	public void setP2(Point p2) {
		p[1] = p2;
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
		return p[0];
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getPerimetr()=" + getPerimetr()
				+ ", gatArea()=" + gatArea() + ", getCenterPoint()=" + getCenterPoint() + "]";
	}

	
}
