import java.util.Scanner;
public class LeitorRenda {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double renda = 0,rendatotal = 0,media;
		for(int i=1;i<=3;i++) {
			System.out.println("Insira a renda do aluno");
			renda = ler.nextDouble();
			rendatotal = rendatotal+renda;	
		}
		System.out.println("A soma total de renda é: R$" + rendatotal);
		// media
		media = rendatotal/3;
		System.out.println("A média da renda da sua sala é de: R$" + media);
		double rendamenor,rendamaior;
		rendamaior = renda;
		rendamenor = renda;
		System.out.println("Insira novamente os valores para verificar a menor e maior renda");
		for(int i = 1;i<=3;i++) {
			System.out.println("Insira novamente: ");
			renda = ler.nextDouble();
			if(renda<rendamaior) {
				rendamenor = renda;
			}
			else {
				rendamaior = renda;
			}	
		}
		System.out.println("A maior renda é de: R$"+rendamaior+" e a menor renda é de: R$"+rendamenor);
		ler.close();
	}
	
}
