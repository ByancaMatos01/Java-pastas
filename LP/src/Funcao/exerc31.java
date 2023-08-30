package Funcao;
import java.util.Scanner;
public class exerc31 {
public static void main (String args []) {
	int n;
	Scanner leia=new Scanner(System.in);
	for(n=10; n<=150; n++) {
		System.out.println("O resultado é: "+ Fquad(n));
	}
}

 static int Fquad(int n) {
	 int quad;
	 quad=0;
	 quad=(n*n);
	 return quad;
 }
}