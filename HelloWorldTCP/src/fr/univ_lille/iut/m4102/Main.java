package fr.univ_lille.iut.m4102;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws DivisionParZero{
		
		Calculatrice calc = new Calculatrice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le premiere le calcul:");
		calc.setS(sc.nextLine());
		
	}
}
