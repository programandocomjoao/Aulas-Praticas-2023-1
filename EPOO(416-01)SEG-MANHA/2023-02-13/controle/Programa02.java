package controle;

public class Programa02 {
	public static void main(String[] args) {
		String nome;
		int idade;
		//double peso, altura;
		float peso, altura;
		char sexo;
		
		nome = "Fernada";
		idade = 10;
		peso = (float)31.3;
		altura = (float)1.35;
		sexo = 'F';
		
		System.out.println("DADOS DO PACIENTE");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexo);
	}
}