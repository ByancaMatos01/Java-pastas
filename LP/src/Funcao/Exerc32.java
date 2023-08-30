package Funcao;
import java.util.Scanner;
public class Exerc32 {
public static void main (String args []) {
	int n;
	Scanner leia= new Scanner (System.in);
	System.out.println("Digite o valor de n");
	n=leia.nextInt();
	System.out.println("O resultado do fatorial é "+ Ffat(n));
}

static int Ffat(int num) {
	int cta, fat =1;
	for(cta=1; cta<=num;cta++) {
		fat=fat*cta;
		
	}
	return fat;

}
}