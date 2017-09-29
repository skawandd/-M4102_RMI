package fr.univ_lille.iut.m4102;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		ClientTCP TC = new ClientTCP("localhost",3131);
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.next();
			System.out.println(TC.envoyer(s));
		}
	}
}