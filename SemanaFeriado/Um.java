package exercicios;

public class Um {
	
	public static void main(String[] args) {
		
		final int n1=8,n2=9,n3=7,n4=4,n5=5,n6=6;
		float media,soma,mediaMedia;
		
		media=(n1+n2+n3)/3;
		System.out.printf("a média dos valores 8, 9 e 10 é %2.2f",media);
		
		soma=media;
		
		media=(n4+n5+n6)/3;
		System.out.printf("\na média dos valores 4, 5 e 6 é %2.2f",media);
		
		soma+=media;
		System.out.printf("\na média das somas é %2.2f",soma);
		
		mediaMedia=soma/2;
		System.out.printf("\na média da média é %2.2f",mediaMedia);
		
	}
	
}
