import java.util.Scanner;

public class CheckPoint {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double media = 0; 
		double menorNota = 0;
		double soma = 0;
		
//		for(int i = 0; i < 3; i++) {
//			double nota = in.nextDouble();
//			if(nota < menorNota) menorNota = nota;
//			soma += nota;
//		}
		
		double nota1 = in.nextDouble();
		double nota2 = in.nextDouble();
		double nota3 = in.nextDouble();
		
		menorNota = Math.min(Math.min(nota1, nota2), nota3);

		media = (nota1 + nota2 + nota3 - menorNota) / 2;
		
		System.out.println(media);
		
		in.close();
	}
}
