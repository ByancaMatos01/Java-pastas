package controller;

import java.util.concurrent.Semaphore;

public class Exerciciotreino extends Thread{
	
	private int idThread;
	private Semaphore semaforo;
	private static int res = 1;
	
	public Exerciciotreino (int idThread, Semaphore semaforo){
		this.idThread = idThread;
		this.semaforo = semaforo;
		
	}
	
	public void run() {
		try {
			semaforo.acquire();
			calcula();
		}catch (InterruptedException e ) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
		
	}
	
	public void calcula() {
		int valor = 0;
		while (res > 0 && valor <= 10) {
			res = res + valor * idThread;
			valor ++;
		}
		System.out.println(+res + " valor: " + valor +" idthread: " + idThread);
	
		
		
	}
}
