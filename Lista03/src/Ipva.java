import java.util.Scanner;
public class Ipva {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double precoveiculo,ipva;
		//ler o pre�o de veiculo
		System.out.println("Coloque o pre�o do veiculo.");
		precoveiculo = ler.nextDouble();
		//ler o IPVA
		//calcular o IPVA
		ipva = (precoveiculo*4)/100;
		System.out.println("O IPVA do seu veiculo ser�: " + ipva + " Reais." );
		ler.close();
	}
}
