
public class DiaDaSemana {
	public static void main(String[] args) {
		int dia = 0;

		if (dia == 0) {
			System.out.println("domingo");
		} 
		if (dia == 1) {
			System.out.println("segunda");
		}
		if (dia == 2) {
			System.out.println("terça");
		} 
		if (dia == 3) {
			System.out.println("quarta");
		} 
		if (dia == 4) {
			System.out.println("quinta");
		} 
		if (dia == 5) {
			System.out.println("sexta");
		} 
		if (dia == 6) {
			System.out.println("sabado");
		}
		
		
		switch (dia) {
		case 0:
			System.out.println("domingo");
			break;
		case 1:
			System.out.println("segunda");
			break;
		case 2:
			System.out.println("terca");
			break;	
			
		default:
			System.out.println("dia inválido");
			break;
		}
		
		
		
		
	}

}
