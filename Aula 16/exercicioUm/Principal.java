package exercicioUm;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String nome,cpf,comprar,pagar;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome");
		nome=leia.next();
		
		System.out.println("Digite seu cpf");
		cpf=leia.next();
		
		Cliente cliente1= new Cliente(nome,cpf);
		
		comprar = cliente1.Comprar();
		pagar = cliente1.Pagar();
		cliente1.imprimir();
		System.out.println(comprar);
		System.out.println(pagar);
		

	}

}
