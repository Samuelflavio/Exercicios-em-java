package exercicio;

import java.util.Scanner;

public class CalculoIdade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anos, meses, dias;
		
		System.out.println("Digite a quantidade de anos completo que voc� possui: ");
		anos = sc.nextInt();
		System.out.println("Digite a quantidade de meses que passou do seu anivers�rio: ");
		meses = sc.nextInt();
		System.out.println("Digite a quantidade de dias que passou do seu �ltimo m�svers�rio: ");
		dias = sc.nextInt();
		
		int total = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("A quantidade de dias vividos corresponde �: " + total + " dias.");
		sc.close();
	}

}
