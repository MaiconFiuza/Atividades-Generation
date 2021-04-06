package exercicios;

import java.util.Scanner;

public class Quatro {

	public static void main(String[] args) {
		
		int[][] m1= {{2,3,4},{5,6,8}};
		int[][] m2 = {{9,8,7},{10,11,33}};
		int[][] resultado= new int[3][3];
		int escolha,soma=0,sub=0;
		
		
		var leia = new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println("      Menu de opções          ");
		System.out.println("------------------------------");
		System.out.println("1   Somar as duas matrizes    ");
		System.out.println("2   subtrair a primeira matriz da segunda    ");
		System.out.println("3   adicionar uma constante as duas matrizes    ");
		System.out.println("4   Imprimir as matrizes      ");
		
		escolha=leia.nextInt();
		
		switch(escolha) {
			
			case 1:
				
				for(int linha=0;linha<m1.length;linha++) {
					for(int coluna=0;coluna<m1[linha].length;coluna++) {
						resultado[linha][coluna]=m1[linha][coluna]+m2[linha][coluna];
						soma+=resultado[linha][coluna];
					}
				}
				
				System.out.println("O resultado da soma é: "+soma);
					
				break;
			
			case 2:
				
				for(int linha=0;linha<m1.length;linha++) {
					for(int coluna=0;coluna<m1[linha].length;coluna++) {
						resultado[linha][coluna]=(m1[linha][coluna]-m2[linha][coluna]);
						sub+=resultado[linha][coluna];
					}
				}
				
				System.out.println("O resultado da subtração é :"+sub);
				
				break;
				
				
			case 3:
				
				for(int linha=0;linha<m1.length;linha++) {
					for(int coluna=0;coluna<m1[linha].length;coluna++) {
							m1[linha][coluna]=2;
							m2[linha][coluna]=2;
					}
				}
				
				System.out.println("Foi adicionado a constante 2");
				
				
				break;
				
			case 4:
	
				for(int linha=0;linha<m1.length;linha++) {
					for(int coluna=0;coluna<m1[linha].length;coluna++) {
							System.out.println(m1[linha][coluna]);
						}
					}
				
				
				for(int linha=0;linha<m1.length;linha++) {
					for(int coluna=0;coluna<m1[linha].length;coluna++) {
							System.out.println(m2[linha][coluna]);
						}
					}
				
				
				break;
				
			default:
				System.out.println("Você digitou uma posição invalida :/");
				
		}
	}

}
