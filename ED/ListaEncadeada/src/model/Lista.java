package model;

public class Lista {
	No primeiro;
	public Lista() {
		primeiro=null;

	}

	public boolean isEmpty() {
		if(primeiro==null) {
			return true;
		}else {
			return false;
		}
	}
	public int size() {
		int cont=0;
		if(!isEmpty()) {
			No auxiliar=primeiro;
			while(auxiliar!=null) {
				cont++;
				auxiliar =auxiliar.proximo;
			}
		}
		return cont;
	}
	private No getNo(int pos) throws Exception{
		if(isEmpty()) {
			throw new Exception("Posição Inválida");
		}
		No auxiliar=primeiro;
		int cont=0;
		while(cont<pos) {
			auxiliar=auxiliar.proximo;
			cont++;
		}
		return auxiliar;
	}
	public void addFirst(int valor) {
		No elemento=new No();
		elemento.dado=valor;
		elemento.proximo=primeiro;
		primeiro=elemento;

	}
	public  void addLast(int valor ) throws Exception {
		int tamanho=size();

		if(isEmpty()) {
			throw new Exception("Lista Vazia");

		}
		No elemento=new No();
		elemento.dado=valor;
		elemento.proximo=null;
		
		
		No ultimo=getNo(tamanho-1);
		ultimo.proximo=elemento;

	}
	public void add(int valor, int posicao) throws Exception{
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}
		 int tamanho=size();
		 if(posicao <0 || posicao> tamanho ) {
			 throw new Exception("posição válida");
		 }
		 if(posicao==0) {
			 addFirst(valor);
		 }else if(posicao==tamanho) {
			 addLast(valor);
		 }else {
			 No elemento=new No();
			 elemento.dado=valor;
			 No anterior=getNo(posicao-1);
			 elemento.proximo=anterior.proximo;
			 
		 }
		}
	}
