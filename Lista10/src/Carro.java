import java.util.Scanner;
public class Carro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numpl;
		System.out.println("Insira o ultimo numero da placa de seu carro: ");
		numpl = ler.nextInt();
			switch(numpl){
			case 1:
			case 2:
				System.out.println("Seu carro n�o pode rodar segunda");
				break;
			case 3:
			case 4:
				System.out.println("Seu carro n�o pode rodar ter�a");
				break;
			case 5:
			case 6:
				System.out.println("Seu carro n�o pode rodar quarta");
				break;
			case 7:
			case 8:
				System.out.println("Seu carro n�o pode rodarquinta");
				break;
			case 9:
			case 0:
				System.out.println("Seu carro n�o pode rodar sexta");
				break;
			default:
				System.out.println("Ultimo valor inv�lido.");
			}
		ler.close();
	}

}
