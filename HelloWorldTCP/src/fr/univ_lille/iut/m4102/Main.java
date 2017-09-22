package fr.univ_lille.iut.m4102;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws DivisionParZero{
		Calculatrice calc = new Calculatrice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le premiere valeure:");
		int x = sc.nextInt();
		System.out.println("choisissez l'operation:\n 1.Addition\n 2.Soustraction\n 3.Multiplication\n 4.Division");
		int i = sc.nextInt();
		int y;
		switch (i) {
		case 1:
			System.out.println("Entrez la deuxieme valeure:");
			y = sc.nextInt();
			System.out.println(calc.addition(x, y));
			break;
		
		case 2:
			System.out.println("Entrez la deuxieme valeure:");
			y = sc.nextInt();
			System.out.println(calc.soustraction(x, y));
			break;

		case 3:
			System.out.println("Entrez la deuxieme valeure:");
			y = sc.nextInt();
			System.out.println(calc.multiplication(x, y));
			break;
			
		case 4:
			System.out.println("Entrez la deuxieme valeure:");
			y = sc.nextInt();
			System.out.println(calc.division(x, y));
			break;
			
		default:
			break;
		}
	}
}
