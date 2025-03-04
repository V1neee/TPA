import java.util.Scanner;
public class PrecoProduto {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			double p,pd,d,vf;
			System.out.println("Digite o preço do produto: ");
			p = jc.nextDouble();
			System.out.println("Digite a porcentagem do desconto: ");
			pd = jc.nextDouble();
			d = p * (pd/100);
			vf = p - d;
			System.out.println("Valor a pagar: R$" + vf);
		jc.close();	
	}
}
