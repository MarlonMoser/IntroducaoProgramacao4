import java.util.Scanner;

public class Uni6Exe6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores a serem cadastrados: ");
        int n = teclado.nextInt();

        double[] vetor = new double[n];
        lerVetor(vetor);

        System.out.print("Informe um valor real para verificar se está cadastrado: ");
        double valor = teclado.nextDouble();

        boolean encontrado = buscarValor(vetor, valor);

        if (encontrado) {
            System.out.println("O valor está cadastrado no vetor.");
        } else {
            System.out.println("O valor não está cadastrado no vetor.");
        }

        teclado.close();
    }

    public static void lerVetor(double[] vetor) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe os valores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextDouble();
        }
        teclado.close();
    }

    public static boolean buscarValor(double[] vetor, double valor) {
        for (double elemento : vetor) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }
}
