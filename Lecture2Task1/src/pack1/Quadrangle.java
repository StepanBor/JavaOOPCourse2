package pack1;

import java.util.Arrays;

public class Quadrangle extends Shape {

	private Point[] p = new Point[4];
	// private Point p1;
	// private Point p2;
	// private Point p3;
	// private Point p4;

	private double side1;
	private double side2;
	private double side3;
	private double side4;

	public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
		super();
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		p[3] = p4;
		side1 = p[0].getDistToPoint(p[1]);
		side2 = p[1].getDistToPoint(p[2]);
		side3 = p[2].getDistToPoint(p[3]);
		side4 = p[3].getDistToPoint(p[0]);
	}

	public Quadrangle() {
		super();

	}

	public Point getCenterPoint() {
		Point c = new Point();
		c.setX((p[0].getX() + p[1].getX() + p[2].getX()+p[3].getX()) / 4);
		c.setY((p[0].getY() + p[1].getY() + p[2].getY()+p[3].getY()) / 4);
		return c;
	}
	
	@Override
	public double getPerimetr() {
		return side1 + side2 + side3 + side4;
	}

	@Override
	public double gatArea() {
		double perHalf = (side1 + side2 + side3 + side4) / 2;
		double area = Math.sqrt((perHalf - side1) * (perHalf - side2) * (perHalf - side3) * (perHalf - side4));
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
		return "Quadrangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3
				+ ", side4=" + side4 + ", getCenterPoint()=" + getCenterPoint() + ", getPerimetr()=" + getPerimetr()
				+ ", gatArea()=" + gatArea() + "]";
	}

	
}
