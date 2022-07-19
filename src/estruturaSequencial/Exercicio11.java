package estruturaSequencial;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(System.in)){

		System.out.println("Insira um número inteiro");
		int a = input.nextInt();
		System.out.println("Insira outro número inteiro");
		int b = input.nextInt();
		System.out.println("Insira um número real");
		float c = input.nextFloat();
		
		System.out.printf("%.2f\n",(float)((a*a)*(b/2)));
		System.out.printf("%.2f\n",(float)((a*3)+(c)));
		System.out.printf("%.2f\n",Math.pow(c, 3));
		}catch (Exception e) {
			System.out.println("Algum valor digitado está incorreto!");
		}
	}

}
