package pack1;

public class Triangle extends Shape {

	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(Point p1, Point p2, Point p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Triangle() {
		super();
	}

	private double side1 = p1.getDistToPoint(p2);
	private double side2 = p1.getDistToPoint(p3);
	private double side3 = p2.getDistToPoint(p3);

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

}
