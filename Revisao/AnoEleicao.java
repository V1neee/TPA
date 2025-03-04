import java.util.Scanner;
public class AnoEleicao {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			int ae, dn, i;
			System.out.println("Digite o ano da proxima eleição:");
			ae = jc.nextInt();
			System.out.println("Digite sua data de nascimento:");
			dn = jc.nextInt();
			i = ae - dn;
			if (i<16) {
				System.out.println("Você terá " + i + " anos, e não poderá votar");
			}
			else {
				System.out.println("Você terá " + i + " anos, e poderá votar");
			}
		jc.close();
			
	}
}
