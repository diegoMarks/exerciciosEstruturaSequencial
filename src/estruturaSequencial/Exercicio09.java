package estruturaSequencial;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(System.in)){
			System.out.print("Insira a temperatura em Fahrenheit: ");
			double f = input.nextDouble();
			double c = 5*((f-32)/9);
			
			System.out.printf("Temperatura em Celcius: %.2fº", c);
		}catch (Exception e) {
			System.out.println("Algo deu errado!");
		}
	}

}
