import java.security.SecureRandom;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ProjetoGeradorDeSenhas {
	
	public static final String CARACTERES = "asdcefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ!@#$%¨&*()_+-=[]|,.;/?><";

	public static String gerarSenha(int comprimento) {
		SecureRandom geradorDeNumeroAleatorio = new SecureRandom();
		StringBuilder senha = new StringBuilder(comprimento);

		for (int i = 0; i < comprimento; i++) {
			int indice = geradorDeNumeroAleatorio.nextInt(CARACTERES.length());
			senha.append(CARACTERES.charAt(indice));
		}

		return senha.toString();
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int comprimentoSenha = 0;
		System.out.print("Digite o comprimento da senha desejada: ");
		try{
			comprimentoSenha = leitor.nextInt();
			String senha = gerarSenha(comprimentoSenha);
			System.out.println("Senha gerada: " + senha);
		} catch (InputMismatchException e) {
			System.out.print("Digite um número válido: " + e.getMessage());
		}
		
	}
}