package it.uniroma2.ispw.esempio0;

public class Esempio0Test {

	public static void main(String[] args) {
		
		Nonno n;
		n = new Nonno(7);
		System.out.println("Nonno n = new Nonno(7);");
		System.out.println("Somma (n.somma(4)): "+n.somma(4));
		System.out.println("");
		
		Nonno p;
		p = new Padre(7);
		System.out.println("Nonno p = new Padre(7);");
		System.out.println("Somma (p.somma(4)): "+p.somma(4));
		System.out.println("");
		
		Nonno f;
		f = new Figlio(7);
		System.out.println("Nonno f = new Figlio(7);");
		System.out.println("Somma (f.somma(4)): "+f.somma(4));
		System.out.println("");
		
		Figlio fi;
		fi = new Figlio(7);
		System.out.println("Figlio fi = new Figlio(7);");
		System.out.println("Somma (fi.somma(4)): "+fi.somma(4));
		System.out.println("Somma (fi.nonno.somma(30)): "+fi.nonno.somma(30));
		System.out.println("");
		
		Nonno non;
		non = fi.nonno;
		System.out.println("Nonno non = fi.nonno;");
		System.out.println("Somma (non.somma(4)): "+non.somma(4));
		System.out.println("");
		
		Nonno nonn;
		nonn = new Padre(7).nonno;
		System.out.println("Nonno nonn = new Padre(7).nonno;");
		System.out.println("Somma (nonn.somma(4)): "+nonn.somma(4));
		System.out.println("");
		
		Nonno nonno;
		nonno = new Nonno(7).nonno;
		System.out.println("Nonno nonno = new Nonno(7).nonno;");
		System.out.println("Somma (nonno.somma(4)): "+nonno.somma(4));
		System.out.println("");
		
	}
}
