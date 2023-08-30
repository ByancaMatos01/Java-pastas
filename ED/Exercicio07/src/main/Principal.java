package main;

import java.util.Scanner;

import controller.FatController;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		FatController fat=new FatController();
		Scanner leia= new Scanner(System.in);
		int num;
		System.out.println("Digite um número");
		num=leia.nextInt();
		while(num>=11) {
			System.out.println("Valor inválido digite novamente");
			num=leia.nextInt();
			
		}
		
		fat.Fatorial( num);
	}

}
