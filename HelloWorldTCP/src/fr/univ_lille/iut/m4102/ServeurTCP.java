package fr.univ_lille.iut.m4102;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurTCP {
	private ServerSocket serveurSocket = null;

	public ServeurTCP(int port) {
		try {
			serveurSocket = new ServerSocket(port);
			System.out.println("Server lancé sur le port " + port);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public void miseEnService() {
		Socket unClient = null;

		while (true) {
			try {
				unClient = serveurSocket.accept();
				System.out.println("Nouveau client : " + unClient.getInetAddress());
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(1);
			}
			
			realiseService(unClient);
		}
	}

	private void realiseService(Socket unClient) {
		TalonCalculatrice TC = new TalonCalculatrice(unClient);
		new Thread(TC).start();
	}

	public static void main(String[] args) {
		ServeurTCP serveur = new ServeurTCP(3131);

		serveur.miseEnService();
	}

}