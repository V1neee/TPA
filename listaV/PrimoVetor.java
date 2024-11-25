package listaV;
import java.util.Scanner;
public class PrimoVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[] = new int[TAM];
        for (int i = 0; i < TAM; i++) {
            System.out.println("Insira o " + (i + 1) + "� n�mero:");
            a[i] = ler.nextInt();
        }
        for (int i = 0; i < TAM; i++) {
            int divisor = 0;
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                System.out.println(a[i] + " � primo.");
            } else {
                System.out.println(a[i] + " n�o � primo.");
            }
        }
        System.out.println("N�meros no vetor:");
        System.out.print("\nA = [ ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(a[i] + " ");
        }	
        	System.out.println("]");
        ler.close();
    }
}