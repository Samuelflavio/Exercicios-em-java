package exercicio;

import java.util.Scanner;

public class PermissaoUsuario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu c�digo de usu�rio: ");
		int codigoUsuario =sc.nextInt();
		
		if (codigoUsuario != 1234) {
			System.out.println("Usu�rio Invalido!");
			
		}else {
			System.out.println("Usu�rio reconhecido, digite sua senha: ");
			
		}
		
		int senha =sc.nextInt();
		if (senha != 9999) {
			System.out.println("Senha Incorreta!");
			
		}else {
			System.out.println("Acesso Permitido!");
		}
		sc.close();
	}

}
