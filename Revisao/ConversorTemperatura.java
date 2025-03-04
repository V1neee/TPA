import java.util.Scanner;
public class ConversorTemperatura {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			int f,c;
			System.out.println("Digite a temperatura em Fahrenheit:");
			f = jc.nextInt();
			c = (f-32)*5/9;
			if (c < 15) {
				System.out.println(c + "°C Frio");
			}
			else if(c < 22) {
				System.out.println(c + "°C Ameno");
			}
			else if(c<35) {
				System.out.println(c + "°C Calor");
			}
			else {
				System.out.println(c + "°C CALOR DOS INFERNOS!");
			}
		jc.close();	
	}
}
