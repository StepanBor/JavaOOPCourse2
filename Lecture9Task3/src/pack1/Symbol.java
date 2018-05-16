package pack1;

public class Symbol {

//	private char symbol;
	private Character symbol;
	private int count;

	public Symbol(char symbol, int count) {
		super();
		this.symbol = symbol;
		this.count = count;
	}

	public Symbol() {
		super();

	}
	
	
	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + count;
		result = prime * result + symbol;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Symbol other = (Symbol) obj;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (count != other.count)
			return false;
		if (symbol != other.symbol)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[symbol=" + symbol + ", count=" + count + "]";
	}

}
