package exercicios;

import java.util.Scanner;

public class Cinco {
	
	public static void main(String[] args) {
		
		float saldo, reajuste;
		
		var leia = new Scanner(System.in);
		
		System.out.println("Digite o saldo");
		saldo=leia.nextFloat();
		
		reajuste=(0.01f*saldo)+saldo;
		
		System.out.printf("O valor final com reajuste � %2.2f",reajuste);
		
	}
	
}
