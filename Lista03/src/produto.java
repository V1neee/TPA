import java.util.Scanner;
public class produto {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		 double precoinicial,precofinal,cupom;
		 //ler o pre�o inicial
		 System.out.println("Coloque o pre�o inicial do produto: ");
		 precoinicial = ler.nextDouble();
		 //ler o desconto do cupom
		 System.out.println("Coloque o desconto que sera aplicado pelo cupom: ");
		 cupom = ler.nextDouble();
		 //calcular o pre�o ap�s o cupom
		 precofinal = (precoinicial*cupom)/100;
		 precofinal = precoinicial-precofinal;
		 System.out.println("O pre�o apo�s o cupom ser�: " + precofinal + " Reais.");
		 ler.close();
		
	}
		
}
	
