package exercicios;

import java.util.Scanner;

public class Quatro {
	
	public static void main(String[] args) {
		
		int continuar=1,idade,sexo,estado,nCalmo=0,nMNervoso=0,
				nHAgressivo=0,nOCalmos=0,nMais40=0,nMenos18=0;
		
		var leia= new Scanner(System.in);
		
		while(continuar<10) {
			
			System.out.println("\nDigite sua idade");
			idade=leia.nextInt();
			
			System.out.println("\nQual seu sexo ? Digite:\n1 - feminino\n2 - masculino\n3 - outros");
			sexo=leia.nextInt();
			
			System.out.println("\nQual o seu estado ? Digite:\n1 - calmo\n2 - nervoso \n3 - agressivo ");
			estado=leia.nextInt();
			
			if(estado==2) {
				nCalmo++;
			}
			if(sexo==1 && estado==2) {
				nMNervoso++;
			}
			if(sexo==1 && estado==3 ) {
				nHAgressivo++;
			}
			if(sexo==3 && estado==1) {
				nOCalmos++;
			}
			if(idade>40 && estado==2) {
				nMais40++;
			}
			if(idade<18 && estado==1) {
				nMenos18++;
			}
			
			continuar++;
		}
		System.out.println("o número de pessoas calmas "+nCalmo);
		System.out.println("o número de mulheres nervosas "+nMNervoso);
		System.out.println("o número de homens agressivos "+nHAgressivo);
		System.out.println("o número de outros calmos "+nOCalmos);
		System.out.println("o número de pessoas nervosas com mais de 40 anos "+nMais40);
		System.out.println("o número de pessoas calmas com menos de 18 anos "+nMenos18);
		
		
	}
	
}
