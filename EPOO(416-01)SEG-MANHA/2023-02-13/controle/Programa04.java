package controle;

import java.util.Scanner;

public class Programa04 {
	public static void main(String[] args) {
		String nome;
		int idade;
		float peso, altura;
		char sexo;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("CADADTRO DE PACIENTES");
		System.out.print("Digite o nome: ");
		nome = leia.nextLine();
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		System.out.print("Digite o peso: ");
		peso = leia.nextFloat();
		System.out.print("Digite a altura: ");
		altura = leia.nextFloat();
		System.out.print("Digite o sexo<F/M>: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("DADOS DO PACIENTE");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexo);
	}
}