package Funcao;

import java.util.Scanner;
public class exerc33 {
public static void main (String args [] ) {
	int n;
	Scanner leia=new Scanner (System.in);
	System.out.println("Digite o valor de n");
	n=leia.nextInt();
	for(double i=1; i<=n; i++)
	{
		System.out.println("o resultado da serie é "+ Fserie(i));
		
	}
}
 static double Fserie(double num) {
	 double h=0;
	 
	 
	 return h=h+1/num;
	 
 }
}
