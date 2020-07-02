package uri;

import java.util.Locale;
import java.util.Scanner;

public class Media01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, med;
		System.out.println("DIGITE O PRIMEIRO VALOR");
		nota1 = sc.nextDouble();
		System.out.println("DIGITE O SEGUNDO VALOR");
		nota2 = sc.nextDouble();
		System.out.println("DIGITE O TERCEIRO VALOR");
		nota3 = sc.nextDouble();
		
		med = (nota1*2.0+nota2*3.0+nota3*5.0) / 10.0;
		
		System.out.printf("MEDIA = %.1f\n", med);		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
