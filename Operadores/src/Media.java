import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// declaração de variáveis ✅
		int numero1;
		int numero2;
		
		// ler o valores ✅
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		numero1 = in.nextInt();
		System.out.print("Digite o segundo numero: ");
		numero2 = in.nextInt();
		in.close();
		
		// calcular a média ✅
		double media = (numero1 + numero2) / 2.0;
		
		//mostrar a média ✅
		System.out.println("a media vale " + media);

	}

}
