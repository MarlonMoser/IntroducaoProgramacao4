import java.util.Scanner;

public class Uni6Exe1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numInt = new int[10];
        lerValores(numInt);
        escrValores(numInt);

        teclado.close();

    }

    public static void lerValores(int[] numInt) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("insira os 10 valores:");
        for (int i = 0; i < numInt.length; i++) {
            numInt[i] = teclado.nextInt();
        }
        teclado.close();
    }

    public static void escrValores(int[] numInt) {
        for (int i = 0; i < numInt.length; i++) {
            System.out.println(numInt[i]);
        }
        System.out.println(" ");
        for (int o = 10 - 1; o >= 0; o--) {
            System.out.println(numInt[o]);
        }
    }

}
