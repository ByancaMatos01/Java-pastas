package Controller;

public class OperacoesController {

		
	public OperacoesController() {
		super();
	}
	//Concatena 32768 caracteres 1 a 1 em um var. String
	public void concatenaString() {
		String cadeia="";
		double TempoInicial = System.nanoTime(); //<cltr +1 //
		for(int i=0; i<32768; i++) {
			cadeia=cadeia+"0";
			
		}
		double tempoFinal=System.nanoTime();
		double tempoTotal = tempoFinal-TempoInicial;
		tempoTotal=tempoTotal/Math.pow(10,9);
		System.out.println("String ===>"+tempoTotal+"s.");
	}
	
	// Concatena 32768 caracters 1 a 1 em um buffer de strings
	
	public void concatenaBuffer() {
		StringBuffer buffer =new StringBuffer();
		double TempoInicial = System.nanoTime(); //<cltr +1 //
		for(int i=0; i<32768; i++) {
			buffer.append("0");
	}
		double tempoFinal=System.nanoTime();
		double tempoTotal = tempoFinal-TempoInicial;
		tempoTotal=tempoTotal/Math.pow(10,9);
		System.out.println("Buffer ===>"+tempoTotal+"s.");
	
	
}
}






