package exercicios;

import java.util.Scanner;

public class Dois {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		num=leia.nextInt();
		
		System.out.println("N�mero digitado: "+num);
		num--;
		System.out.println("Antecessor do n�mero: "+num);
		num+=2;
		System.out.println("Sucessor do n�mero: "+num);
		
	}
	

}
