import java.util.Scanner;
public class numerovizinho {
	public static void main(String args []) {
		Scanner ler = new Scanner(System.in);
		int numero;
		//ler o n�mero
		System.out.println("Coloque o n�mero");
		numero = ler.nextInt();
		//calcular o antecessor
		numero = numero - 1;
		System.out.println("o antecessor ser�: " + numero);
		//calcular o sucessor
		numero = numero + 2;
		System.out.println("O sucessor ser�: " + numero);
		ler.close();
	}

}
