package exercicio;

import java.util.Scanner;

public class HoraExtra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horasTrabalhadas;
		double salarioHora;
		int horasTrabalhadasMensal = 160;
		
		System.out.println("Digite as horas trabalhadas no m�s: ");
		horasTrabalhadas = sc.nextInt();
		
		System.out.println("Digite o seu s�l�rio por hora: ");
		salarioHora = sc.nextDouble();
		
		if (horasTrabalhadas <= horasTrabalhadasMensal){
			double salarioFinal = salarioHora * horasTrabalhadas;
			
			System.out.println("O sal�rio final �: R$ " + salarioFinal);
			
		}else {
			int horasExtras = horasTrabalhadas - horasTrabalhadasMensal;
			double valorHorasExtras = horasExtras * salarioHora * 1.5;
			double salarioFinal = valorHorasExtras + horasTrabalhadasMensal * salarioHora;
			System.out.println("O sal�rio final �: R$ " + salarioFinal);
		}
		sc.close();
		
		
	}

}
