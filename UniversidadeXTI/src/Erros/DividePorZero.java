package Erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			
			try {
				
				System.out.print("Numero: ");
				int a = s.nextInt();
				System.out.print("Divisor: ");
				int b = s.nextInt();
				
				System.out.print(a / b);
				continua = false;
				}
				catch (InputMismatchException e1) {
					System.out.println("Os numeros devem ser inteiros");
					s.nextLine();// descarta a entrada errada e libera a entrada novamente para o usuario
				}
				
				catch (ArithmeticException e2) {
					System.out.println("O divisior deve ser diferente de zero");
				
				}
			finally {
				System.out.println("Finally Executado..");
			}
			

			
			
		} while (continua);
		
		
	}

}
