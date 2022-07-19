package estruturaSequencial;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(System.in)){
			System.out.print("Insira a temperatura em graus Celcius: ");
			double c = input.nextDouble();
			double f = c * 1.8 + 32;
			System.out.printf("Temperatura em Fahrenheit: %.2fº",f);
			
		}catch (Exception e) {
			System.out.println("Algo deu errado!");
		}
	}

}
