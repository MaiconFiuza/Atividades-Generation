package exercicios;

public class Um {

	public static void main(String[] args) {
		
		int[] val = {1,0,5,-2,-5,7};
		int sim =val[0]+val[1]+val[5];
		
		System.out.println("A soma das posições: val[0] = "+val[0]+", val[1] = "+val[1]+" e val[5] =  "+val[5]+" É igual a :"+sim);
		
		val[4]=100;
		
		for(int i=0;i<val.length;i++) {
			System.out.println(val[i]);
		}
		

	}

}
