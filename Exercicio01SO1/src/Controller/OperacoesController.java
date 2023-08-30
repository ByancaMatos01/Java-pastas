package Controller;

public class OperacoesController {

		
	public OperacoesController() {
		super();
	}
	public void concatenaString() {
		String cadeia="0";
		int [] vetornum=new int [100000];
		int leghth=vetornum.length;
		double TempoInicial = System.nanoTime(); //<cltr +1 //
		for(int i=0; i<vetornum.length; i++) {
			cadeia=cadeia+"0";
			
		}
		double tempoFinal=System.nanoTime();
		double tempoTotal = tempoFinal-TempoInicial;
		tempoTotal=tempoTotal/Math.pow(10,9);
		System.out.println("String ===>"+tempoTotal+"s.");
	}

public void concatenaBuffer() {
	StringBuffer buffer =new StringBuffer();
	int [] vetornum=new int [100000];
	int leghth=vetornum.length;
	double TempoInicial = System.nanoTime(); //<cltr +1 //
	for(int i=0; i<vetornum.length; i++) {
		buffer.append("0");
}
	double tempoFinal=System.nanoTime();
	double tempoTotal = tempoFinal-TempoInicial;
	tempoTotal=tempoTotal/Math.pow(10,9);
	System.out.println("Buffer ===>"+tempoTotal+"s.");


}

}