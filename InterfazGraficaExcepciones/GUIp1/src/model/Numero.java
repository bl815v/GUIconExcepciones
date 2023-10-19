package model;

public class Numero {
	private int n;
	
	public Numero(int n) {
		this.n = n;
	}
	
	public boolean esPar() {
		if(n % 2 == 0)
			return true;
		else
			return false;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
}
