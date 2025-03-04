import java.util.Scanner;
public class Diferenca {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			int di,a,b,c,d;				
			System.out.println("Digite o 1° valor:");
			a = jc.nextInt();
			System.out.println("Digite o 2° valor:");
			b = jc.nextInt();
			System.out.println("Digite o 3° valor:");
			c = jc.nextInt();
			System.out.println("Digite o 4° valor:");
			d = jc.nextInt();
			di = (a*b-c*d);
			System.out.println("A diferença é: " + di);
		jc.close();
	}
}
