package estruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		
		try (Scanner input = new Scanner(System.in)){
			
			System.out.print("Insira o primeiro número: ");
			int a = input.nextInt();
			System.out.print("Informe o segundo número: ");
			int b = input.nextInt();
			System.out.printf("Resultado da soma: %d", a + b);
			
		} catch (Exception e) {
			System.out.println("Algo deu errado");
		}
			
	}

}
