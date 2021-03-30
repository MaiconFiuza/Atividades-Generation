package exercicios;

import java.util.Scanner;

public class quatro {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		float media;
		
		var leia = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		n1=leia.nextInt();
		System.out.println("Digite outro valor: ");
		n2=leia.nextInt();
		System.out.println("Digite mais um valor: ");
		n3=leia.nextInt();
		
		media=(n1+n2+n3)/3;
		
		System.out.println("A média é : "+media);
		

	}

}
