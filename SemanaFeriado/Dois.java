package exercicios;

import java.util.Scanner;

public class Dois {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número");
		num=leia.nextInt();
		
		System.out.println("Número digitado: "+num);
		num--;
		System.out.println("Antecessor do número: "+num);
		num+=2;
		System.out.println("Sucessor do número: "+num);
		
	}
	

}
