package view;

import java.util.concurrent.Semaphore;
import controller.Exerciciotreino;
public class Principal {
	
	public static void main(String args[]) {
		
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		for(int i = 0; i <=10; i++) {
			Exerciciotreino t = new Exerciciotreino (i, semaforo);
			t.start();
			
			
		}
		
		
	}

}
