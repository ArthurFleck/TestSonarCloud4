package it.uniroma2.ispw.esempio0;

public class Nonno {
	
	protected int x;
	protected Nonno nonno;

	public Nonno(int x) {
		super();
		this.x = x;
		nonno = this;
	}
	
	public int somma (int y) {
		return this.x + y;
	}
	
}
