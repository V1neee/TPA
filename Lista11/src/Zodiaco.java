import java.util.Scanner;
public class Zodiaco {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		int dia,mes; 
		System.out.println("Insira o m�s em que nasceu: ");
		mes = jc.nextInt();
		System.out.println("Insira o dia em que nasceu: ");
		dia = jc.nextInt();
			switch(mes) {
			case 1:
				if(dia<=22) {
					System.out.println("Seu signo � Capricornio");
				}
				else {
					System.out.println("Seu signo � Aquario");
				}
				break;
			case 2:
				if(dia<=20) {
					System.out.println("Seu signo � Capricornio");
				}
				else {
					System.out.println("Peixes");
				}
				break;
			case 3:
				if(dia <= 21) {
					System.out.println("Peixes");
				}
				else {
					System.out.println("Aries");
				}
				break;
			case 4:
				if(dia <= 21) {
					System.out.println("Aries");
				}
				else {
					System.out.println("Touro");
				}
				break;
			case 5:
				if(dia <= 20) {
					System.out.println("Touro");
				}
				else {
					System.out.println("G�meos");
				}
				break;
			case 6:
				if(dia <= 20) {
					System.out.println("G�meos");
				}
				else {
					System.out.println("Canc�r");
				}
			case 7:
				if(dia <= 21) {
					System.out.println("Canc�r");
				}
				else {
					System.out.println("Le�o");
					break;
				}
			case 8:
				if(dia <= 22) {
					System.out.println("Le�o");
				}
				else {
					System.out.println("Virgem");
				}
			case 9:
				if(dia <= 23) {
					System.out.println("Virgem");
				}
				else {
					System.out.println("Libra");
				}
				break;
			case 10:
				if(dia <= 22) {
					System.out.println("Libra");
				}
				else {
					System.out.println("Escorpe�o");
				}
				break;
			case 11:
				if(dia <= 23) {
					System.out.println("Escorpe�o");
				}
				else {
					System.out.println("Sargit�rio");
				}
				break;
			case 12:
				if(dia <= 21) {
					System.out.println("Sargit�rio");
				}
				else {
					System.out.println("Capricornio");
				}
			}
			jc.close();
	}
}