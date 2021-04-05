package exercicios;

public class Um {
	
	public static void main(String[] args) {
		
		System.out.println("Números entre 1000 e 1999 que divididos por 11 tem o resto 5 :");
		
		for(int i=1000;i<=1999;i++) {
			if( i%11==5) {
				System.out.println(i);
			}
		}
		
	}
	
}
