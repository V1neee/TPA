import java.util.Scanner;
public class Meses {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String mes;
		System.out.println("Coloque o nome de um m�s para ver em qual dia acaba: ");
		mes = ler.next();
		switch(mes) {
		case "Janeiro":
		case "Mar�o":
		case "Maio":
		case "julho":
		case "Setembro":
		case "Outubro":
		case "Dezembro":
			System.out.println("Este m�s acaba no dia 31.");
			break;
		case "Abril":
		case "junho":
		case "Agosto":
		case "Novembro":
			System.out.println("Este m�s caba no dia 30.");
			break;
		case "Fevereiro":
			System.out.println("O m�s de Fevereiro � o unico que acaba no dia 28, em anos bissextos acaba no dia 29");
			default :
				System.out.println("Este m�s n�o existe no calend�rio.");
		}
			
	}
}
