package exercicio;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um primeiro n�mero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite um segundo n�mero: ");
		int numero2 = sc.nextInt();
		
		System.out.println("Digite um terceiro n�mero: ");
		int numero3 = sc.nextInt();
		
		
		if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
		    System.out.println("A ordem crescente �: " + numero3 + ", "+ numero2 + " e "+ numero1);
			
		}else if (numero1 > numero2 && numero1 > numero3 && numero3 > numero2) {
			System.out.println("A soma dos maiores n�meros �: " + numero2 + ", "+ numero3 + " e "+ numero1);
			
		} else if (numero2 > numero1 && numero2 > numero3 && numero3 > numero1) {
			System.out.println("A soma dos maiores n�meros �: " + numero1 + ", "+ numero3 + " e "+ numero2);
			
		}else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
			System.out.println("A soma dos maiores n�meros �: " + numero3 + ", "+ numero1 + " e "+ numero2);
			
		}else if (numero3 > numero1 && numero3 > numero2 && numero2 > numero1) {
			System.out.println("A soma dos maiores n�meros �: " + numero1 + ", "+ numero2 + " e "+ numero3);
			
		}else {
				System.out.println("A soma dos maiores n�meros �: " + numero2 + ", "+ numero1 + " e "+ numero3);
		}
		sc.close();

	}

}
