package exercicio;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor um lado do tri�ngulo: ");
		float ladoA = sc.nextFloat();
		
		System.out.println("Digite um valor um lado do tri�ngulo: ");
		float ladoB = sc.nextFloat();
		
		System.out.println("Digite um valor um lado do tri�ngulo: ");
		float ladoC = sc.nextFloat();
		
		if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
			System.out.println("� um Tri�ngulo!");
			
		}else {
			System.out.println("N�o � um Tri�ngulo!");
		}
		sc.close();

	}

}
