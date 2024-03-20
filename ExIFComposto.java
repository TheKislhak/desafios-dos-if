package estruturaCondicional;

import java.util.Scanner;

public class ExIFComposto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe o numero: ");
		numero = ler.nextInt();
		
		if (numero > 0) {
			System.out.println("O numero é possitivo");
		} else if (numero == 0) {
			System.out.println("O numero é zero");
		} else {
			System.out.println("O numero é negativo");
		}
		
		ler.close();

	}

}
