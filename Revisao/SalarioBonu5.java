import java.util.Scanner;
public class SalarioBonu5 {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			String n;
			double s,tvd;
			System.out.println("Digite seu nome:");
			n = jc.next();
			while (!n.matches("[a-zA-Z]+")) {
	            System.out.println("Nome inválido! Por favor, digite um nome que contenha apenas letras.");
	            n = jc.next();
			}
			System.out.println("Digite seu salário:");
			s = jc.nextDouble();
			System.out.println("Digite o total de vendas em dinheiro:");
			tvd = jc.nextDouble();
			s = s + tvd*15/100;
			System.out.println(n+" seu salário final: R$" + String.format("%.2f", s));
		jc.close();
	}

}
