
public class Preguica extends Animal implements Habitos {
	
	private String comer;
	
	public Preguica(String nome, int idade, String comer) {
		super(nome,idade);
		this.comer=comer;
	}
	
	@Override
	public void subirEmArvore() {
		System.out.println("Tó subindo, mas perai que bateu uma preguiçaaaaaaaaaa");		
	}


	@Override
	public void Correr() {
		System.out.println("Não fazemos isso aqui");
	}


	@Override
	public void EmitirSom() {
		System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
	}
}
