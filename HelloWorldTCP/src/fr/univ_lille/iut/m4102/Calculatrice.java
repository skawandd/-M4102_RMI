package fr.univ_lille.iut.m4102;

public class Calculatrice{
	private int x;
	private int y;
	
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
