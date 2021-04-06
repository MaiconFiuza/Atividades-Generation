package exercicios;

public class Tres {

	public static void main(String[] args) {
		
		int[][] matriz = {{2,74},{11,4}};
		int maior=0;
		
		for(int linha=0;linha<matriz.length;linha++) {
			for(int coluna=0; coluna<matriz.length;coluna++) {
				
				if(matriz[linha][coluna]>10) {
					maior++;
				}
				
			}
		}
		
		System.out.println("A quantidade de número na matriz maior do que dez são: "+maior);

	}

}
