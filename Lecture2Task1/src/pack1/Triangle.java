package pack1;

public class Triangle extends Shape {

	private Point p1;
	private Point p2;
	private Point p3;
	private double side1;
	private double side2;
	private double side3;

	public Triangle(Point p1, Point p2, Point p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		side1 = this.p1.getDistToPoint(this.p2);
		side2 = this.p1.getDistToPoint(this.p3);
		side3 = this.p2.getDistToPoint(this.p3);
	}

	public Triangle() {
		super();
	}
	
	public Point getCenterPoint() {
		Point c=new Point();
		c.setX((p1.getX()+p2.getX()+p3.getX())/3);
		c.setY((p1.getY()+p2.getY()+p3.getY())/3);
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

}
