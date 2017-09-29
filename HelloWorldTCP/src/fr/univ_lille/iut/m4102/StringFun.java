package fr.univ_lille.iut.m4102;

public class StringFun {
	
	private String s;

	public void setS(String s) {
		this.s = s;
	}

	public String traitement() throws DivisionParZero {
		/*if(s.contains("[rR]") == false){
			throw new DivisionParZero("Il y a pas d'air mdr!");
		}*/
		s = s.replaceAll("[rR]", "");
		System.out.println(s);
		return leet("t2"+s);
	}
	
	public String leet(String chaine) {
		s = s.replaceAll("[aA]", "4");
		s = s.replaceAll("[eE]", "3");
		s = s.replaceAll("[iI]", "1");
		s = s.replaceAll("[oO]", "0");
		s = s.replaceAll("[uU]", "(_)");
		s = s.replaceAll("[yY]", "7");
		return s;
	}
}