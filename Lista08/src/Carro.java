import java.util.Scanner;
public class Carro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		  double km,l,gm;
		  System.out.println("Digite a distancia que o carro se moveu: ");
		  km = ler.nextDouble();
		  System.out.println("Digite a capacidade total de combustivel: ");
		  l = ler.nextDouble();
		  gm = km/l;
		  System.out.println("Este ser� o seu gasto m�dio: " + gm + "Km/L");
		  
		  if(gm>=10) {
			  System.out.println("Econ�mico");
		  }
		  else {
			  System.out.println("N�o econ�mico");
		  }
		  ler.close();
	}
}
