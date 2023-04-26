package br.com.fiap.loja;

public final class Livro extends Produto{
	
	private String autor;
	private final static String TIPO = "Livro";

	public Livro(String nome, double preco, int quantidade, String autor) {
		super(nome, preco, quantidade);
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return 
				String.format("[%s] ", TIPO) + 
				super.toString() + 
				String.format(" - %s", autor);
	}

	
	public final double getPrecoMinimo() {
		return getPreco() * 0.8;
	}
	
}
