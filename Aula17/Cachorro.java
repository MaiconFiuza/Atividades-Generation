
public class Cachorro extends Animal {
	
	private String comer;
	
	public Cachorro(String nome, int idade, String comer) {
		super(nome,idade);
		this.comer=comer;
	}

	@Override
	public void Correr() {
		System.out.println("Estou correndo");
	}

	@Override
	public void EmitirSom() {
		System.out.println("AU AU AU AU ");
	}
	
	
	
	
	
}
