package listaV;
import java.util.Scanner;
public class VetorPar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, a[], j;
		a = new int[10];
		
		for(i=0;i<9;i++) {
			System.out.println("Digite o "+(i+1)+"° número para obter a relação");
			a[i] = in.nextInt();
		}
		for(i=0;i < 9; i++) {
			System.out.print(a[i]+": ");
			for(j=0; j<=a[i];j++) {
				if(j%2 == 0) {
					System.out.print(j + "   ");
				}
				
			}
		}
		in.close();
	}
	

}