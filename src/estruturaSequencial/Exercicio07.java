package estruturaSequencial;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(System.in)){
			System.out.print("Lado do quadrado: ");
			double lado = input.nextDouble();
			double area = lado * lado;
			System.out.printf("Dobro da área do quadrado: %.2f", area * 2);
		} catch (Exception e) {
			System.out.println("Algo deu errado!");
		}
	}

}
