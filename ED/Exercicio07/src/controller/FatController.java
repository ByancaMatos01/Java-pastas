package controller;

import br.com.byancamatos.pilhaint.Pilha;

public class FatController {

	public  void Fatorial (int num) throws Exception {
		Pilha p=new Pilha();
		for(int i = num ; i > 0; i--){
		if(p.isEmpty()){
		p.push(i);
		}else{
		   int ultimonumero = p.pop();
		  p.push(ultimonumero * i);
		}
		}

		int result = p.pop();
		System.out.println("fatorial = " +result);
		
			
		}
		
}


	
	