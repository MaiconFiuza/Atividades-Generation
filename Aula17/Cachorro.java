
public class Cachorro extends Animal {
	
	private String comer;
	
	public Cachorro(String nome, int idade, String comer) {
		super(nome,idade);
		this.comer=comer;
	}
	
	
	public String Latir() {
		return "AU AU AU AU AU";
	}
	
	public String Correr() {
		return "Cachorro está correndo";
	}
	
}
