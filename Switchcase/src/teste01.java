import java.util.Scanner;
public class teste01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String operacao;
		System.out.println("Escolha a operaçao(em /,+,-,x): ");
		operacao = ler.next();
		float n1,n2,res;
		System.out.println("Primeiro numero:");
		n1 = ler.nextInt();
		System.out.println("Segundo numero: ");
		n2 = ler.nextInt();
		switch(operacao) {
		case "+":
			System.out.println("Voce escolheu soma");
			res = n1 + n2;
			System.out.println(res);
			break;
		case "-":
			System.out.println("Voce escolheu subtração");
			res = n1 - n2;
			System.out.println(res);
			break;
		case "x":
			System.out.println("Voce escolheu multiplicação");
			res = n1 * n2;
			System.out.println(res);
			break;
		case "/":
			System.out.println("Voce escolheu divisao");
			res = n1 / n2;
			System.out.println(res);
			break;
		default:
			System.out.println("Operação inválida");
			break;	
		}	
	ler.close();
	}

}