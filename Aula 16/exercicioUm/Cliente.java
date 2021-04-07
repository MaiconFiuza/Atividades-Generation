package exercicioUm;

/*
 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console. 
 */


public class Cliente {

	//Atributos 
	private String nome;
	private String cpf;
	
	//Construtor
	public Cliente(String nome,String cpf) {
		this.nome=nome;
		this.cpf=cpf;
	}
	
	public Cliente() {}

	
	//Getter e Setter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	//Métodos
	//String usar=Cliente.this.nome();
	
	public String Pagar() {
		return "Você realizou um pagamento";
	}
	
	public String Comprar() {
		return "Você realizou uma compra"; 
	}
	
	public void imprimir() {
		System.out.println("Meu nome é "+nome);
		System.out.println("Meu cpf é "+cpf);
	}
	
}
