package exercicios;

import java.util.Scanner;

public class Tres {
	
	public static void main(String[] args) {
		
		int valor;
		float reajuste;
		
		var leia = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		valor=leia.nextInt();
		
		reajuste= (0.1f*valor)+valor;
		System.out.println("O valor reajustado para 10% "+reajuste);
		
	}

}
