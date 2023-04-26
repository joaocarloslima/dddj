package br.com.fiap.loja;

public abstract class Produto{
	
	private String nome;
	private double preco;
	private int quantidade;
	private final static int ESTOQUE_MINIMO = 5;
	
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		String dados = String.format("%s (%d): %.2f", nome, quantidade, preco);
		
		return (estaComEstoqueBaixo()) ? "!ESTOQUE BAIXO " + dados : dados;
			
	}
	
	public boolean estaComEstoqueBaixo() {
		return quantidade < ESTOQUE_MINIMO;
	}
	
	public abstract double getPrecoMinimo();

	public double getPreco() {
		return preco;
	}
	
	public static int getEstoqueMinimo() {
		return ESTOQUE_MINIMO;
	}
	
}
