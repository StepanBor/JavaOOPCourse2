package pack1;

import java.util.Arrays;

public class Desk {

	private Shape[] deskPart=new Shape[4];
	
	private boolean[] isOccupyed=new boolean[4];

	public Desk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setPart(int part, Shape s) {
		if(isOccupyed[part]) {
		System.out.println("This part is already occupied by "+deskPart[part]);
		System.out.println();
		} else {
			deskPart[part]=s;
			isOccupyed[part]=true;
		}
	}
	
	public void clearPart(int part) {
		deskPart[part]=null;
		isOccupyed[part]=false;
	}

	@Override
	public String toString() {
		return "Desk [deskPart=" + Arrays.toString(deskPart) + ", isOccupyed=" + Arrays.toString(isOccupyed) + "]";
	}
	
	public double getTotalArea() {
		double sum=0;
		for (int i = 0; i < deskPart.length; i++) {
			if(deskPart[i]==null) {
				continue;
			}
			sum+=deskPart[i].gatArea();
		}
		return sum;
	}
	
}
