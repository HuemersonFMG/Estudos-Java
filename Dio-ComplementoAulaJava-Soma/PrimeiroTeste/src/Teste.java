import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

		// leitura dos valores
		System.out.println("Digite o primeiro valor: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = scan.nextInt();

		// soma dos valores
		int soma = valor1 + valor2;

		// resultado
		System.out.println("A soma dos valores é: " + soma);
    }
}
