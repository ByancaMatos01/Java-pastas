package Matriz;
import javax.swing.*;
public class campeão {

	public static void main(String[] args) {
		int campeao =0;
		int []valor=new int [10];
		int vice = 0;
		
		for(int i=0;i<10;i++) {
			valor[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida: "));
			if(i==0) {
				campeao=i;
				vice=i;
			}
			if (valor[i] > campeao) {
				vice = campeao;
				campeao = valor[i];
				}
			else if (valor[i] > vice) {
				vice = valor[i];
				}
		
	}
		System.out.println("O campeão de venda é: "+ campeao);
		System.out.println("O vice campeão de venda é: "+ vice);
}
}