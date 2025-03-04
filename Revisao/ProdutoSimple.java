import java.util.Scanner;
public class ProdutoSimple {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			int a,b,prod;
			System.out.println("Digite o 1° valor:");
			a = jc.nextInt();
			System.out.println("Digite o 2° valor:");
			b = jc.nextInt();
			prod=a*b;
			System.out.println("O Produto da multiplicação dos dois valores é: " + prod);
		jc.close();
	}
}
