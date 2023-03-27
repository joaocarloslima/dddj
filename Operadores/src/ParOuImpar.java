import javax.swing.JOptionPane;

public class ParOuImpar {
	
	public static void main(String[] args) {
		
		int numero;
		boolean ehPar;
		String msg;
		int resposta = 0;
		
		while(resposta == JOptionPane.YES_OPTION ) {
			numero = Integer.valueOf( JOptionPane.showInputDialog("Digite um numero") );
			ehPar = numero % 2 == 0;
			msg = ehPar ? "É par" : "É ímpar";
			JOptionPane.showMessageDialog(null, msg);		
			resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			//System.out.println(resposta);
		}
		
	
//		if(ehPar) {
//			JOptionPane.showMessageDialog(null, "É par");		
//			return;
//		}
//			
//		JOptionPane.showMessageDialog(null, "É ímpar");
		
		
		
	}

}
