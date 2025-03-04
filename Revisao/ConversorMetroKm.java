import java.util.Scanner;
public class ConversorMetroKm {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			double m, km;
			System.out.println("Digite a quantidade de metros para converter em quilometros:");
			m = jc.nextDouble();
			km = m/1000;
			System.out.println(km+"Km");
		jc.close();
	}

}
