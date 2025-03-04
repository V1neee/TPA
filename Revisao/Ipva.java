import java.util.Scanner;
public class Ipva {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			double vf, ipva;
			System.out.println("Digite o valor do seu carro segundo a Tabela Fipe:");
			vf = jc.nextDouble();
			ipva = vf * 4 / 100 ;
			System.out.println("O valor do seu IPVA é:" + ipva +"R$");
		jc.close();
	}
}