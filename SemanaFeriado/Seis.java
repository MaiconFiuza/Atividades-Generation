package exercicios;

import java.util.Scanner;

	public class Seis {
	
		public static void main(String[] args) {
		
			float saldo, reajuste;
		
			var leia = new Scanner(System.in);
		
			System.out.println("Digite o saldo");
			saldo=leia.nextFloat();
		
			reajuste=saldo-(0.09f*saldo);
		
			System.out.printf("O valor final com reajuste é %2.2f",reajuste);
		
	}
	
	
}
