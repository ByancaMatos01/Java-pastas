package p1;
/*
 * Faça um programa que mostre as tabuadas dos números de 1 a 10 usando laços de repetição.
 */
public class Exerc2 {
public static void main (String args[]) {
	int n,result;
	n=1;
	for(int i1=1;i1<=10;i1++) {		
		for(int j=1;j<=10;j++) {
			result=i1*j;
			System.out.println(i1+" X "+j+" = "+result);
		}
	}
}
}