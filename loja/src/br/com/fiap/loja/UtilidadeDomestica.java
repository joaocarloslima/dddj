package br.com.fiap.loja;

public class UtilidadeDomestica extends Produto {
	
	String setor;

	public UtilidadeDomestica(String nome, double preco, int quantidade, String setor) {
		super(nome, preco, quantidade);
		this.setor = setor;
	}

	@Override
	public double getPrecoMinimo() {
		return getPreco() * 0.95;
	}

}
