package exercicios;

import java.util.Scanner;

public class Dois {

public static void main(String[] args) {
		
		int n1,n2,n3;
		int[] resultado = new int[3];
       
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		n1=leia.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		n2=leia.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		n3=leia.nextInt();
		
		if (n1>n2 && n2>n3 && n1>n3) {
			resultado[0]=n1;
			resultado[1]=n2;
			resultado[2]=n3;
			
			for(int i=0;i<3;i++) {
				System.out.println(resultado[i]);
			}
			
		}
		else if(n1>n2 && n3>n2 && n1>n3) {
			resultado[0]=n1;
			resultado[1]=n3;
			resultado[2]=n2;
			
			for(int i=0;i<3;i++) {
				System.out.println(resultado[i]);
			}
			
			
		}
		else if(n2>n1 && n1>n3 && n2>n3) {
			resultado[0]=n2;
			resultado[1]=n1;
			resultado[2]=n3;
			
			for(int i=0;i<3;i++) {
				System.out.println(resultado[i]);
			}
			
			
		}
		else if(n2>n1 && n3>n1 && n2>n3) {
			resultado[0]=n2;
			resultado[1]=n3;
			resultado[2]=n1;
			
			for(int i=0;i<3;i++) {
				System.out.println(resultado[i]);
			}
			
			
		}
		else if(n3>n1 && n2>n1 && n3>n2) {
			resultado[0]=n3;
			resultado[1]=n2;
			resultado[2]=n1;
			
			for(int i=0;i<3;i++) {
				System.out.println(resultado[i]);
			}
			
		}
		else if(n3>n1 && n1>n2 && n3>n2) {
			resultado[0]=n3;
			resultado[1]=n1;
			resultado[2]=n2;
			
			for(int i=0;i<3;i++) {
				System.out.println(resultado[i]);
			}
			
		}
		else {
			System.out.println("Há numeros iguais");
		}
		
		
	}
	
	
}
