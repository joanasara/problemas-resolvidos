package uri;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;
     
		System.out.println("DIGITE O PRIMEIRO VALOR");
	    A = sc.nextInt();
	    System.out.println("DIGITE O SEGUNDO VALOR");
	    B = sc.nextInt();
	    System.out.println("DIGITE O TERCEIRO VALOR");
	    C = sc.nextInt();
	    System.out.println("DIGITE O QUARTO VALOR");
	    D = sc.nextInt();

	    dif = A * B - C * D;

	    System.out.println("DIFERENCA = " + dif);	
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
