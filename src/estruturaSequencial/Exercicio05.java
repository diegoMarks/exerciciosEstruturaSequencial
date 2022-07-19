package estruturaSequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(System.in)){
			System.out.print("Insira a quantidade de metros: ");
			double metros = input.nextDouble();
			System.out.printf("Valor em Centímetros: %.2f", metros*100);
		}catch (Exception e) {
			System.out.println("Algo deu errado!");
		}
	}

}
