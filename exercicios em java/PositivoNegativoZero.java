package exercicio;

import java.util.Scanner;

public class PositivoNegativoZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		
		if(numero > 0) {
			System.out.println("N�mero � Positivo!");
			
		}else if (numero < 0){
			System.out.println("N�mero Negativo");
			
		}else {
			System.out.println("N�mero � zero");
		}
		sc.close();
	}

}
