import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni6Exe3 {
    public static void main(String[] args) {
        double[] vetor = new double[12];
        lerValor(vetor);
        ajusVetor(vetor);
        atualizado(vetor);
    }

    public static void lerValor(double[] vetor) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quais são os 12 valores: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextDouble();
        }
        teclado.close();
    }

    public static void ajusVetor(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] *= 1.02;
            } else {
                vetor[i] *= 1.05;
            }
        }
    }

    public static void atualizado(double[] vetor) {
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("o vetor resultante e :");
        for (double valor : vetor) {
            System.out.println(df_2.format(valor));
        }

    }
}
