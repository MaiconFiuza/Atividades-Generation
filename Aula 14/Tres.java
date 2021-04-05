package exercicios;

import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		
		int idade=0,totalMaior=0,totalMenor=0;
		
		var leia = new Scanner(System.in);
		
		while(idade!=-99) {
			
			System.out.println("Digite uma idade");
			idade=leia.nextInt();
			
			if(idade<21 && idade>=1) {
				totalMenor++;
			}
			else if(idade>50) {
				totalMaior++;
			}
		}
		
		System.out.println("O total de pessoas que tem mais de 50 anos é "+totalMaior);
		System.out.println("O total de pessoas que tem menos de 21 anos é "+totalMenor);
	}

}
