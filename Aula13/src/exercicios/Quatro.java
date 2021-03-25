package exercicios;

import java.util.Scanner;

public class Quatro {

	public static void main(String[] args) {
		
		float n,resultado;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite um número");
		n=leia.nextFloat();
		
		resultado=n%2;
		
		if(resultado!=0)
		{
			System.out.println("O número é impar ");
		}
		else {
			System.out.println("O número é par ");
		}
	}

}
