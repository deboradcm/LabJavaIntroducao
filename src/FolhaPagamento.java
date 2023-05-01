import java.util.Scanner;
import java.io.IOException;

public class FolhaPagamento {
	public static void main (String args[]) {
		Scanner teclado = new Scanner(System.in);
		double valorHora=teclado.nextDouble();
		int hora = teclado.nextInt();
		
		double salarioBruto = hora*valorHora;
		System.out.println(String.format("Salario bruto: R$%.2f",salarioBruto));
		
		double impostoRenda = salarioBruto*(11/100f);
		System.out.println(String.format("IR: R$%.2f",impostoRenda));
		
		double inss = (8/100f)*salarioBruto;
		System.out.println(String.format("INSS: R$%.2f",inss));
		
		double descontos = inss+impostoRenda;
		System.out.println(String.format("Total de descontos: R$%.2f",descontos));
		
		double salarioliquido = salarioBruto-descontos;
		System.out.println(String.format("Salario liquido: R$%.2f",salarioliquido));
		
		
		
		
		
		
		
	}

}
