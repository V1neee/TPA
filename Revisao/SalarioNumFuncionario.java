import java.util.Scanner;
public class SalarioNumFuncionario {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			int id,hora;
			double sal;
			System.out.println("Digite sua identificação:");
			id = jc.nextInt();
			System.out.println("Digite a quantidade de horas trabalhadas:");
			hora = jc.nextInt();
			sal = hora * 9.50;
			System.out.println("id:"+ id + " Salário final: R$" + String.format("%.2f", sal));
		jc.close();
	}
}
