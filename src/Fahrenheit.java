import java.util.Scanner;
import java.io.IOException;
public class Fahrenheit {
	public static void main (String Args[]) {
		Scanner teclado = new Scanner (System.in);
		float c = teclado.nextInt();
		float f = ((9*c)/5)+32;
		
		System.out.printf("%.1f",f);
	}

}
