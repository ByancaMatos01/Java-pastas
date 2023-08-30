package br.com.byancamatos.pilhaint;

public class Pilha {
	No topo;
	  
	  public Pilha() {
		  topo=null; //  topo é vazio
	  }
	  
	  public boolean isEmpty() {
		  if(topo==null) { // se topo é vazio ?
			  return true; // retorna verdadeiro
			  
		  }else { // senão retorna falso
			  return false;
		  }
	  }
	  
	  public void push(int e ) { //empilhar passa um paramentro inteiro
		  No elemento=new No(); // criando um no
		  elemento.dado=e; // colocando um elemento nele 
		  if(isEmpty()) { // se a pilha ta vazia?
			  topo=elemento; // no topo passa ser o elemento 
			  
		  }else { //senão 
			  elemento.proximo=topo; // proximo aponto pra o  topo e vira novo topo
			  topo=elemento;//topo passa a pontar para antigo 
			  
		  }
	  }
	  public int pop() throws Exception {
		  if(isEmpty()) {
			  throw new Exception("Não há elementos para  desempilhar");
			  
		  }
		  int valor=topo.dado;
		  topo=topo.proximo;
		  return valor;
	  }
	  public int top() throws Exception {
		  if(isEmpty()) {
			  throw new Exception("Não há elementos na pilha");
			  
		  }
		   int valor=topo.dado;
		   return valor;
	  }
	  public int size() {
		  int cont=0;
		  if(!isEmpty()) {
			  No auxiliar=topo;
			  cont=1;
			  while(auxiliar.proximo!=null) {
				  auxiliar=auxiliar.proximo;
				  cont++;
			  }
		  }
		  return cont;
	  }
	}

