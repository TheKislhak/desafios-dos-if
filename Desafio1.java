package estruturaCondicional;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		// Entrada de dados
		Scanner ler = new Scanner(System.in);
		double med, nota, nota2, nota3, nota4;

		// Intercalar classes
		System.out.println("digite a primeira nota");
		nota = ler.nextDouble();
		System.out.println("digite a segunda nota");
		nota2 = ler.nextDouble();
		System.out.println("digite a terceira nota");
		nota3 = ler.nextDouble();
		System.out.println("digite a quarda nota");
		nota4 = ler.nextDouble();

		// Processamento e saída
		med = (nota+nota2+nota3+nota4)/4;

		// Saída
		if (med >= 6) {
			System.out.println("Eba! Sua média foi: " + med+", Você passou! :D");
		} else {
			System.out.println("Ahhh... Sua média foi: " + med+", você infelizmente não passou :(");
		}
		ler.close();



	}

}
