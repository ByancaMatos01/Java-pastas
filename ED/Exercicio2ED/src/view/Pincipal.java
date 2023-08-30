package view;

import java.util.Random;

import model.Pilha;

public class Pincipal {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		boolean vazia = p.isEmpty();
		System.out.println(vazia);
		int TotalNos = (int) ((Math.random() * 10) + 1);
		for (int i = 0; i < TotalNos; i++) {
			String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        Random r = new Random();
	        String e = String.valueOf( alphabet.charAt(r.nextInt(alphabet.length())));
			p.push(e);
		}
		int tamanho = p.size();
		System.out.println("Tamanho de pilha: " + tamanho);

		String top; // codigo para o topo

		try {
			top = p.top();
			System.out.println(top);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < TotalNos; i++) {
			try {
				String valor = p.pop();
				System.out.println("Pop: " + valor);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			vazia = p.isEmpty();
			System.out.println("Vazia: " + vazia);

		}
	}

}
