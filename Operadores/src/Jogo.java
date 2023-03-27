
public class Jogo {

	public static void main(String[] args) {
		
		int qtdeDeVidas = 3;
		int xp = 15;
		boolean temEspada = true;
		boolean temMagia = false;
		
		
		qtdeDeVidas = qtdeDeVidas - 1;
		qtdeDeVidas--;
		//qtdeDeVidas -= 1;
		
		
		boolean acabouOJogo = qtdeDeVidas <= 0;
		boolean temExperiencia = xp >= 10;
		boolean podeAtacar = (temEspada || temMagia) && temExperiencia && !acabouOJogo;
			
		System.out.println("Qtde de Vidas = " + qtdeDeVidas);
		
		String msg = acabouOJogo ? "Game Over" : "Segue o jogo";
		System.out.println(msg);
		
		String msgAtacar = podeAtacar ? "Pode atacar": "Não pode atacar";
		System.out.println(msgAtacar);

	}	

}
