import java.util.Scanner;
public class Bhaskara {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a,b,c,x1,x2,delta;
		System.out.println("Insira um algarismo real A: ");
		a = ler.nextDouble();
		System.out.println("Insira um algarismo real B: ");
		b = ler.nextDouble();
		System.out.println("Insira um algarismo real C: ");
		c = ler.nextDouble();
        delta = (b*b)+(-4*a*c);
        x1 = (-b-Math.sqrt(delta))/(2*a);
        x2 = (-b+Math.sqrt(delta))/(2*a);
        System.out.println("Estas s�o as raizes reais da equa��o: "+ x1 +" | "+x2);
        if( a == 0) {
        	System.out.println("Os termos inseridos geram uma equa��o quadratica inexistente.");
        }
        else if(delta == 0) {
			System.out.println("Sua equa��o possui uma raiz real.");
		}
		else if(delta>0) {
			System.out.println("Sua equa��o possui duas raizes reais.");
		}
		else {
			System.out.println("Sua equa��o n�o possui raizes reais.");
		}
		ler.close();
	}

}
