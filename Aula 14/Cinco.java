package exercicios;

import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {
		
		int num,soma=0;
		
		var leia = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número");
			num=leia.nextInt();
			soma+=num;
			
		}while(num!=0);
		
		System.out.println("A soma dos números é: "+soma);
	}

}
