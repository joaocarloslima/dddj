import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		//declarar as variáveis ✅
		int numero1;
		int numero2;
		int soma;
		
		//ler os dois números ✅
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = leitor.nextInt();
		leitor.close();
		
		//somar ✅
		soma = numero1 + numero2;
		
		//mostrar a soma - A soma de X com Y vale Z
		System.out.println(
				"A soma de " + numero1 + " com " + numero2 + " vale " + soma
			);
		
		String msg = String.format("A soma de %s com %s vale %s", 
										numero1, 
										numero2, 
										soma);
		System.out.println(msg);

	}

}
