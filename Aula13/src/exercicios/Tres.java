package exercicios;

import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		idade=leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Infantil ");
		}
		else if(idade>14 && idade<=17)
		{
			System.out.println("Juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("Adulto");
		}
		else {
			System.out.println("Você está fora do escopo de idade do programa :(");
		}

	}

}
