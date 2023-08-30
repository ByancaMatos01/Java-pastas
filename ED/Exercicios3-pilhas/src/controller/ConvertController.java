package controller;

import br.com.byancamatos.pilhaint.Pilha;

public class ConvertController {

	public void DecTobin(int var) {
		
		Pilha pilha=new Pilha(); // cria uma pilha 
		
		while((double)var>0) { /// enquanto o número for maior que 0
					pilha.push(var % 2); // binário recebe valor mod 2;
			var /= 2; // valor = valor /2;
		}
		System.out.println("Valor convertido");
		while(!pilha.isEmpty()) 
		{
			try {
				System.out.println(String.valueOf(pilha.pop()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


	
	
