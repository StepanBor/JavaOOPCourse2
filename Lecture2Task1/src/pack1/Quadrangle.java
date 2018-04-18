package pack1;

import java.util.Arrays;

public class Quadrangle extends Shape {

	private Point[] p = new Point[4];
	// private Point p1;
	// private Point p2;
	// private Point p3;
	// private Point p4;
	private double[] side = new double[4];

	public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
		super();
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		p[3] = p4;
		// side[0] = p[0].getDistToPoint(p[1]);
		// side[1] = p[1].getDistToPoint(p[2]);
		// side[2] = p[2].getDistToPoint(p[3]);
		// side[3] = p[3].getDistToPoint(p[0]);
		for (int i = 0; i < side.length; i++) {
			side[i] = p[i].getDistToPoint((i == side.length - 1 ? p[0] : p[i + 1]));
		}
	}

	public Quadrangle() {
		super();

	}

	public Point getCenterPoint() {
		Point c = new Point();
		c.setX((p[0].getX() + p[1].getX() + p[2].getX() + p[3].getX()) / 4);
		c.setY((p[0].getY() + p[1].getY() + p[2].getY() + p[3].getY()) / 4);
		return c;
	}

	@Override
	public double getPerimetr() {
		return side[0] + side[1] + side[2] + side[3];
	}

	@Override
	public double gatArea() {
		double perHalf = (side[0] + side[1] + side[2] + side[3]) / 2;
		double area = Math.sqrt((perHalf - side[0]) * (perHalf - side[1]) * (perHalf - side[2]) * (perHalf - side[3]));
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
			for (int i = 0; i < side.length; i++) {
				
				side[i] = p[i].getDistToPoint((i == side.length - 1 ? p[0] : p[i + 1]));
			}
		}

	}

	@Override
	public String toString() {
		return "Quadrangle [side[0]=" + side[0] + ", side[1]=" + side[1] + ", side[2]=" + side[2] + ", side[3]="
				+ side[3] + ", getCenterPoint()=" + getCenterPoint() + ", getPerimetr()=" + getPerimetr()
				+ ", gatArea()=" + gatArea() + "]";
	}

}
