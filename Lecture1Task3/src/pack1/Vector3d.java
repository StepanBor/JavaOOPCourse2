package pack1;

public class Vector3d {

	private int vX;
	private int vY;
	private int vZ;
		
	public Vector3d(int vX, int vY, int vZ) {
		super();
		this.vX = vX;
		this.vY = vY;
		this.vZ = vZ;
	}
	
	public Vector3d() {
		super();
	}
		
	public int getvX() {
		return vX;
	}

	public void setvX(int vX) {
		this.vX = vX;
	}

	public int getvY() {
		return vY;
	}

	public void setvY(int vY) {
		this.vY = vY;
	}

	public int getvZ() {
		return vZ;
	}

	public void setvZ(int vZ) {
		this.vZ = vZ;
	}

	
	@Override
	public String toString() {
		return "Vector3d [vX=" + vX + ", vY=" + vY + ", vZ=" + vZ + ", length=" + getLength() + "]";
	}

	public double getLength() {
		return Math.sqrt(vX*vX+vY*vY+vZ*vZ);
	}
	
	
	public Vector3d getSum(Vector3d b) {
		Vector3d c=new Vector3d();
		c.vX=vX+b.vX;
		c.vY=vY+b.vY;
		c.vZ=vZ+b.vZ;
		return c;
	}
	
	public Vector3d getAxB(Vector3d b) {
		Vector3d c=new Vector3d();
		c.vX=vY*b.vZ-b.vY*vZ;
		c.vY=vZ*b.vX-b.vZ*vX;
		c.vZ=vX*b.vY-b.vX*vY;
		return c;
	}
	
	public int getAB(Vector3d b) {
		return vX*b.vX+vY*b.vY+vZ*b.vZ;
	}

}
