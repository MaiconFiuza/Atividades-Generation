package exercicioTres;

public class ProdutoEletronico {

	private String tipo;
	private String voltagem;
	private String modelo;
	private boolean ligado;
	
	public ProdutoEletronico(String tipo,String voltagem,String modelo, boolean ligado) { 
		this.tipo=tipo;
		this.modelo=modelo;
		this.voltagem=voltagem;
		this.ligado=ligado;
	}
	
	public boolean Ligar()
	{
		if(this.ligado==false) {
			return ligado=true;
		}
		else {
			return ligado=false;
		}
		
	}
	
	public boolean Desligar()
	{
		if(this.ligado==true) {
			return ligado=false;
		}
		else {
			return ligado=true;
		}
		
	}
	
	public void Imprimir() 
	{
		System.out.println("O tipo do eletr�nico �: "+tipo+
				"\n a Voltagem do produto �: "+voltagem+"\n"+
				"O modelo do meu eletr�nico �: "+modelo+
				"\nEle est� ligado ? : "+ligado);
	}
	
}
