package exercicio;

import java.util.Scanner;

public class GestaoDeEstoque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade atual do produto no estoque: ");
		int quantidadeAtual = sc.nextInt();
		
		System.out.println("Digite a quantidade m�xima do produto no estoque: ");
		int quantidadeMaxima = sc.nextInt();
		
		System.out.println("Digite a quantidade minimo do produto no estoque: ");
		int quantidadeMinimo = sc.nextInt();
		
		float media = quantidadeMaxima + quantidadeMinimo / 2;
		
		if (quantidadeAtual >= media){
			System.out.println("N�o efetuar comprar!");
		}else {
			System.out.println("Efetuar comprar!");
		}
		sc.close();
	}

}
