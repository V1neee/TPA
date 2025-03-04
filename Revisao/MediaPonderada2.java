import java.util.Scanner;
public class MediaPonderada2 {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			double n1,n2,n3,soma,media;
			System.out.println("Digite a 1a nota:");
			n1 = jc.nextDouble();
			System.out.println("Digite a 2a nota:");
			n2 = jc.nextDouble();
			System.out.println("Digite a 3a nota: ");
			n3 =jc.nextDouble();
			n1 = n1*2;
			n2 = n2*3;
			n3 = n3*5;
			soma =  n1+n2+n3;
			media = soma / (2 + 3 + 5);
			System.out.println("A média é: " + media);
		jc.close();
	}
	
}
