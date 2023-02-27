package controle;

import java.util.Scanner;

public class Programa09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENTRADA DE DADOS DO ALUNO(A)");
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		System.out.print("Digite o número: ");
		int numero = input.nextInt();
		System.out.print("Digite a média: ");
		float media = input.nextFloat();
		System.out.print("Aluno Aprovado? <S/N>: ");
		char aprovado = input.next().charAt(0);
		
		System.out.println("DADOS DO ALUNO(A)");
		System.out.println("Nome: " + nome);
		System.out.println("Número: " + numero);
		System.out.println("Média: " + media);
		System.out.println("Aprovado: " + aprovado);
	}
}