package pack1;

import java.util.Comparator;

public class SymbolComparator implements Comparator<Symbol> {

	@Override
	public int compare(Symbol o1, Symbol o2) {
		
		if(o1!=null & o2==null) {
			return 1;
		}
		
		if(o1==null & o2!=null) {
			return -1;
		}
			
		if(o1==null & o2==null) {
			return 0;
		}
		
		if(o1.getCount()>=o2.getCount()) {
			return -1;
		}
		
		if(o1.getCount()<o2.getCount()) {
			return 1;
		}
		
		return 0;
	}

}
