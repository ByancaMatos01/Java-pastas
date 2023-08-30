package recursiva;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args)
	{
		Scanner leia=new Scanner (System.in);
		 int num;
		 System.out.println("Digite um número");
		 num=leia.nextInt();
		 System.out.println("O resultado da serie é"  +Frecursiva(num));

	}
		static int Frecursiva(int n)
		{
			int s;
			if(n!=100) {
			s=n+Frecursiva(n+1)	;
			return s;
			}else {
				return n;	
			}
	
		}
}
