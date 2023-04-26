package br.com.fiap.loja;

public class App {
	
	public static void main(String[] args) {
		Livro livro = new Livro("DDD", 100, 4, "Erick Evans");
		Eletronico eletronico = new Eletronico("iPhone", 100_000_000.99, 2, "apple", "14pro");
		Vestuario vestuario =  new Vestuario("Blusinha", 10, 4, "P" , "branca");
		Livro livro2 = new Livro("Refatoração", 120, 12, "Martin Flowler");
		
		//Produto produto = new Produto("Produto genérico", 10, 1);
		
		System.out.println(livro);
		System.out.println(eletronico);
		System.out.println(vestuario);
		System.out.println(livro2);
		
		System.out.println(livro.getPrecoMinimo());
		System.out.println(eletronico.getPrecoMinimo());
		System.out.println(vestuario.getPrecoMinimo());
		
		System.out.println(Produto.getEstoqueMinimo());
		
	}

}
