package controle;

public class Programa06 {
	public static void main(String[] args) {
		String nome;
		int numero;
		float media;
		char aprovado;
		
		nome = "Fernanda";
		numero = 23;
		//media = 8.3f;
		media = (float)8.3;
		aprovado = 'S';
		
		System.out.println("DADOS DO ALUNO(A)");
		System.out.println("Nome: " + nome);
		System.out.println("Número: " + numero);
		System.out.println("Média: " + media);
		System.out.println("Aprovado: " + aprovado);
	}
}