package exercicios;

import java.util.Scanner;

public class Dois {

	public static void main(String[] args) {
		
		int quantPar=0, quantImpar=0,num;
		
		var leia = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("\nDigite um n�mero inteiro: ");
			num=leia.nextInt();
			
			if(num%2==0) {
				quantPar++;
			}
			else {
				quantImpar++;
			}
		}
		
		System.out.println("A quantidade de n�meros impares foi "+quantImpar);
		System.out.println("A quantidade de n�meros pares foi "+quantPar);
		
	}

}
