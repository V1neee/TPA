import java.util.Scanner;
public class Pesoideal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double altura,f,m;
		String sexo;
		String resposta;
		do {
			System.out.println("Insira seu sexo entre masculino (M) ou feminino(F): ");
			sexo = ler.next();
			System.out.println("Coloque sua altura para o calculo do seu peso ideal: ");
			altura =  ler.nextDouble();
			if(sexo.equalsIgnoreCase("s")) {
				m = 52 + (0.75*(altura - 152.4));
			}
			else {
				f = 52 + (0.67*(altura - 152.4));
			}
		
		System.out.println("Se quiser continuar a verificar o seu peso ideal, insira: S);");
		resposta = ler.next();
		}while(resposta.equalsIgnoreCase("S"));
	}
}
