package exercicio;

import java.util.Scanner;

public class Maca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kgMacas;
		
		System.out.println("Digite a quantidade de ma�as: ");
		kgMacas = sc.nextInt();
		
		if(kgMacas < 12) {
			double total = kgMacas * 1.3;
			System.out.println("O valor das ma�as �: R$ " + total); 
		}else {
			double total = kgMacas * 1;
			System.out.println("O valor das ma�as �: R$ " + total); 
		}
		sc.close();
	}

}
