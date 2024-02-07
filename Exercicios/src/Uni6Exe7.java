import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores a serem cadastrados (limite de 20): ");
        int n = teclado.nextInt();

        if (n > 20) {
            System.out.println("Limite de valores excedido. O máximo é 20.");
        }

        int[] vetor = new int[n];
        inserirValores(vetor, teclado);
        ordenarVetor(vetor);
        exibirVetor(vetor);

        teclado.close();
    }

    public static void inserirValores(int[] vetor, Scanner teclado) {
        System.out.println("Informe os valores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            int valor = teclado.nextInt();

            if (valorJaExiste(vetor, valor)) {
                System.out.println("Valor já existente. Informe outro valor.");
                i--;
            } else {
                vetor[i] = valor;
            }
        }
    }

    public static boolean valorJaExiste(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void ordenarVetor(int[] vetor) {
        Arrays.sort(vetor);
    }

    public static void exibirVetor(int[] vetor) {
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.println();
    }
}
