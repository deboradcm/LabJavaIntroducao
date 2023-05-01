import java.util.Scanner;
public class SomaDigitos {
	public static void main (String args[]) {
	
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		int n = 0;
		int soma = 0;
		
		
		
		while (numero > 0) {
			int resto = numero % 10;
			numero = (numero - resto)/10;
			soma = soma+resto;
			
			
			n = n+1;
		}
		System.out.println(soma);
		
	}
	
}
