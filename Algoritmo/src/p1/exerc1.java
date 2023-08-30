package p1;
import java.util.Scanner;
/*
 *  Faça um programa que receba um número e 
 *  usando laços de repetição calcule e mostre a tabuada desse número.
 */
public class exerc1 {

	public static void main(String[] args) {
		int n,num,result;
		n=1;
		Scanner leia=new Scanner(System.in);
		System.out.println("digite o valor de num");
		num=leia.nextInt();
		while(n<=10) {
			result=num*n;
			n++;
			System.out.println("O resultado é "+result);
		}

	}

}
