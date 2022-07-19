package estruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(System.in)){
			System.out.print("Insira a primeira nota: ");
			int a = input.nextInt();
			System.out.print("Insira a segunda nota: ");
			int b = input.nextInt();
			System.out.print("Insira a terceira nota: ");
			int c = input.nextInt();
			System.out.print("Insira a quarta nota: ");
			int d = input.nextInt();
			System.out.printf("A média das notas é: %.2f", (float)(a+b+c+d)/4);
		}catch (Exception e) {
			System.out.println("Algo deu errado");
		}
	}
}
