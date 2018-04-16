package pack1;

public class Point {

	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDistToPoint(Point p) {
		return Math.sqrt((Math.pow((x-p.x), 2))+(Math.pow((y-p.y), 2)));
	}
	
	
}
