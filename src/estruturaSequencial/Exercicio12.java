package estruturaSequencial;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(System.in)){
		
		System.out.println("Insira a altura");
		float altura = input.nextFloat();
		System.out.printf("Seu peso ideal é de: %.2f", ((72.7*altura)-58));
		}catch (Exception e) {
			System.out.println("Valor da altura está incorreto!");
		}
	}

}
