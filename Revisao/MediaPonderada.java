import java.util.Scanner;
public class MediaPonderada {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			double n1,n2,soma,media;
			System.out.println("Digite a 1a nota:");
			n1 = jc.nextDouble();
			System.out.println("Digite a 2a nota:");
			n2 = jc.nextDouble();
			n1 = n1*3.5;
			n2= n2*7.5;
			soma =  n1+n2;
			media = soma / (3.5 + 7.5);
			System.out.println("A média é: " + media);
		jc.close();
	}
	
}
