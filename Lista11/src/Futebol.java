import java.util.Scanner;
public class Futebol {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Insira a idade do aluno");
		idade = ler.nextInt();
		switch (idade) {
		case 6:
			System.out.println("Este aluno tem: "+idade+" Anos, portanto sua cat�goria �: Dente de leite");
			break;
		case 7:
			System.out.println("Este aluno tem: "+idade+" Anos, portanto sua cat�goria �: junior ");
			break;
		case 8:
			System.out.println("Junior max");
		case 9:
			System.out.println("Este aluno tem: "+idade+" Anos, portanto sua cat�goria �: Junior master");
			break;
		case 10:
			System.out.println("Este aluno tem: " + idade + "Anos, portanto sua cat�goria �:  master ");
			break;
			default:
				System.out.println("Este aluno n�o possui uma categoria");
		}
		ler.close();
	}

}
