package estruturaCondicional;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe o número do dia da semana: ");
		numero = ler.nextInt();

		if (numero == 2){
			System.out.println("O dia é Segunda-eeira");
		} else if (numero ==3) {
			System.out.println("O dia é Terça-Feira");
		} else if (numero == 4) {
			System.out.println("O dia é Quarta-Feira");
		} else if (numero == 5) {
			System.out.println("O dia é Quinta-Feira");
		} else if (numero == 6) {
			System.out.println("O dia é Sexta-Feira");
		} else if (numero == 7) {
			System.out.println("O dia é Sábado");
		} else if (numero == 1) {
			System.out.println("O dia é Domingo");
		} else if (numero >= 7) {
			System.out.println("Esse dia não existe! >:(");
		} else if (numero <= 1) {
			System.out.println("Esse dia não existe! >:/");
		}

		ler.close();
	}

}
