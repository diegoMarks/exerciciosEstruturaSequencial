package estruturaSequencial;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		
		try(Scanner input = new Scanner(System.in)){
			System.out.print("Informe um número: ");
			int a = input.nextInt();
			System.out.printf("O número informado foi: %d", a);
		} catch (Exception e) {
			System.out.println("Algo deu errado");
		}
		
		
		
	}

}
