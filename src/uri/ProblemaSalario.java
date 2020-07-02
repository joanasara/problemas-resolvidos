package uri;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;
       System.out.println("entre com o numero ");
	    numero = sc.nextInt();
	    System.out.println("entre com as horas");
	    horas = sc.nextInt();
	    System.out.println("entre com o valor da hora");
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
