package exercicio;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float salarioAtual;
		float reajuste;
		
		System.out.println("Digite o valor do sal�rio atual do funcion�rio: ");
		salarioAtual = sc.nextFloat();
		System.out.println("Digite o percentual de reajuste de um funcion�rio: ");
		reajuste = sc.nextFloat();
		
		float salarioFinal = (salarioAtual * reajuste / 100) + salarioAtual;
		
		//f = format -> 2 
		
		System.out.printf("O novo sal�rio do funcion�rio �: R$ %.2f", salarioFinal);
		sc.close();		
	}
}
