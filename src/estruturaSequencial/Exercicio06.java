package estruturaSequencial;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(System.in)){
			System.out.print("Insira o valor do Raio: ");
			double raio = input.nextDouble();
			double area = Math.PI * (raio*raio);			
			System.out.printf("Área do círculo: %.2f", area);
			
		}catch (Exception e) {
			System.out.println("Algo deu errado!");
		}
	}

}
