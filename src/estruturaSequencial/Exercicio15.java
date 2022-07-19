package estruturaSequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		//Variável que recebe o valor inserido pelo usuário
		try(Scanner input = new Scanner(System.in)){
		//Questionando o usuário e capturando valores de resposta.
		System.out.println("Quanto você ganha por hora?");
		float valorHora = input.nextFloat();
		System.out.println("Número de horas trabalhadas no mês");
		float HorasTrabalhadasNoMes = input.nextFloat();
		//Cálculo do salário bruto do mês
		float salarioBruto = (valorHora*HorasTrabalhadasNoMes);
		//Imprimindo respostas na tela para o usuário e retirando os descontos.
		System.out.printf("+ Salário Bruto: R$%.2f\n",salarioBruto);
		System.out.printf("- IR : R$%.2f\n", (salarioBruto*11)/100);
		float ir = (salarioBruto*11)/100;
		System.out.printf("- INSS : R$%.2f\n ", (salarioBruto*8)/100);
		float inss = (salarioBruto*8)/100;
		System.out.printf("- Sindicato : R$%.2f\n", (salarioBruto*5)/100);
		float sindicado = (salarioBruto*5)/100;
		System.out.printf("Salario Líquido : R$%.2f",salarioBruto - (ir+inss+sindicado));	
	}catch (Exception e) {
		System.out.println("Valor digitado incorreto!");
	}
	}
}
