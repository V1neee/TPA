import java.util.Scanner;
public class NumNegativoNeutroPositivo {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			int n;
			System.out.println("Digite um qualquer número inteiro, tanto negativo ou positivo:");
			n = jc.nextInt();
			if (n < 0) {
				System.out.println("Número negativo");
			}
			else if (n == 0) {
				System.err.println("Número neutro");
			}
			else {
				System.out.println("Número positivo");
			}
		jc.close();
	}

}
