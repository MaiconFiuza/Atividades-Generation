
public class Principal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Cachorrinho fdp",1,"Sim");
		dog.Correr();
		dog.EmitirSom();
		
		Preguica peg = new Preguica("Eu domingo de manhã",1,"Sim");
		peg.Correr();
		peg.EmitirSom();
		peg.subirEmArvore();
		
		Cavalo cav = new Cavalo("Lindao",1);
		cav.EmitirSom();
		cav.Correr();	

	}

}
