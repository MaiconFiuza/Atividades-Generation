package exercicios;

import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {
		
		int num,soma=0,multiplo=0;
		float media;
		
		var leia = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número");
			num=leia.nextInt();
			if(num%3==0) {
				soma+=num;
				multiplo++;
			}
			
		}while(num!=0);
		
		media=soma/multiplo;
		System.out.println(soma);
		System.out.println("\nA soma dos números multiplos de três é : "+media);
	}
		
}
