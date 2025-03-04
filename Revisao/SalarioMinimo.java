import java.util.Scanner;
public class SalarioMinimo {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			double salario;
			System.out.println("Digite seu salário:");
			salario = jc.nextDouble();
			if (salario < 1302.00) {
				System.out.println("Seu salário está abaixo que o salário mínimo R$1302,00" );
			}
			else {
				System.out.println("Seu salário está acima do salário mínimo R$1302,00");
			}
		jc.close();	
	}

}
