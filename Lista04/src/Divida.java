import java.util.Scanner;
public class Divida {
   public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double salario,divida,renda;
	System.out.println("Coloque o Sal�rio: ");
	salario = ler.nextDouble();
	System.out.println("Coloque o total de dividas: ");
	divida = ler.nextDouble();
	renda = salario-divida;
	System.out.println("Esta ser� sua renda apos o pagamento: " + renda + " Reais.");
	if(renda<0) {
		System.out.println("Ter� um prejuizo de: " + renda);
	}
	else {
		System.out.println("sua renda sera suficiente e sobrar�: " + renda );
	}
	ler.close();
}

}
