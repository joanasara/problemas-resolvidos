package uri;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMedia{
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y, med;

		System.out.println("ENTRE COM O PRIMEIRO NUMERO");
		x = sc.nextDouble();
		System.out.println("ENTRE COM O SEGUNDO NUMERO");
		y = sc.nextDouble();

		med = (x * 3.5 + y * 7.5) / 11.0;

		System.out.printf("MEDIA = %.2f\n", med);

		sc.close();
		
		
		
		
		
		
		
	}
}
