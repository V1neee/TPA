import java.util.Scanner;
public class SomaSimples {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			int a,b,soma;
			System.out.println("Digite o primeiro valor:");
			a = jc.nextInt();
			System.out.println("Digite o segundo valor:");
			b = jc.nextInt();
			soma=a+b;
			System.out.println("A soma dos valores é: " + soma );
		jc.close();
	}
}
