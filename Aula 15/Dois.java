package exercicios;

import java.util.Scanner;

public class Dois {

	public static void main(String[] args) {
		
		int[] val= new int[6];
		int impar=0,par=0;
		
		var leia = new Scanner(System.in);
		
		for(int i=0; i<val.length;i++) {
			System.out.println("\nDigite um valor inteiro :  ");
			val[i]=leia.nextInt();
			
			if(val[i]%2==0) {
				par++;
			}
			else {
				impar++;
			}
			
		}

		System.out.println("Foram digitados "+par+" números pares");
		System.out.println("Foram digitados "+impar+ " números impares");
		
	}

}
