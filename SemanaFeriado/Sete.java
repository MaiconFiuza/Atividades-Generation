package exercicios;

import java.util.Scanner;

public class Sete {

	public static void main(String[] args) {
		
		float salLiquido,salBruto,valorHora,nAulas,resultado,desconto=0.14f;
		
		var leia = new Scanner(System.in);
				
		System.out.println("Digite o valor da Hora aula");
		valorHora=leia.nextFloat();
		
		System.out.println("Digite o n�mero de aulas dadas ");
		nAulas=leia.nextFloat();
		
		salLiquido=valorHora*nAulas;
		resultado=salLiquido*desconto;
		
		System.out.println("O resultado do sal�rio l�quido � : "+resultado);
		
		
	}
	
}
