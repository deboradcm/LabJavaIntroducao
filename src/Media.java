import java.io.IOException;
import java.util.Scanner;

public class Media {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.printf("");
		float num1 = scan.nextFloat();
		System.out.printf("");
		float num2 = scan.nextFloat();
		System.out.printf("");
		float num3 = scan.nextFloat();
		
		float media = (num1+num2+num3)/3;
		System.out.printf("%.2f",media);
	}

}
