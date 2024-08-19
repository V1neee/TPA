package lista;
import java.util.Scanner;
public class Cantina {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		int cod;
		System.out.println("insira o código do produto");
		cod = jc.nextInt();
		switch (cod) {
		case 1:
			System.out.println("Cachorro quente, R$8,00");
			break;
		case 2:
			System.out.println("Cheeseburguer, R$12,00");
			break;
		case 3:
			System.out.println("X-Salada, R$15,00");
			break;
		case 4:
			System.out.println("Misto Quente, R$11,00");
			break;
		case 5:
			System.out.println("Pão na Chapa, R$6,00");
		default:
			System.out.println("Por favor coloque um codigo valido (1-5)");	
		}
		jc.close();
	}
}