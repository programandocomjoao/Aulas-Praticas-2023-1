package controle;

import java.util.Scanner;

public class Programa09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENTRADA DE DADOS DO ALUNO(A)");
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		System.out.print("Digite o n�mero: ");
		int numero = input.nextInt();
		System.out.print("Digite a m�dia: ");
		float media = input.nextFloat();
		System.out.print("Aluno Aprovado? <S/N>: ");
		char aprovado = input.next().charAt(0);
		
		System.out.println("DADOS DO ALUNO(A)");
		System.out.println("Nome: " + nome);
		System.out.println("N�mero: " + numero);
		System.out.println("M�dia: " + media);
		System.out.println("Aprovado: " + aprovado);
	}
}