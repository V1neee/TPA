import java.util.Scanner;
public class Exercicio {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
			String n,s,cs;
			System.out.println("Digite seu nome de usuario:");
			n = jc.next();
			System.out.println("Digite sua senha:");
			s = jc.next();
			System.out.println("Confirme sua senha:");
			cs = jc.next();
			if (s.equals(cs)) {
				System.out.println(n + ", As senhas digitadas são iguais: " + s );
			}
			else {
				System.out.println(n + ", As senhas digitadas não são iguais. Tente outra vez. ");
			}
		jc.close();	
	}

}
