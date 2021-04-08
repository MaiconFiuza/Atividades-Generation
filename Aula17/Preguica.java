
public class Preguica extends Animal {
	
	private String comer;
	
	public Preguica(String nome, int idade, String comer) {
		super(nome,idade);
		this.comer=comer;
	}
	
	
	public String EmitirSom() {
		return "ZZZZZZZZZZZZZZZZ";
	}
	
	public String subriEmArvore() {
		return "to subindo, mas perai que bateu uma preguiça";
	}
}
