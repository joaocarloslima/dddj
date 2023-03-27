
public class App {
	public static void main(String[] args) {
		Aluno joao = new Aluno("Joao Carlos"); 
		Aluno maria = new Aluno();
		// cria objeto - instanciar objetos
		
		joao.nome = "Joao Carlos";
		joao.setNotaCp1(-10);
		joao.setNotaCp2(8);
		joao.situacao = "Reprovado";
		joao.reponderChamada();
		double mediaJoao = joao.calcularMedia();
		System.out.println("Media do Joao " + mediaJoao);
		System.out.println("Situacao do Joao " + joao.getSituacao());
		
//		maria.nome = "Maria da Silva";
//		maria.notaCp1 = 9;
//		maria.notaCp2 = 10;
//		maria.reponderChamada();
//		System.out.println("Media da Maria " + maria.calcularMedia() );
	}
}
