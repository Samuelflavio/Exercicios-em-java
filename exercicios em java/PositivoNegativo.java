package exercicio;

import java.util.Scanner;

public class PositivoNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero  = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("O n�mero � positivo!");
		}else {
			System.out.println("O n�mero � negativo!");
		}
		sc.close();
	}


}
