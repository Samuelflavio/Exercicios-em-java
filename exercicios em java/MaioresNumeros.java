package exercicio;

import java.util.Scanner;

public class MaioresNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um primeiro n�mero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite um segundo n�mero: ");
		int numero2 = sc.nextInt();
		
		System.out.println("Digite um terceiro n�mero: ");
		int numero3 = sc.nextInt();
		
		
		if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
			int somaNumeroMaiores = numero1 + numero2;
			System.out.println("A soma dos maiores n�meros �: " + somaNumeroMaiores);
			
		}else if (numero1 > numero2 && numero1 > numero3 && numero3 > numero2) {
			int somaNumeroMaiores = numero1 + numero3;
			System.out.println("A soma dos maiores n�meros �: " + somaNumeroMaiores);
			
		} else if (numero2 > numero1 && numero2 > numero3 && numero3 > numero1) {
			int somaNumeroMaiores = numero2 + numero3;
			System.out.println("A soma dos maiores n�meros �: " + somaNumeroMaiores);
			
		}else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
			int somaNumeroMaiores = numero2 + numero1;
			System.out.println("A soma dos maiores n�meros �: " + somaNumeroMaiores);
			
		}else if (numero3 > numero1 && numero3 > numero2 && numero2 > numero1) {
			int somaNumeroMaiores = numero3 + numero2;
			System.out.println("A soma dos maiores n�meros �: " + somaNumeroMaiores);
			
		}else {
				int somaNumeroMaiores = numero3 + numero1;
				System.out.println("A soma dos maiores n�meros �: " + somaNumeroMaiores);
		}
		sc.close();
	}

}
