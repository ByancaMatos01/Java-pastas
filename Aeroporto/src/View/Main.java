package View;

import java.util.concurrent.Semaphore;

import Controller.Aeroporto;

public class Main {

	public static void main(String[] args) {
	 int permissoes=2;
	 Semaphore pista=new Semaphore(permissoes);
	 Semaphore sul= new Semaphore(1);
	 Semaphore norte=new Semaphore(1);
	 
	 for (int idaviao=0; idaviao<12; idaviao++) 
	 {
		Thread Aeroporto = new Aeroporto(idaviao, pista, sul,norte);
		Aeroporto.start();
		
	 }

	}

}
