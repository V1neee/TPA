import java.util.Scanner;
public class ImparPar {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			int n;
			System.out.println("Digite um número, e saberá se é par o ímpar:");
			n = jc.nextInt();
			if (n % 2 == 0) {
				System.out.println("O número é par: " + n);
			}
			else {
				System.out.println("O número é ímpar: " + n);
			}
		jc.close();
	}

}
