package exercicioTres;

public class Principal {

	public static void main(String[] args) {
		
		ProdutoEletronico celular1 = new ProdutoEletronico("Celular","220W","Motorola",false);
		celular1.Ligar();
		celular1.Imprimir();
		celular1.Desligar();
		celular1.Imprimir();
		
		
	}

}
