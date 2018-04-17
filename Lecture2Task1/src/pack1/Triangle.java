package pack1;

import java.util.Arrays;

public class Triangle extends Shape {

	private Point[] p = new Point[3];
	// private Point p1;
	// private Point p2;
	// private Point p3;
	private double side1;
	private double side2;
	private double side3;

	public Triangle(Point p1, Point p2, Point p3) {
		super();
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		side1 = p[0].getDistToPoint(p[1]);
		side2 = p[1].getDistToPoint(p[2]);
		side3 = p[2].getDistToPoint(p[0]);
	}

	public Triangle() {
		super();
	}

	public Point getCenterPoint() {
		Point c = new Point();
		c.setX((p[0].getX() + p[1].getX() + p[2].getX()) / 3);
		c.setY((p[0].getY() + p[1].getY() + p[2].getY()) / 3);
		return c;
	}

	@Override
	public double getPerimetr() {
		return side1 + side2 + side3;
	}

	@Override
	public double gatArea() {
		double perHalf = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(perHalf * (perHalf - side1) * (perHalf - side2) * (perHalf - side3));
		return area;
	}

	public Point getPoint(int index) {
		if (index >= 0 & index < p.length) {
			for (int i = 0; i < p.length; i++) {
				if (index == i) {
					return p[i];

				}
			}
		}
		Point k = new Point();
		return k;

	}

	public void setPoint(int index, Point k) {
		if (index >= 0 & index < p.length) {
			for (int i = 0; i < p.length; i++) {
				if (index == i) {
					p[i] = k;

				}
			}
		}

	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3
				+ ", getCenterPoint()=" + getCenterPoint() + ", getPerimetr()=" + getPerimetr() + ", gatArea()=" + gatArea() + "]";
	}

	
}
