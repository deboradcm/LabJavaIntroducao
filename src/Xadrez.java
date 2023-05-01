import java.util.Scanner;
public class Xadrez {
	public static void main (String args[]) {
		Scanner teclado = new Scanner(System.in);
		int quantidade = teclado.nextInt();
		String estrela = "";
		String estrela2 ="";
		int cont = 0;
		
		while(cont < quantidade/2) {
			for (var j = 0; j < quantidade; j++) {
				estrela2 = estrela2+"* ";	
			}
			System.out.print(estrela2);
			System.out.println("");
			
			for (var i = 0; i<quantidade; i++) {
				estrela = estrela+" *";	
			}
			System.out.print(estrela+"");
			System.out.println("");
			
			cont = cont+1;
			estrela = "";
			estrela2 = "";
			
		}
		
	}

}
