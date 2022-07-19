package estruturaSequencial;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(System.in)){
			System.out.print("Quanto você ganha por hora: ");
			double hora = input.nextDouble();
			System.out.print("Quantas horas você fez no mês: ");
			int qth = input.nextInt();
			
			System.out.printf("Salário do mês: %.2f", hora*qth);
		}catch (Exception e) {
			System.out.println("Algo deu errado!");
		}
	}

}
