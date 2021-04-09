
public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome,idade);
	}
	
	@Override
	public void Correr() {
		System.out.println("Cavalgando");
	}
	
	@Override
	public void EmitirSom() {
		System.out.println("Riiiiiiiiiiiii");
	}

	
}
