package Controller;

import java.util.concurrent.Semaphore;

public class Aeroporto  extends Thread {
	private int ftempo=500;
	private int idaviao;
	private Semaphore pista;
	private Semaphore sul;
	private Semaphore norte;
	

	public Aeroporto(int idaviao, Semaphore pista, Semaphore sul, Semaphore norte) {
		
		this.idaviao = idaviao;
		this.pista = pista;
		this.norte = norte;
		this.sul = sul;
	}
	@Override
	public void run() 
	{
		try {
			pista.acquire();//semaforo para dois aviões circulando na pista
			aviaoManobrando();
			aviaoTaxiando();
			
			int pista = (int)((Math.random()*2)+1);//aleatoriza 1 para pistaNorte ou 2 para pistaSul
			if (pista == 1) {
				norte.acquire();
				aviaoDecolando(pista);
			} else {
				sul.acquire();
				aviaoDecolando(pista);
			}
			
			aviaoAfastando();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("O avião "+idaviao+" se afastou da área");
			pista.release();
			sul.release();
			norte.release();
		}
	
	}
	private void aviaoAfastando() {
		
		int tempo = (int)((Math.random()*6)+3)*ftempo;//aleatoriza um tempo entre 3 e 8 segundos
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		

	private void aviaoDecolando(int pista2) {
		
		if(pista2 == 1) {
			System.out.println("O avião "+idaviao+" está decolando pela pista Norte");
		} else {
			System.out.println("O avião "+idaviao+" está decolando pela pista Sul");
		}
		
		int tempo = (int)((Math.random()*4)+1)*ftempo;//aleatoriza um tempo entre 1 e 4 segundos
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	
	private void aviaoTaxiando() {
		
		System.out.println("O avião "+idaviao+" está taxiando");
		int tempo = (int)((Math.random()*6)+5)*ftempo;//aleatoriza um tempo entre 5 e 10 segundos
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	private void aviaoManobrando() {
		
		
		System.out.println("O avião "+idaviao+" está manobrando");
		int tempo = (int)((Math.random()*5)+3)*ftempo;	//aleatoriza um tempo entre 3 e 7 segundos
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
