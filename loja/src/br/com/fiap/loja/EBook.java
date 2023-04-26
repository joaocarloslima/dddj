package br.com.fiap.loja;

public class EBook extends Livro {

	public EBook(String nome, double preco, int quantidade, String autor) {
		super(nome, preco, quantidade, autor);
	}

	@Override
	public double getPrecoMinimo() {
		return super.getPrecoMinimo();
	}
	
	

}
