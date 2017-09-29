package fr.univ_lille.iut.m4102;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class TalonCalculatrice implements Runnable {
	private Socket unClient;
	
	public TalonCalculatrice(Socket unClient) {
		this.unClient = unClient;
	}

	@Override
	public void run() {
		try {
			PrintStream out = new PrintStream(unClient.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(unClient.getInputStream()));
			StringFun calc = new StringFun();
			String s = in.readLine();
			System.out.println("Le client " + unClient.getInetAddress() + " envoie : " + s);
			calc.setS(s);
			try {
				out.println(calc.traitement());
			} catch (DivisionParZero e) {
				out.println(e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}