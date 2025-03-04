import java.util.Scanner;
public class SomaDoisValores {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		int a, b, x;
			System.out.println("Digite o 1° Valor:");
			a = jc.nextInt();
			System.out.println("Digite o 2° Valor:");
			b = jc.nextInt();
			
			x = a + b; 
			
			System.out.println("X = " + x);
		
		jc.close();
	}

}
