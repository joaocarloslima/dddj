package br.com.fiap.loja;

public class Vestuario extends Produto {

	private String tamanho;
	private String cor;
	private String tipo = "Vestuário";
	
	public Vestuario(String nome, double preco, int quantidade, String tamanho, String cor) {
		super(nome, preco, quantidade);
		this.tamanho = tamanho;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return 
				String.format("[%s] ", tipo) + 
				super.toString() + 
				String.format(" - %s %s", tamanho, cor);
	}

	@Override
	public double getPrecoMinimo() {
		if (estaComEstoqueBaixo()) 
			return getPreco() * 0.7;
		
		return getPreco();
	}
	
}
