import java.util.Scanner;

public class PortalFiap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o nome");
		String nome = in.nextLine();
		double nota = 0;
		double soma = 0;
		double qtde = -1;
		
		while(nota >= 0) {
			soma = soma + nota;
			qtde = qtde + 1;				
			System.out.println("Digite uma nota");
			nota = in.nextDouble();
		}
		in.close();
		
		double media = soma / qtde;
		
		System.out.println("Media do aluno " + nome + " " + media);
		
	}
}
