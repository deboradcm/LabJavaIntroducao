import java.util.Scanner;
public class ArteAscii {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("");
	    int numero = scan.nextInt();
	    String ast = "";
	    String ast2 = "*";
	    int cont = 0;
	    
	    
	    while(cont < numero) {
	    	
	    	for (var a = numero; a > cont; a--) {
				System.out.print(ast2);
				
			}
	    	
	    	cont = cont+1;
	    	System.out.println("");
	    	
	    }
	    
		
	    for (var i = 1; i <= numero; i++) {
	    	
	    	ast=ast+"*";
	    	System.out.println(ast);
	    	
	    }
	    
	}

}
