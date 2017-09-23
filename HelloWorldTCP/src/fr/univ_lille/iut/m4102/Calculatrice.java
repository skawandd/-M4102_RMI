package fr.univ_lille.iut.m4102;

public class Calculatrice {
	private double x;
	private double y;
	private String s;

	public void setS(String s) {
		this.s = s;
	}

	public String traitement() throws DivisionParZero {
		if (s.contains("+")) {
			this.x = Double.parseDouble(s.substring(0, s.indexOf("+")));
			this.y = Double.parseDouble(s.substring(s.indexOf("+") + 1, s.length()));
			return addition();
		}

		if (s.contains("-")) {
			this.x = Double.parseDouble(s.substring(0, s.indexOf("-")));
			this.y = Double.parseDouble(s.substring(s.indexOf("-") + 1, s.length()));
			return soustraction();
		}

		if (s.contains("*")) {
			this.x = Double.parseDouble(s.substring(0, s.indexOf("*")));
			this.y = Double.parseDouble(s.substring(s.indexOf("*") + 1, s.length()));
			return multiplication();

		}

		if (s.contains("/")) {
			this.x = Double.parseDouble(s.substring(0, s.indexOf("/")));
			this.y = Double.parseDouble(s.substring(s.indexOf("/") + 1, s.length()));
			return division();
		}
		
		return "Ce n'est pas un calcul";
	}

	public String addition() {
		return "= " + (this.x + this.y);
	}

	public String soustraction() {
		return "= " + (this.x - this.y);
	}

	public String multiplication() {
		return "= " + (this.x * this.y);
	}

	public String division() throws DivisionParZero {
		if (y == 0)
			throw new DivisionParZero("Erreur division par 0 !");

		return "= " + (this.x / this.y);
	}
}