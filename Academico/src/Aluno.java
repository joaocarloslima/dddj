
public class Aluno {
	
	//atributos
	private String nome;
	private double notaCp1;
	private double notaCp2;
	double qtdeDeFaltas;
	double frequencia;
	double mediaFinal;
	private String situacao = "Aprovado";
	
	public Aluno(String nomeDoAluno) {
		nome = nomeDoAluno;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setNotaCp1(double valor) {
		if(valor < 0) {
			System.err.println("nota invalida");
			return;
		}
		notaCp1 = valor;
	}
	
	public void setNotaCp2(double valor) {
		notaCp2 = valor;
	}
	
	
	//metodos
	public void reponderChamada(){
		System.out.println(nome + " esta presente");
	}
	
	public double calcularMedia() {
		return (notaCp1 + notaCp2) / 2;
	}
	
	

}
