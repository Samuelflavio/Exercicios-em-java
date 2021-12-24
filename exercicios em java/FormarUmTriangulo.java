package exercicio;

import java.util.Scanner;

public class FormarUmTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor correspondente � a: ");
		int a = sc.nextInt();
		
		System.out.println("Digite o valor correspondente � b: ");
		int b = sc.nextInt();
		
		System.out.println("Digite o valor correspondente � c: ");
		int c = sc.nextInt();
		
		if (a < b + c && b < a + c && c < a + b) {
			if (a == b && b == c) {
				System.out.println("Tri�ngulo Equil�tero!");
				
			}else if (a == b || b == c || a == c) {
				System.out.println("Tri�ngulo Is�sceles!");
				
			}else {
				System.out.println("Tri�ngulo Escaleno!");
				
		}
			
	}else {
		System.out.println("N�o forma um tri�ngulo!");
	 }
		sc.close();
   }
	/* ------------------------------------------------"
	|                   VARI�VEIS                   |
	|-----------------------------------------------|
	|a | b | c |          Resposta                  |
	|-----------------------------------------------|
	|1 | 2 | 3 | N�o  forma um tri�ngulo            |
	|-----------------------------------------------|
	|3 | 4 | 5 | Tri�ngulo Escaleno                 |
	|-----------------------------------------------|
	|2 | 2 | 4 | N�o forma um tri�ngulo             |
	|-----------------------------------------------|
	|4 | 4 | 4 | Tri�ngulo Equil�tero               |
	|-----------------------------------------------|
	|5 | 3 | 3 |Tri�ngulo Is�scele                  |
	|-----------------------------------------------|*/
	

}
