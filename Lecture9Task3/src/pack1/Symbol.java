package pack1;

public class Symbol {

	private char symbol;
	private int count;

	public Symbol(char symbol) {
		super();
		this.symbol = symbol;
		this.count = 0;
	}

	public Symbol() {
		super();

	}
	
	Character chf;
	
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
	public String toString() {
		return "Symbol [symbol=" + symbol + ", count=" + count + "]";
	}

}
