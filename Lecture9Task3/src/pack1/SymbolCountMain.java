package pack1;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeSet;



public class SymbolCountMain {

	public static void main(String[] args) {
		
		Set<Symbol> symbolSet=new TreeSet<Symbol>(new SymbolComparator2());
		
		for (int i = 0; i <26; i++) {
			
			symbolSet.add(new Symbol((char) (i+65)));

		}

	}
	
	public static String readFileToString(File file) {
		
		return null;
		
	}

}
