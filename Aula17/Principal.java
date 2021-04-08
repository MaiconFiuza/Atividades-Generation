
public class Principal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Cachorrinho fdp",1,"Sim");
		System.out.println(dog.Correr());
		System.out.println(dog.Latir());
		
		Preguica peg = new Preguica("Eu domingo de manhã",1,"Sim");
		System.out.println(peg.EmitirSom());
		System.out.println(peg.subriEmArvore());
		
		Cavalo cav = new Cavalo("Lindao",1);
		System.out.println(cav.Correr());
		System.out.println(cav.Som());
		
		

	}

}
