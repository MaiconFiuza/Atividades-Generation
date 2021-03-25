package exercicios;

import java.util.Scanner;

public class Um {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		n1=leia.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		n2=leia.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		n3=leia.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.printf("O maior valor é "+ n1);
		}
		else if(n2>n1 && n2>n3 ) 
		{
			System.out.println("O maior valor é  "+ n2);
		}
		else if(n3>n1 && n3>n2 ) 
		{
			System.out.printf("O maior valor é "+n3);
		}
		else 
		{
			System.out.printf("Há dois ou mais números iguais");
		}

	}

}
