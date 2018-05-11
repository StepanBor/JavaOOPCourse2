package pack1;

import java.util.Comparator;

public class SymbolComparator2 implements Comparator<Symbol> {

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
		
		if(o1.getSymbol()>o2.getSymbol()) {
			return 1;
		}
		
		if(o1.getSymbol()<o2.getSymbol()) {
			return -1;
		}
		
		return 0;
	}
	
}
