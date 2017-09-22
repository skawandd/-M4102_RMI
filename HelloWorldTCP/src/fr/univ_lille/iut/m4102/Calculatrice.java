package fr.univ_lille.iut.m4102;

public class Calculatrice{
	private double x;
	private double y;
	private String s;
	private char signe;
	
	public void setS(String s){
		this.s = s;
	}
	
	public void traitement(){
		if(s.contains("+")){
			this.x = Double.parseDouble(s.substring(0, s.indexOf("+")));
			signe ='+';
			this.y = Double.parseDouble(s.substring(s.indexOf("+")+1, s.length()));
		}
		
		if(s.contains("-")){
			this.x = Double.parseDouble(s.substring(0, s.indexOf("-")));
			signe = '-';
			this.y = Double.parseDouble(s.substring(s.indexOf("-")+1, s.length()));
		}
		
		if(s.contains("*")){
			this.x = Double.parseDouble(s.substring(0, s.indexOf("*")));
			signe = '*';
			this.y = Double.parseDouble(s.substring(s.indexOf("*")+1, s.length()));
			
		}else
			this.x = Double.parseDouble(s.substring(0, s.indexOf("/")));
			signe = '/';
			this.y = Double.parseDouble(s.substring(s.indexOf("/")+1, s.length()));
	}
	
	
	
	public int addition(int x, int y){
		return x + y;
	}
	
	public int soustraction(int x, int y){
		return x - y;
	}
	
	public int multiplication(int x, int y){
		return x * y;
	}
	
	public int division(int x, int y) throws DivisionParZero{
		if(y == 0)
			throw new DivisionParZero("Erreur division par 0!");
		
		return x / y;
	}
}
