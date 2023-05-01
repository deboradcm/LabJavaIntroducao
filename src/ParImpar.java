import java.util.Scanner;
public class ParImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int cont = 0;
		
		
		while (cont != -1){
			cont = scan.nextInt();
			if (cont % 2 == 0) {
				System.out.println("PAR");
				
			} else if (cont % 2 != 0 && cont != -1) {
				System.out.println("IMPAR");
			}
			
		    
		}
		
		

		
		
		
			
		}
		
		

}
