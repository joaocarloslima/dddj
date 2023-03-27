import java.util.Locale;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// peso / altura^2
		// declaração de variáveis ✅
		double peso;
		double altura;
		
		// ler o valores ✅
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Digite o peso: ");
		peso = in.nextDouble();
		System.out.print("Digite a altura: ");
		altura = in.nextDouble();
		in.close();
		
		// calcular o IMC ✅
		double imc = peso / Math.pow(altura, 2);
		
		//mostrar o imc ✅
		System.out.println("o IMC vale " + imc);

	}

}
