package view;

import java.util.Scanner;

import controller.ConvertController;

public class principal {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	ConvertController c = new ConvertController();
	int num;
	System.out.println("Insira um valor decimal");
	num=input.nextInt();
	while(num>1000);
	c.DecTobin(num);
	input.close();
}
}