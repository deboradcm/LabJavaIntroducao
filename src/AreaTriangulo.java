import java.util.Scanner;

public class AreaTriangulo {
	public static void main (String args[]) {
		Scanner teclado = new Scanner (System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		float s = ((a+b+c)/2);
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		if(a+b<=c || a+c<=b || b+c<=a) {
			System.out.printf("Triangulo invalido");
			
		} else {
			System.out.printf("%.2f",area);
			
		}
		
		
		
		
	}

}
