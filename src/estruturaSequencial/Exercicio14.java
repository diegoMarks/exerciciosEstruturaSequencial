package estruturaSequencial;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		//Constante que recebe o limite máximo de peso
		final float limiteDePeso = (float) 50.00;
		//Instânciando um Scanner que receberá o peso inserido pelo usuário
		try(Scanner input = new Scanner(System.in)){
		//O usuário irá inserir o peso dos peixes
		System.out.println("Insira o peso dos peixes pescados");
		//Capturando o peso inserido
		float pesoPeixe = input.nextFloat();
		
		//Verificando se a quantidade de peixe extrapola o limite estabelecido
		if(pesoPeixe > limiteDePeso) {
			//Se o peso for maior que o limite, tira essa diferença e aplica uma multa
			float excesso = (pesoPeixe - limiteDePeso);
			float multa = (float)(excesso * 4.00);
			//Mensagens avisando o usuário
			System.out.println("Você extrapolou o limite de peso estabelecido!!");
			System.out.println("Quantidade de Kilos acima do Limite: " + excesso);
			System.out.println("Valor da multa que terá de pagar: " + multa);
		}else {
			System.out.println("O peso de peixes está dentro do limite estabelecido");
			System.out.println("Não há multas a serem pagas.");
		}
		
		}catch (Exception e) {
			System.out.println("Algum valor inserido está incorreto!");
		}
	}
}
