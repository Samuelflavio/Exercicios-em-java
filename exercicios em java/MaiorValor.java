package exercicio;

import java.util.Scanner;

public class MaiorValor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um primeiro n�mero");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite um segundo n�mero");
		int numero2 = sc.nextInt();
		
		System.out.println("Digite um terceiro n�mero");
		int numero3 = sc.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3){
			System.out.println("O maior n�mero �: " + numero1);
			
		}else if (numero2 > numero1 && numero2 > numero3){
			System.out.println("O maior n�mero �: " + numero2);
			
		}else {
			System.out.println("O maior n�mero �: " + numero3);
		}
		sc.close();
	}

}
