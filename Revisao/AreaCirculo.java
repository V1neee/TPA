import java.util.Scanner;
public class AreaCirculo {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			double area, raio;
			double n = 3.14159;
			System.out.println("Digite a raio do Círculo:");
			raio = jc.nextDouble();
			area = n * (raio*raio);
			System.out.println("Esta é a área do círculo: " + area);
		jc.close();
	} 
	


}
