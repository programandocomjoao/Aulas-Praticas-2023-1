package controle;
import java.util.Scanner;

public class Programa08 {
	public static void main(String[] args) {
		String nome;
		int numero;
		float media;
		char aprovado;
		
		/* Scanner input;
		input = new Scanner(System.in); */
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENTRADA DE DADOS DO ALUNO(A)");
		System.out.print("Digite o nome: ");
		nome = input.nextLine();
		System.out.print("Digite o n�mero: ");
		numero = input.nextInt();
		System.out.print("Digite a m�dia: ");
		media = input.nextFloat();
		System.out.print("Aluno Aprovado? <S/N>: ");
		aprovado = input.next().charAt(0);
		
		System.out.println("DADOS DO ALUNO(A)");
		System.out.println("Nome: " + nome);
		System.out.println("N�mero: " + numero);
		System.out.println("M�dia: " + media);
		System.out.println("Aprovado: " + aprovado);
	}
}