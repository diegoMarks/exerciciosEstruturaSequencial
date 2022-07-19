package estruturaSequencial;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(System.in)){
			
			System.out.println("Insira a altura");
			float h = input.nextFloat();
			System.out.printf("Peso ideal para HOMENS é de: %.2f\n", ((72.7*h)-58));
			System.out.printf("Peso ideal para MULHERES é de: %.2f\n", ((62.1*h)-44.7));
			}catch (Exception e) {
				System.out.println("Valor da altura está incorreto!");
			}
	}

}
