package exercicio;

import java.util.Scanner;

public class Eleitores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalVotosBrancos, totalVotosNulos, totalVotosValidos, totalEleitores;
		
		System.out.println("Digite a quantidade total de eleitores de um munic�pio: ");
		totalEleitores = sc.nextInt();
		
		@SuppressWarnings("unused")
		float totalEleitores1 = totalEleitores;
		
		System.out.println("Digite a quantidade total de votos brancos de um munic�pio: ");
		totalVotosBrancos = sc.nextInt();
		float totalVotosBrancos1 = totalVotosBrancos;
		
		System.out.println("Digite a quantidade total de votos nulos de um munic�pio: ");
		totalVotosNulos = sc.nextInt();
		float totalVotosNulos1 = totalVotosNulos;
		
		
		System.out.println("Digite a quantidade total de votos validos de um munic�pio: ");
		totalVotosValidos = sc.nextInt();
		float totalVotosValidos1 = totalVotosValidos;
		
		
		float porcentagemVotosBrancos = (totalVotosBrancos1 * 100)/totalEleitores;
		float porcentagemVotosNulos = (totalVotosNulos1 * 100)/totalEleitores;
		float porcentagemVotosValidos = (totalVotosValidos1 * 100)/totalEleitores;
		
		System.out.println("A porcentagem de votos bracos correspondem �: " + porcentagemVotosBrancos + "%.");
		System.out.println("A porcentagem de votos nulos correspondem �: " + porcentagemVotosNulos + "%.");
		System.out.println("A porcentagem de votos validos correspondem �: " + porcentagemVotosValidos + "%.");
		sc.close();
		
	}

}
