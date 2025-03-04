import java.util.Scanner;
public class SalarioDivida {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			double s,d,a;
			System.out.println("Digite seu salário:");
			s = jc.nextDouble();
			System.out.println("Digite o total a pagar:");
			d = jc.nextDouble();
			a = s-d;
			if (s>d) {
				System.out.println("Sobejará R$"+ a);
			}
			else {
				System.out.println("Faltará R$" + a + " para pagar");
			}
		jc.close();
	}

}
